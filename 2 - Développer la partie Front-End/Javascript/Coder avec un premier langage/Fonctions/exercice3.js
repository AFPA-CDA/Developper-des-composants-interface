/**
 * Exercise 3
 * Ecrivez une fonction qui prend deux paramètres :
 * phrase de type string
 * lettre de type string
 * La fonction compte le nombre de fois ou lettreapparaît dans phrase
 */
const lettersOccurrence = (phrase, lettre) => {
  let letterCount = 0;

  for (let i = 0; i < phrase.length; i++) {
    if (phrase.charAt(i).toLowerCase() === lettre.toLowerCase()) {
      letterCount++;
    }
  }

  return letterCount;
};