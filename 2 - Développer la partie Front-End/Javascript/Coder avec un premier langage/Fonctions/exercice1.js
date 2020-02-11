/**
 * Exercice 1
 * Créer une fonction qui affiche l’image passée en paramètre
 */
const afficheImg = image => {
  // Creates an image element
  const img = document.createElement("img");
  // Sets the source with the given argument
  img.src = String(image);
  // Appends the img element to the div with the id image
  document.getElementById("image").appendChild(img);
};

/**
 * Créer une fonction qui retourne le produit des 2 variables x, ypassées en paramètre.
 */
const produit = (x, y) => x * y;

document.getElementById("result").innerHTML = produit(3, 5);

afficheImg("./assets/img/papillon.jpg");