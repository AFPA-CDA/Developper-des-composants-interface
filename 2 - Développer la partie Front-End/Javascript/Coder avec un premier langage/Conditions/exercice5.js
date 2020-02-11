
/**
 * Exercise 5
 * Un patron décide de calculer le montant de sa participation au prix du repas de ses employés de la façon suivante :
 * si il est célibataire : participation de 20%
 * si il est marié : participation de 25%
 * si il a des enfants : participation de 10% supplémentaires par enfant
 * la participation est plafonnée à 50%
 * si le salaire mensuel est inférieur à 1200 €, la participation est majorée de 10%.
 * Ecrire le programme qui lit les informations au clavier et affiche pour chaque salarié, la participation à laquelle il a droit.
 */
const participation = () => {
  let childrenNumber = null;
  let participation = null;

  const single = confirm("Êtes vous célibataire ?");
  const married = confirm("Êtes vous marié ?");

  // If the user is single and married throw an error
  if (single && married) {
    throw new Error("Vous ne pouvez pas être célibataire et marié.");
  } else if (!single && !married) {
    throw new Error("Vous devez être soit marié soit célibataire.");
  }

  const children = confirm("Avez vous des enfants ?");

  // If the user has children we ask him how much he has
  if (children) {
    childrenNumber = parseInt(prompt("Combien avez vous d'enfants ?"));
  }

  const lowSalary = confirm("Touchez vous moins de 1200€ ?");

  // We now calculate the %
  if (single) participation += 20;
  if (married) participation += 25;
  if (lowSalary) participation += 10;

  // For each child we add 10%
  for (let i = 0; i < childrenNumber; i++) {
    participation += 10;
  }

  // The user can't have more than 50%
  if (participation > 50) participation = 50;

  console.log(
    `Le patron prends en charge ${participation}% du prix de votre repas.`
  );
};

