/**
 * Exercise 3
 * Faire la saisie de 2 nombres entiers, puis la saisie d'un opérateur +, -, * ou /.
 * Si l'utilisateur entre un opérateur erroné, le programme affichera un message d'erreur.
 * Dans le cas contraire, le programme effectuera l'opération demandée (en prévoyant le cas d'erreur division par 0), puis affichera le résultat.
 */
const calculate = () => {
  const nb1 = parseInt(prompt("Entrez le premier nombre."));
  const nb2 = parseInt(prompt("Entrez le second nombre."));
  const operation = prompt("Entrez l'opérateur voulu.");

  switch (operation) {
    case "+":
      return nb1 + nb2;
    case "-":
      return nb1 - nb2;
    case "*":
      return nb1 * nb2;
    case "/":
      // If the second number is zero we throw an error
      if (nb2 === 0) throw new Error("Vous ne pouvez pas diviser par zéro.");
      return nb1 / nb2;
    default:
      // If no operators are given we throw an error
      throw new Error(
        "Votre opérateur n'existe pas ou n'est pas supporté par le programme."
      );
  }
};
