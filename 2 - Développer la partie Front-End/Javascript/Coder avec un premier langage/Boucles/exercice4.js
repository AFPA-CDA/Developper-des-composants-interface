/**
 * Exercise 4
 * Ecrire un programme qui saisit deux nombres n1 et n2 et qui calcul ensuite la somme des entiers de n1 à n2.
 */
const intervals = () => {
  const n1 = parseInt(prompt("Entrez le plus grand nombre."));
  const n2 = parseInt(prompt("Entrez le plus petit nombre."));

  let numbers = [];

  // We fill the array with the user inputs
  for (let i = n1; i >= n2; i--) {
    numbers.push(i);
  }

  // We reduce the array to the sum of its elements
  const result = numbers.reduce((a, b) => a + b);

  console.log(result);
};