const average = () => {
  let numbers;
  let sum = 0;
  let totalOperations = 0;

  // Ask the user for numbers until he gives a 0
  do {
    numbers = parseInt(prompt("Donnez un nombre."));
    sum += numbers;
    totalOperations++;
  } while (numbers !== 0);

  const avg = sum / (totalOperations - 1);

  console.log(
    `Moyenne: ${avg} | Somme: ${sum} | Opérations: ${totalOperations - 1}`
  );
};