<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Control Flow et Boucles</title>
</head>

<body>
  <style>
    table, th, tr {
      border: 1px solid black;
    }
  </style>

<section>
  <h1>Exercice 1</h1>
  <h3>Ecrire un script PHP qui affiche tous les nombres impairs entre 0 et 150, par ordre croissant : 1 3 5 7...</h3>
  <?php
    foreach(range(1, 150, 2) as $number) {
      echo "$number\n";
    }
  ?>
</section>

<hr>
  
<section>
  <h1>Exercice 2</h1>
  <h3>Écrire un programme qui écrit 500 fois la phrase Je dois faire des sauvegardes régulières de mes fichiers.</h3>
  <?php
    for ($i = 1; $i <= 500; $i++) {
      echo "<p>Je dois faire des sauvegardes régulières de mes fichiers</p>";
    }
  ?>
</section>

<hr>

<section>
  <h1>Exercice 3</h1>
  <h3>Ecrire un script qui affiche la table de multiplication totale de {1,...,12} par {1,...,12}</h3>
  <table>
    <thead>
      <tr>
        <?php
          foreach(range(-1, 12) as $i) {
            if ($i == -1) $i = '';
            echo "<th> $i </th>";
          }
        ?>
      </tr>
    </thead>
    <tbody>
      <?php
        foreach(range(0, 12) as $i) {
          for ($j = 0; $j < 13; $j++) {
            ${"mult$j"} = $i * $j;
          }

          echo "
          <tr>
            <th>$i</th>
            <th>$mult0</th>
            <th>$mult1</th>
            <th>$mult2</th>
            <th>$mult3</th>
            <th>$mult4</th>
            <th>$mult5</th>
            <th>$mult6</th>
            <th>$mult7</th>
            <th>$mult8</th>
            <th>$mult9</th>
            <th>$mult10</th>
            <th>$mult11</th>
            <th>$mult12</th>
          </tr>";
        }
      ?>
    </tbody>
  </table>
</section>

</body>
</html>
