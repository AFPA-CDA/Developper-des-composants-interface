<?php

try {
    // Creates a new PDO connection
    $db = new PDO("mysql:host=localhost;dbname=ajax_regions;charset=utf8", "root", "root");
    $db->setAttribute(PDO::ATTR_DEFAULT_FETCH_MODE, PDO::FETCH_OBJ);
    $db->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    die($e->getMessage());
}

// The SQL SELECT request
$request = "SELECT reg_id, reg_v_nom FROM regions";

// Makes the query to the database
$query = $db->query($request);

// Fetches all the regios ids
$regions = $query->fetchAll();

// Closes the cursor
$query->closeCursor();
?>

<?php foreach($regions as $region): ?>
    <option value="<?= $region->reg_id ?>"><?= $region->reg_v_nom ?></option>
<?php endforeach; ?>
