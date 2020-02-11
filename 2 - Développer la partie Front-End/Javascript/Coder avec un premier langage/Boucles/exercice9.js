/**
 * Exercice 9
 * Il s'agit de dénombrer les personnes d'âge strictement inférieur à 20 ans,
 * les personnes d'âge strictement supérieur à 40 ans et celles dont
 * l'âge est compris entre 20 ans et 40 ans (20 ans et 40 ans y compris).
 * Le programme doit demander les âges successifs.
 * Le comptage est arrêté dès la saisie d'un centenaire. Le centenaire est compté.
 */
const calculateAge = () => {
  let age;
  let infVingtaine = 0;
  let supQuarantaine = 0;
  let toutAge = 0;

  while (age !== 100) {
    age = parseInt(prompt("Veuillez donner un âge."));

    // Depending on the current age we increment the correct variable
    if (age < 20) {
      infVingtaine++;
    } else if (age > 40) {
      supQuarantaine++;
    } else {
      toutAge++;
    }
  }

  console.log(
    `- 20 ans : ${infVingtaine} | + 40 ans : ${supQuarantaine} | 20-40 ans : ${toutAge}`
  );
};