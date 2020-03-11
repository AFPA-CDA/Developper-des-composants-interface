<?php

try {
    // Creates a new PDO connection
    $db = new PDO("mysql:host=localhost;dbname=ajax_regions;charset=utf8", "root", "root");
    $db->setAttribute(PDO::ATTR_DEFAULT_FETCH_MODE, PDO::FETCH_OBJ);
    $db->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    die($e->getMessage());
}

// Gets and filters the input to be used for the prepared statement
$regionId = filter_input(INPUT_GET, "region_id", FILTER_SANITIZE_NUMBER_INT);

// The SQL SELECT request
$request = "SELECT dep_nom, dep_id FROM departements INNER JOIN regions r ON r.reg_id = departements.dep_reg_id WHERE r.reg_id = :region_id";

// Prepares the statement
$stmt = $db->prepare($request);

// Bind the param with the filtered input
$stmt->bindParam(":region_id", $regionId, PDO::PARAM_INT);

// Executes the prepared statement
$stmt->execute();

// Fetches all the departements
$departements = $stmt->fetchAll();

// Closes the cursot
$stmt->closeCursor();
?>

<?php foreach($departements as $departement): ?>
    <option value="<?= $departement->dep_id ?>"><?= $departement->dep_nom ?></option>
<?php endforeach; ?>
