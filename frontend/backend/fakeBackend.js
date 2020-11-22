const faker = require('faker');

let Name = faker.name.findName();
let Id = faker.random.number();
let currDate = new Date();
let DateOfBirth = faker.date.recent(33000, currDate);

//console.log(Name, Id, DateOfBirth);


