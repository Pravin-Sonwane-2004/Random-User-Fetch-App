document.getElementById("btn").addEventListener("click", getUser);

async function getUser() {
  const userDiv = document.getElementById("user");

  userDiv.innerHTML = "Loading...";

  try {
    const response = await fetch("https://randomuser.me/api/");

    if (!response.ok) {
      throw new Error("API failed");
    }

    const data = await response.json();

    console.log(data);

    const user = data.results[0];

    userDiv.innerHTML = `
      <img src="${user.picture.medium}" />
      <h2>${user.name.first} ${user.name.last}</h2>
      <p>${user.email}</p>
    `;
  } catch (error) {
    userDiv.innerHTML = "Error fetching data";
    console.error(error);
  }
}