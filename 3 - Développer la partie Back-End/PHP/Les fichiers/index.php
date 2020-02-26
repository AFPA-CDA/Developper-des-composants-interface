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
  // Reads the file and return an array each element being a line of the file
  $lines = file("../../files/liens.txt");
  ?>

  <!-- Foreach lines in the file -->
  <?php foreach ($lines as $line_num => $line): ?>
    <p>
      <!-- It prints the line num and the current line of the file -->
      Ligne <?= ++$line_num; ?>: <?= htmlspecialchars($line); ?>
    </p>
  <?php endforeach; ?>
</section>

<hr>

<section>
  <h1>Exercice 2</h1>
  <h3>Récupération d'un fichier distant.</h3>

  <?php
  // Reads the file and return an array each element being a line of the file
  $file = file("http://bienvu.net/misc/customers.csv");
  // Returns a new array with the function str_getcsv applied on each element
  $csv = array_map('str_getcsv', $file);
  // Sorts the array by the values in a ascending way
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
      <th>State</th>
    </tr>
    </thead>
    <tbody>
    <!-- Foreach row we create a tr -->
    <?php foreach ($csv as $csv_row): ?>
      <tr>
        <!-- In each row we put the value in a td -->
        <?php foreach ($csv_row as $csv_value): ?>
          <td><?= $csv_value ?></td>
        <?php endforeach; ?>
      </tr>
    <?php endforeach; ?>
    </tbody>
  </table>
</section>

</body>
</html>
