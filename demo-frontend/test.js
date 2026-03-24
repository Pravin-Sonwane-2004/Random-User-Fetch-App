const users = [
  { id: 1, name: "A", active: true },
  { id: 2, name: "B", active: false },
  { id: 3, name: "C", active: true }
];
  let newArray = [];

for(let i =0;i<users.length;i++) {
    if(users[i].active) {
        newArray.push(users[i]);
    }
}
console.log(newArray);

for(let i =0;i<users.length;i++) {
    if(users[i].active) {
        newArray[i] =  users[i];
        console.log(newArray[i].name);
    }
}
//Count active users (using reduce)// i can easily use counter but i dont know what is reducer is


