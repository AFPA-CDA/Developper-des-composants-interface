<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Phase 1 - Exercices</title>
</head>
<body>
<section>
  <p>
    Adresse Serveur
    <b>
      <?= $_SERVER["SERVER_ADDR"] ?>
    </b>
  </p>

  <hr>

  <p>
    Adresse Client
    <b>
      <?= $_SERVER["REMOTE_ADDR"] ?>
    </b>
  </p>
</section>
</body>
</html>