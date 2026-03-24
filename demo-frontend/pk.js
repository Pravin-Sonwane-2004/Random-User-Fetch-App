// const btn = document.getElementById("btn");
// const div = document.getElementById("main-div");
// const deletebtn = document.getElementById("deletebtn");

//  async function fetchData() {
//     const data = await fetch("http://localhost:8080/users");
//     const actual = await data.json();
//     console.log(actual);
//     return actual; // IMPORTANT
//   }
  // const jobs = await fetch("http://localhost:8080/users").then(res => res.json());

  // console.log(jobs);

  // btn.addEventListener("click", async () => {
  //   const users = await fetchData(); // WAIT for data
  //   div.innerHTML = "";   //this will clear previous one
  //     users.forEach(user => {
  //       const userDiv = document.createElement("div");
  //       userDiv.innerHTML = `
  //     <p>${user.id}</p>
  //     <p>${user.name}</p>
  //     <p>${user.email}</p>
      
  //   `;
  //      // 🔥 create delete button
  //   const deleteBtn = document.createElement("button");
  //   deleteBtn.innerText = "Delete";

  //   // 🔥 attach event to THIS button
  //   deleteBtn.addEventListener("click", () => {
  //     userDiv.remove();
  //   });

  //   userDiv.appendChild(deleteBtn);

  //   userDiv.style.border = "1px solid black";
  //   userDiv.style.margin = "5px";
  //   userDiv.style.padding = "5px";
  //   userDiv.style.backgroundColor = "pink";

  //   div.appendChild(userDiv);
         
  //     });
  // });
