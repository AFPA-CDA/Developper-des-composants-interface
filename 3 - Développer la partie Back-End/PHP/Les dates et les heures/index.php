<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Les dates et les heures</title>
</head>

<body>
<section>
  <h1>Exercice 1</h1>
  <h3>Trouvez le numéro de semaine de la date suivante : 14/07/2019.</h3>

  <?php
  $date = new DateTime("2019-07-14");
  $weekNumber = $date->format("W");
  ?>

  <p>Numéro de la semaine: <?= $weekNumber; ?></p>
</section>

<hr>

<section>
  <h1>Exercice 2</h1>
  <h3>Combien reste-t-il de jours avant la fin de votre formation ?</h3>

  <?php
  $actualDate = new DateTime();
  $endDate = new DateTime("2020-09-25");
  $daysBeforeEnd = $endDate->diff($actualDate)->days;
  ?>

  <p>Jours avant la fin de la formation: <?= $daysBeforeEnd; ?></p>
</section>

<hr>

<section>
  <h1>Exercice 3</h1>
  <h3>Comment déterminer si une année est bissextile ?</h3>

  <?php
  $currentDate = new DateTime();
  $isLeap = $currentDate->format('L');
  ?>

  <?php if($isLeap): ?>
    <p>L'année <?= $currentDate->format("Y") ?> est bissextile</p>
  <?php else: ?>
    <p>L'année <?= $currentDate->format("Y") ?> n'est pas bissextile</p>
  <?php endif; ?>
</section>

<hr>

<section>
  <h1>Exercice 4</h1>
  <h3>Montrez que la date du 32/17/2019 est erronée.</h3>

  <?php
  $invalidDate = DateTime::createFromFormat("d/m/Y", "32/17/2019");
  $errors = DateTime::getLastErrors();
  ?>

  <p>
    <?php if ($errors["error_count"] > 0 || $errors["warning_count"] > 0): ?>
      <?php foreach($errors["warnings"] as $warning): ?>
        <?= $warning; ?>
      <?php endforeach; ?>
    <?php endif; ?>
  </p>
</section>

<hr>

<section>
  <h1>Exercice 5</h1>
  <h3>Affichez l'heure courante sous cette forme : 11h25.</h3>

  <?php
  $currentDate = new DateTime();
  ?>

  <p><?= $currentDate->format("H\hi e") ?></p>
</section>

<hr>

<section>
  <h1>Exercice 6</h1>
  <h3>Ajoutez 1 mois à la date courante.</h3>

  <?php
  $modifiedDate = new DateTime();
  $modifiedDate->add(DateInterval::createFromDateString("1 months"));
  ?>

  <p>Date actuelle: <?= date("d/m/Y"); ?></p>
  <p>Date avec 1 mois ajouté: <?= $modifiedDate->format("d/m/Y"); ?></p>
</section>

</body>
</html>
