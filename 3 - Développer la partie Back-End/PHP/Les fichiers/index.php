<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Les fichiers</title>
</head>

<body>
<section>
  <h1>Exercice 1</h1>
  <h3>Lecture d'un fichier.</h3>

  <?php
  $lines = file("../../files/liens.txt");
  ?>

  <?php foreach ($lines as $line_num => $line): ?>
    <p>
      Ligne <?= ++$line_num; ?>: <?= htmlspecialchars($line); ?>
    </p>
  <?php endforeach; ?>
</section>

<hr>

<section>
  <h1>Exercice 2</h1>
  <h3>Récupération d'un fichier distant.</h3>

  <?php
  $file = file("http://bienvu.net/misc/customers.csv");
  $csv = array_map('str_getcsv', $file);
  asort($csv);
  ?>

  <table>
    <thead>
    <tr>
      <th>Firstname</th>
      <th>Surname</th>
      <th>Email</th>
      <th>Phone</th>
      <th>City</th>
    </tr>
    </thead>
    <tbody>
    <?php foreach ($csv as $csv_value): ?>
      <tr>
        <td><?= $csv_value[0] ?></td>
        <td><?= $csv_value[1] ?></td>
        <td><?= $csv_value[2] ?></td>
        <td><?= $csv_value[3] ?></td>
        <td><?= $csv_value[4] ?></td>
      </tr>
    <?php endforeach; ?>
    </tbody>
  </table>
</section>

</body>
</html>
