/**
 * Exercise 4
 * A partir de la saisie du prix unitaire noté PU d'un produit et de la quantité commandée QTECOM,
 * afficher le prix à payer PAP, en détaillant le port PORT et la remise REM, sachant que :
 * le port est gratuit si le prix des produits TOT est supérieur à 500 €. Dans le cas contraire, le port est de 2% de TOT
 * la valeur minimale du port à payer est de 6 €
 * la remise est de 5% si TOT est compris entre 100 et 200 € et de 10% au-delà
 */
const totalOrder = () => {
  const PU = parseInt(prompt("Veuillez saisir le prix unitaire du produit."));
  const QTECOM = parseInt(prompt("Veuillez entrer la quantité voulue."));

  const TOT = PU * QTECOM;

  let PAP = 0;
  let PORT = 0;
  let REM = 0;

  if (TOT < 500) {
    PORT = TOT * 0.02; // Since TOT is smaller than 500€ PORT is equal to 2%
    if (PORT < 6) PORT = 6; // The PORT can't be lesser than 6€
  } else if (TOT >= 100 && TOT <= 200) {
    REM = TOT * 0.05;
  } else {
    REM = TOT * 0.1;
  }

  PAP = TOT + PORT - REM; // We calculate the total price

  console.log(`Le prix total à payer est de : ${PAP}€`);
};