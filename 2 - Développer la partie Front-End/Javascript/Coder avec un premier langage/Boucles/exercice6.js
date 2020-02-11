/**
 * Exercise 6
 * Ecrire un programme qui saisit des entiers et en affiche la somme et la moyenne (on arrête la saisie avec la valeur 0).
 */

const minAndMax = () => {
  let numbers;
  let numbersArray = [];
  let sum = 0;
  let iterations = 0;

  do {
    numbers = parseInt(prompt("Donnez un nombre."));
    // Adds each number given by the user
    sum += numbers;
    iterations++;
    // If the value is not equal to 0 we push  the value into the array
    if (numbers !== 0) numbersArray.push(numbers);
  } while (numbers !== 0);

  // Returns the greatest integer less than or equal to its numeric argument
  const avg = Math.floor(sum / (iterations - 1));
  const min = Math.min(...numbersArray);
  const max = Math.max(...numbersArray);

  console.log(`Moyenne: ${avg} | Somme: ${sum} | Min: ${min} | Max: ${max}`);
};