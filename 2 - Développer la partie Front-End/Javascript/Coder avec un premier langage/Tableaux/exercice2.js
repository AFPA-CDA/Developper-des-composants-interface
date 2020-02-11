// Exercise 2
const GetInteger = n => {
  return parseInt(prompt(`Entrez le nombre n°${n}`));
};

const InitTab = () => {
  let length = parseInt(prompt("Quelle taille pour le tableau ?"));
  return Array(length);
};

const SaisieTab = tab => {
  for (let i = 0; i < tab.length; i++) {
    tab[i] = GetInteger(i + 1);
  }
};

const AfficheTab = tab => {
  for (let value of tab) {
    console.log(value);
  }
};

const RechercheTab = tab => {
  const index = parseInt(prompt("Quel est l'élément que vous cherchez ?"));
  console.log(tab[index - 1]);
};

const InfoTab = tab => {
  const avg = tab.reduce((a, b) => a + b) / tab.length;
  const tabMax = Math.max(...tab);

  console.log(`Max: ${tabMax} | Moyenne: ${avg}`);
};