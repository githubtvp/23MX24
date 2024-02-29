const { MongoClient } = require('mongodb');
const mongoDB = require('mongoose');
//const url = "mongodb://127.0.0.1/exampleDB";
const url = "mongodb://127.0.0.1/my_database";

async function main(){
    const client = new MongoClient(url);
    try{
        await client.connect();
        console.log("DB Connected");
       // await listDatabases(client);
       await appendOneRec(client, {
        name : "NewName4",
        age : 51,
        dob : 26-12-2023,
        native: "Tuti"
       })
    }
    catch(e){
        console.error("DB connect error");
        console.error(e)
    }
    finally{
        console.log("\nClosing DB...\n");
        await client.close();
    }
}

main().catch(console.error);

async function appendOneRec(client, oneRec)
{
   // const result = await client.db("my_databse").collection("friends").insertOne(newRec);
    const result = await client.db().collection("friends").insertOne(oneRec);
    console.log(`\nNew record created with Id : ${result.insertedId}`);
}

async function appendManyRec(client, manyRecs)
{
   // const result = await client.db("my_databse").collection("friends").insertOne(newRec);
    const result = await client.db().collection("friends").insertMany(manyRecs);

    console.log(`\n${result.insertedId}`);
}

async function listDatabases(client)
{
    const dbList = await client.db().admin().listDatabases();
    console.log("\nDatabases : \n");
    dbList.databases.forEach(db => {
        console.log(`- ${db.name}`);        
    });
}