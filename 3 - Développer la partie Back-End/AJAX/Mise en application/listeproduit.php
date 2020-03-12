<?php

try {
    // Creates a new PDO Connection
    $db = new PDO("mysql:host=localhost;dbname=record;charset=utf8", "root", "root");
    $db->setAttribute(PDO::ATTR_DEFAULT_FETCH_MODE, PDO::FETCH_OBJ);
    $db->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    die($e->getMessage());
}

// The SQL SELECT request
$request = "SELECT * FROM disc INNER JOIN artist a ON disc.artist_id = a.artist_id";

// Executes the SQL Query
$query = $db->query($request);

// Fetches all the discs
$discs = $query->fetchAll();

// Shuffles the array randomly
shuffle($discs);
?>

<table>
    <thead>
    <tr>
        <th>Année</th>
        <th>Artiste</th>
        <th>Genre</th>
        <th>Label</th>
        <th>Prix</th>
        <th>Titre</th>
    </tr>
    </thead>
    <tbody>
    <?php foreach ($discs as $disc): ?>
        <tr>
            <td><?= $disc->disc_year ?></td>
            <td><?= $disc->artist_name ?></td>
            <td><?= $disc->disc_genre ?></td>
            <td><?= $disc->disc_label ?></td>
            <td><?= $disc->disc_price ?>€</td>
            <td><?= $disc->disc_title ?></td>
        </tr>
    <?php endforeach; ?>
    </tbody>
</table>