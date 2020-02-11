// Ask the user for their names and firstNames
const name = prompt("Entrez votre nom");
const firstName = prompt("Entrez votre prénom");

// Ask the user for their genders
const male = confirm("Êtes-vous un homme ?");

// If the user is a male we return "Monsieur" else "Madame"
const gender = male ? "Monsieur" : "Madame";

alert(`Bonjour ${gender} ${name} ${firstName}\nBienvenue sur notre site web !`);
