/**
 * Exercise 4
 * Concevez la fonction strtok qui prend 3 paramètres str1, str2, n en entrée et renvoie une chaîne de caractères
 * str1 est composée d’une liste de mots séparés par le caractère str2.
 */
const strtok = (str1, str2, n) => {
  // Changes the string into an array with str2 as a delimiter
  const result = str1.split(str2);
  return result[n];
};