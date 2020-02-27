<?php
// Sets the page's title
$title = "Velvet Records - Liste des disques";

// Gets the database instance
$db = Database::getInstance();

// Prepares the statement for execution and returns the statement object
$stmt = $db->prepare("SELECT disc.*, artist_name FROM disc INNER JOIN artist a on disc.artist_id = a.artist_id");

// Executes the prepared statement
$stmt->execute();

// Fetches all the discs from the prepared statement as an Object
$discs = $stmt->fetchAll();