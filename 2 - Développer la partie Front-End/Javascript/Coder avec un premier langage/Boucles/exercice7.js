/**
 * Exercise 7
 * Ecrire un programme qui calcule les N premiers multiples d'un nombre entier X, N et X étant entrés au clavier.
 */
const multiples = () => {
  const number = prompt("Entrez un nombre.");
  const n = prompt("Combien de multiples voulez-vous ?");

  for (let i = 1; i <= n; i++) {
    console.log(`${i} x ${number} = ${i * number}`);
  }
};