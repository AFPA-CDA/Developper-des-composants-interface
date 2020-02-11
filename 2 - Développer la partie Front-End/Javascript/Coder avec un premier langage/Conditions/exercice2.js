
/**
 * Exercise 2
 * Ecrivez un programme qui demande l'année de naissance à l'utilisateur.
 * En réponse votre programme doit afficher l'âge de l'utilisateur et indiquer si l'utilisateur est majeur ou mineur.
 */
const age = () => {
  const year = prompt("Entrez votre année de naissance.");

  if (year <= 2001) {
    console.log("Vous êtes majeur.");
  } else {
    console.log("Vous êtes mineur.");
  }
};

