/**
 * Exercise 1
 * Créer une page HTML qui demande à l'utilisateur un prénom.
 * La page doit continuer à demander des prénoms à l'utilisateur jusqu'à ce qu'il laisse le champ vide.
 * Enfin, la page affiche sur la console le nombre de prénoms et les prénoms saisis.
 */
const firstNameArray = [];
let firstName;

let i = 1;

do {
  firstName = prompt(`Saisissez le prénom N°${i}`);
  if (firstName !== "") firstNameArray.push(firstName);
  i++;
} while (firstName !== "");

alert(
  `Nombre de prénoms: ${firstNameArray.length} | Prénoms : ${firstNameArray}`
);