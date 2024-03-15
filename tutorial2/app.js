const express = require('express');
const { MongoClient } = require("mongodb");
const mongoose = require("mongoose");

const app = express();
const port = 3000;
const url = "mongodb://127.0.0.1/my_database";

// Set the view engine to EJS
app.set('view engine', 'ejs');

// Specify the directory where your EJS files are located
app.set('views', __dirname + '/views');

// Define your routes and other functionalities here...

// Example route to render the EJS file
app.get('/', (req, res) => {
    res.render('index', { title: 'Book Management System' }); // Render the index.ejs file
});

// Start the server
app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});
