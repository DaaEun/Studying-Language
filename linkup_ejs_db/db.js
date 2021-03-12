const mysql = require('mysql'); 

const connection = mysql.createConnection({ 
    host:'localhost', 
    user:'root', 
    password:'123456', 
    port:3306, 
    database:'NODE_DB' 
});

function getAllMemos(callback){ 
    connection.query(`SELECT * FROM MEMOS ORDER BY ID DESC`, (err, rows, fields) => {
        if(err) throw err; 
        callback(rows); 
    }); 
} 

module.exports = { 
    getAllMemos 
}
