const { MongoClient } = require("mongodb");
const mongoDB = require("mongoose");
const cli = require("nodemon/lib/cli");
//const url = "mongodb://127.0.0.1/exampleDB";
const url = "mongodb://127.0.0.1/my_database";

async function main() {
  const client = new MongoClient(url);
  try {
    await client.connect();
    console.log("DB Connected");
    // await listDatabases(client);

    // await appendOneRec(client, {
    //     name : "NewName4",
    //     age : 51,
    //     dob : 26-12-2023,
    //     native: "Tuti"
    //    })

    // await appendManyRec(client, [
    //   {
    //     name: "NewName5",
    //     age: 62,
    //     dob: "26-1-2023",
    //     native: "Tuti",
    //   },
    //   {
    //     name: "NewName6",
    //     age: 41,
    //     dob: "26-2-2023",
    //     native: "Tuti",
    //   },
    //   {
    //     name: "NewName7",
    //     age: 31,
    //     dob: "26-3-2023",
    //     native: "Tuti",
    //   }
    // ]);

   // await getOneRec(client, "NewName5"); 
   // await getManyRec(client, {ageMin : 40, maxNo : 3});
   await updateOneRec(client, "NewName5", {age : 55, dob: '01-05-2000'});
  } catch (e) {
    console.error("DB connect error");
    console.error(e);
  } finally {
    console.log("\nClosing DB...\n");
    await client.close();
  }
}

main().catch(console.error);


async function updateOneRec(client, aName, updateValues)
{
    const result = await client.db().collection("friends").updateOne({name : aName}, {$set : updateValues});
    console.log(`${result.matchedCount} records matched the queru criteria`);
    console.log(`${result.modifiedCount} records were updated`);  
}
async function getManyRec(client, {ageMin = 0, maxNo = 0} = {}) 
{
    const cursor = await client.db().collection("friends").find({age : {$gte: ageMin}}).sort({name : -1}).limit(maxNo);
    const results = await cursor.toArray();
    if(results.length > 0)
    {
        console.log(`Found ${results.length} records with minimum age as : ${ageMin}`);
        results.forEach((result, i)=>{console.log(result)})             
    }
    else{
        console.log(`Records with minimum age ${ageMin} not found`);
    }
}



async function getOneRec(client, aName)
{
    const result = await client.db().collection("friends").findOne({name : aName});
    if(result)
    {
        console.log(`Found a record with name : ${aName}`);
        console.log(result);        
    }
    else{
        console.log(`${aName} not found`);
    }
}


async function appendOneRec(client, oneRec) {
  // const result = await client.db("my_databse").collection("friends").insertOne(newRec);
  const result = await client.db().collection("friends").insertOne(oneRec);
  console.log(`\nNew record created with Id : ${result.insertedId}`);
}

async function appendManyRec(client, manyRecs) {
  // const result = await client.db("my_databse").collection("friends").insertOne(newRec);
  const result = await client.db().collection("friends").insertMany(manyRecs);

  console.log(`\n${result.insertedCount} new records inserted with following id(s) : `);
  console.log("\t");
  console.log(result.insertedIds);
}

async function listDatabases(client) {
  const dbList = await client.db().admin().listDatabases();
  console.log("\nDatabases : \n");
  dbList.databases.forEach((db) => {
    console.log(`- ${db.name}`);
  });
}
