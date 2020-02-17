<!DOCTYPE html>
<html lang="fr">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Tableaux</title>
  </head>

  <body>
    <style>
      table,
      th,
      td,
      tr {
        border: 2px solid black;
        font-weight: normal;
      }
    </style>

    <section>
      <h1>Exercice 1</h1>

      <h3>
        Créez un tableau associant à chaque mois de l’année le nombre de jours
        du mois.
      </h3>

      <?php
      $monthAndYears = array(
        "Janvier" =>
      31, "Février" => 28, "Mars" => 31, "Avril" => 30, "Mai" => 31, "Juin" =>
      30, "Juillet" => 31, "Aôut" => 31, "Septembre" => 30, "Octobre" => 31,
      "Novembre" => 30, "Décembre" => 31 ); // Sorts the array in ascendin order
      asort($monthAndYears); ?>

      <table>
        <thead>
          <tr>
            <th>Mois</th>
            <th>Nombre de jours</th>
          </tr>
        </thead>
        <tbody>
          <?php foreach ($monthAndYears as $month =>
          $year) { ?>
          <tr>
            <td><?= $month ?></td>
            <td><?= $year ?></td>
          </tr>
          <?php } ?>
        </tbody>
      </table>
    </section>

    <hr />

    <section>
      <?php
      $capitales = array(
        "Bucarest" =>
      "Roumanie", "Bruxelles" => "Belgique", "Oslo" => "Norvège", "Ottawa" =>
      "Canada", "Paris" => "France", "Port-au-Prince" => "Haïti",
      "Port-d'Espagne" => "Trinité-et-Tobago", "Prague" => "République tchèque",
      "Rabat" => "Maroc", "Riga" => "Lettonie", "Rome" => "Italie", "San José"
      => "Costa Rica", "Santiago" => "Chili", "Sofia" => "Bulgarie", "Alger" =>
      "Algérie", "Amsterdam" => "Pays-Bas", "Andorre-la-Vieille" => "Andorre",
      "Asuncion" => "Paraguay", "Athènes" => "Grèce", "Bagdad" => "Irak",
      "Bamako" => "Mali", "Berlin" => "Allemagne", "Bogota" => "Colombie",
      "Brasilia" => "Brésil", "Bratislava" => "Slovaquie", "Varsovie" =>
      "Pologne", "Budapest" => "Hongrie", "Le Caire" => "Egypte", "Canberra" =>
      "Australie", "Caracas" => "Venezuela", "Jakarta" => "Indonésie", "Kiev" =>
      "Ukraine", "Kigali" => "Rwanda", "Kingston" => "Jamaïque", "Lima" =>
      "Pérou", "Londres" => "Royaume-Uni", "Madrid" => "Espagne", "Malé" =>
      "Maldives", "Mexico" => "Mexique", "Minsk" => "Biélorussie", "Moscou" =>
      "Russie", "Nairobi" => "Kenya", "New Delhi" => "Inde", "Stockholm" =>
      "Suède", "Téhéran" => "Iran", "Tokyo" => "Japon", "Tunis" => "Tunisie",
      "Copenhague" => "Danemark", "Dakar" => "Sénégal", "Damas" => "Syrie",
      "Dublin" => "Irlande", "Erevan" => "Arménie", "La Havane" => "Cuba",
      "Helsinki" => "Finlande", "Islamabad" => "Pakistan", "Vienne" =>
      "Autriche", "Vilnius" => "Lituanie", "Zagreb" => "Croatie" ); ?>

      <h1>Exercice 2</h1>

      <h3>
        Affichez la liste des capitales (par ordre alphabétique) suivie du nom
        du pays.
      </h3>

      <table>
        <thead>
          <tr>
            <th>Capitales</th>
            <th>Pays</th>
          </tr>
        </thead>
        <tbody>
          <?php
        // Sorts the array by the keys in ascending order
        ksort($capitales);

        foreach ($capitales as $capitale =>
          $pays) { ?>
          <tr>
            <th><?= $capitale ?></th>
            <th><?= $pays ?></th>
          </tr>
          <?php } ?>
        </tbody>
      </table>

      <h3>
        Affichez la liste des pays (par ordre alphabétique) suivie du nom de la
        capitale.
      </h3>

      <table>
        <thead>
          <tr>
            <th>Capitales</th>
            <th>Pays</th>
          </tr>
        </thead>
        <tbody>
          <?php
        // Sorts the array by the values in ascending order
          asort($capitales);

          foreach ($capitales as $capitale =>
          $pays) { ?>
          <tr>
            <th><?= $pays ?></th>
            <th><?= $capitale ?></th>
          </tr>
          <?php } ?>
        </tbody>
      </table>

      <h3>Affichez le nombre de pays dans le tableau.</h3>

      <?php
      echo count($capitales);
    ?>

      <h3>
        Supprimer du tableau toutes les capitales ne commençant pas par la
        lettre 'B', puis affichez le contenu du tableau.
      </h3>

      <?php
      foreach ($capitales as $key =>
      $value) { if (preg_match("/^[^b]/i", $key)) { unset($capitales[$key]); } }
      ?>

      <table>
        <thead>
          <tr>
            <th>Capitales</th>
            <th>Pays</th>
          </tr>
        </thead>
        <tbody>
          <?php
          foreach ($capitales as $capitale =>
          $pays) { ?>
          <tr>
            <th><?= $pays ?></th>
            <th><?= $capitale ?></th>
          </tr>
          <?php } ?>
        </tbody>
      </table>
    </section>

    <hr />

    <section>
      <?php
      $departements = array(
        "Hauts-de-france" =>
      array("Aisne", "Nord", "Oise", "Pas-de-Calais", "Somme"), "Bretagne" =>
      array("Côtes d'Armor", "Finistère", "Ille-et-Vilaine", "Morbihan"),
      "Grand-Est" => array("Ardennes", "Aube", "Marne", "Haute-Marne",
      "Meurthe-et-Moselle", "Meuse", "Moselle", "Bas-Rhin", "Haut-Rhin",
      "Vosges"), "Normandie" => array("Calvados", "Eure", "Manche", "Orne",
      "Seine-Maritime") ); ksort($departements); ?>

      <h1>Exercice 3</h1>

      <h3>
        Affichez la liste des régions (par ordre alphabétique) suivie du nom des
        départements
      </h3>

      <table>
        <thead>
          <tr>
            <th>Régions</th>
            <th>Départements</th>
          </tr>
        </thead>
        <tbody>
          <?php
        foreach ($departements as $region =>
          $value) { foreach ($value as $departement) { ?>
          <tr>
            <td><?= $region ?></td>
            <td><?= $departement ?></td>
          </tr>
          <?php } ?>
          <?php } ?>
        </tbody>
      </table>

      <h3>Affichez la liste des régions suivie du nombre de départements</h3>

      <table>
        <thead>
          <tr>
            <th>Régions</th>
            <th>Nombre de Départements</th>
          </tr>
        </thead>
        <tbody>
          <?php
          foreach ($departements as $region =>
          $departement) { ?>
          <tr>
            <td><?= $region ?></td>
            <td><?= count($departement) ?></td>
          </tr>
          <?php } ?>
        </tbody>
      </table>
    </section>
  </body>
</html>
