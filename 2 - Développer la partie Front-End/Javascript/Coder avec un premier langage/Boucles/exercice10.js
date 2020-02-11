/**
 * Exercise 10
 * Ecrivez un programme qui permet de tester si un nombre est premier.
 */
const isPrime = () => {
  const num = prompt("Entrez un nombre.");

  for (let i = 2, s = Math.sqrt(num); i <= s; i++) {
    if (num % i === 0) return false;
  }

  return num > 1;
};