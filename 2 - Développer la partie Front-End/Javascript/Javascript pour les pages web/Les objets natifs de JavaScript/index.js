/**
 * Native Objects Exercise
 */
const nativeObjects = () => {
  let numbers;
  let iterations = 0;

  const values = [];

  // Run the loop until the users gives a 0
  do {
    numbers = parseInt(prompt("Entrez une valeur numérique."));
    values.push(numbers);
    iterations++;
  } while (numbers !== 0);

  // Sums all of the values in the array
  const sum = values.reduce((a, b) => a + b);
  // Calculates the average based on the sum and the iterations
  const average = sum / (iterations - 1);

  console.log(
    `Nombre Valeurs: ${iterations - 1} | Somme: ${sum} | Moyenne: ${average}`
  );
};