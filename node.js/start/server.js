const http = require("http");
const server = http.createServer((req, res) => {
    res.end("Hello");
});
server.listen(3000)
//sudo apt install nodejs
//sudo apt insall npm
//node server.js