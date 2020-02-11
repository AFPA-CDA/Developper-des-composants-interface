/**
 * Exercise 8
 * Ecrire le programme qui compte le nombre de voyelles d’un mot saisi au clavier.
 */
const vowels = () => {
  let vowelsCount = 0;
  const vowels = "aeiouy";

  const word = prompt("Entrez un mot.");

  // We make a loop that looks at each letter in the given word
  for (let i = 0; i < word.length; i++) {
    // If the letter is a vowel we increment the vowelsCount
    if (vowels.indexOf(word[i].toLowerCase()) !== -1) {
      vowelsCount++;
    }
  }

  console.log(`Le mot contient ${vowelsCount} voyelles.`);
};