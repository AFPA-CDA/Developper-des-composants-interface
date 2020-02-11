/**
 * Exercise 1
 * Ecrivez un programme permettant de créer un tableau, dont la taille est saisie au clavier.
 * Ensuite l'utilisateur doit rentrer les différentes valeurs du tableau.
 * Puis votre programme doit afficher le contenu du tableau.
 */
const createArray = () => {
  let value;

  const size = parseInt(prompt("Veuillez donner la taille du tableau."));

  // Creates an array with the given size
  const createdArray = new Array(size);

  // Creates a loop that run until the array has been filled
  for (let i = 0; i < size; i++) {
    value = prompt(`Veuillez entrer la valeur n°${i + 1}`);
    createdArray[i] = value;
  }

  console.log(createdArray);
};