/**
 * Exercise 2
 * Ecrire un programme qui affiche les nombres inférieurs à N.
 */
const belowN = () => {
  const n = prompt("Donnez un nombre.");

  // Creates a loop that lists every number below N
  for (let i = n - 1; i > 0; i--) {
    console.log(i);
  }
};