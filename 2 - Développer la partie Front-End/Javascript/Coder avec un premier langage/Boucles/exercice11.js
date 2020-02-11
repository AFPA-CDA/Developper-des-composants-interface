/**
 * Exercise 11
 * Ecrire un programme qui met en œuvre le jeu du nombre magique :
 * L'ordinateur choisit un nombre aléatoire
 * L'utilisateur doit trouver ce nombre.
 * A chaque fois que l'utilisateur saisit une valeur, il reçoit une indication lui indiquant plus petit ou plus grand.
 */
const magicNumber = () => {
  let tries = 1;

  // We generate the random number
  const magic = Math.floor(Math.random() * 100) + 1;

  let guess = prompt("Entrez un nombre entre 0 et 100.");

  while (guess !== magic) {
    if (guess > magic) {
      console.log("Plus petit.");
    } else if (guess < magic) {
      console.log("Plus grand.");
    } else {
      console.log(`Bravo vous avez réussi à deviner en ${tries} essais !`);
      // If the users wins we break out of the loop after giving him a message
      break;
    }

    // We increment the tries variable each time the user gives a number
    tries++;

    // We ask the user to give a number until he is right
    guess = prompt("Entrez un nombre entre 0 et 100.");
  }
};