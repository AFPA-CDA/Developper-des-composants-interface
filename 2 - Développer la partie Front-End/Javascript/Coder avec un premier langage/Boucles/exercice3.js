/**
 * Exercise 3
 * Ecrire un programme qui affiche la somme des nombres inférieurs à N.
 */
const belowNSum = () => {
  const n = prompt("Donnez un nombre.");
  const numArray = []

  // Creates a loop that lists every number below N
  for (let i = n - 1; i > 0; i--) {
    numArray.push(i)
  }

  const sum = numArray.reduce((a, b) => a + b)

  console.log(`Somme des nombres inférieurs à N : ${sum}`)
};