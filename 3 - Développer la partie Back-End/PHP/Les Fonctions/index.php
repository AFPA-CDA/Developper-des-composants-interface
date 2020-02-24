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
  function lien(string $lien, string $titre): string
  {
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
  function somme(array $tableau): int
  {
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
  function complex_password(string $password): bool
  {
    if (strlen($password) < 8) {
      return false;
    } else if (!preg_match("/[0-9]/", $password)) {
      return false;
    } else if (!preg_match("/[a-z][A-Z]/", $password)) {
      return false;
    } else {
      return true;
    }
  }
  
  $result = complex_password("TopSecret42");
  var_dump($result);
  ?>
</section>

</body>
</html>
