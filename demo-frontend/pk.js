const getUser = document.getElementById("btn");
const user = document.getElementById("user");
const div = document.getElementById("main-div");

async function fetchData() {
  const data = await fetch("http://localhost:8080/users");
  console.log(data);
  const actual = await data.json();
    console.log(actual);
}

btn.addEventListner ("click" , () => {
const divv = document.createElement("newDiv");
divv.innerText = "All";
div.appendChild(div);
}) ;
