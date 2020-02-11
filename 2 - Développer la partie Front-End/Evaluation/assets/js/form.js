// Get Forms
const mainForm = document.forms["mainForm"];

const verify = () => {
  let hasErrors = [];

  // Here lies all the regex used for this form
  const isAlpha = /^[\wÀÂÆÇÉÈÊËÏÑÎÔŒÙÛÜŸ\'’ -]+$/i;
  const isEmail = /(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))/g;
  const isPostal = /^\d{2}\s?\d{3}$/g;

  // Gets all the error elements in order to show the elements
  const emailError = document.getElementById("emailError");
  const firstNameError = document.getElementById("firstNameError");
  const nameError = document.getElementById("nameError");
  const postalError = document.getElementById("postalError");

  // Gets all the forms element values
  const email = document.getElementsByName("email")[0].value;
  const firstName = document.getElementsByName("firstName")[0].value;
  const name = document.getElementsByName("name")[0].value;
  const postal = document.getElementsByName("postal")[0].value;

  // Checks is lastName is valid and if it's not empty
  if (isAlpha.test(name) === false && name !== "") {
    nameError.innerText = "Le nom n'est pas valide.";
    nameError.style.display = "inline";
    hasErrors[0] = true;
  } else if (name === "") {
    nameError.innerText = "Le nom est requis.";
    nameError.style.display = "inline";
    hasErrors[0] = true;
  } else {
    nameError.style.display = "none";
    hasErrors[0] = false;
  }

  // Checks if name is valid and if it's not empty
  if (isAlpha.test(firstName) === false && firstName !== "") {
    firstNameError.innerText = "Le prénom n'est pas valide.";
    firstNameError.style.display = "inline";
    hasErrors[1] = true;
  } else if (firstName === "") {
    firstNameError.innerText = "Le prénom est requis.";
    firstNameError.style.display = "inline";
    hasErrors[1] = true;
  } else {
    firstNameError.style.display = "none";
    hasErrors[1] = false;
  }

  // Checks if postal is valid and if it's not empty
  if (isPostal.test(postal) === false && postal !== "") {
    postalError.innerText = "Le code postal n'est pas valide.";
    postalError.style.display = "inline";
    hasErrors[2] = true;
  } else {
    postalError.style.display = "none";
    hasErrors[2] = false;
  }

  // Checks if the email is valid and if it's not empty
  if (isEmail.test(email) === false && email !== "") {
    emailError.innerText = "L'email n'est pas valide.";
    emailError.style.display = "inline";
    hasErrors[2] = true;
  } else if (email === "") {
    emailError.innerText = "L'email est requis.";
    emailError.style.display = "inline";
    hasErrors[2] = true;
  } else {
    emailError.style.display = "none";
    hasErrors[2] = false;
  }

  return hasErrors;
};

mainForm.addEventListener("submit", function(e) {
  // Prevents the user from submitting the form
  e.preventDefault();

  // We verify the user input
  const hasErrors = verify();

  // If the inputs contains errors we return false else we return true
  const isValid = hasErrors.includes(true) ? false : true;

  // If the form is valid we then submit it
  if (isValid) {
    mainForm.submit();
  }
});
