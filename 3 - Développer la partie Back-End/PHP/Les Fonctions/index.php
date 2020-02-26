<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Les Fonctions</title>
</head>

<body>
<section>
  <h1>Exercice 1</h1>
  <h3>Ecrivez une fonction qui permette de générer un lien.</h3>

  <?php
  // Takes a link and a title
  function lien(string $lien, string $titre): string
  {
    // Returns a html link with the given parameters
    return "<a href='$lien'>$titre</a>";
  }

  echo lien("https://www.reddit.com/", "Reddit Hub");
  ?>
</section>

<hr>

<section>
  <h1>Exercice 2</h1>
  <h3>Ecrivez une fonction qui calcul la somme des valeurs d'un tableau.</h3>

  <?php
  // Takes an array
  function somme(array $tableau): int
  {
    // Returns the sum of all elements in the array
    return array_sum($tableau);
  }

  echo somme(array(4, 3, 8, 2));
  ?>
</section>

<hr>

<section>
  <h1>Exercice 3</h1>
  <h3>Créer une fonction qui vérifie le niveau de complexité d'un mot de passe.</h3>

  <?php
  // Takes the password as a string
  function complex_password(string $password): bool
  {
    // If the password is less than 8 caracters it returns false
    if (strlen($password) < 8) {
      return false;
    } else if (!preg_match("/[0-9]/", $password)) {
      // If the password don't have any numeric characters it returns false
      return false;
    } else if (!preg_match("/[a-z][A-Z]/", $password)) {
      // If the password don't have any alphanumeric characters it return false
      return false;
    } else {
      // The password is complex so it return true
      return true;
    }
  }
  
  $result = complex_password("TopSecret42");
  var_dump($result);
  ?>
</section>

</body>
</html>
