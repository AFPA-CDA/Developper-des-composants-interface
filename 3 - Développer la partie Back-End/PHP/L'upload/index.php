<?php
// List of allowed mime types
$allowedMimeTypes = array("image/gif", "image/jpg", "image/jpeg", "image/pjpeg", "image/png", "image/x-png", "image/tiff");

// Returns true is the file exists
$fileExists = isset($_FILES) ? count($_FILES) : 0;

// List of error messages
$fileMessages = array(
  UPLOAD_ERR_OK => "Il n'y a pas d'erreur, le fichier a été téléchargé avec succès",
  UPLOAD_ERR_INI_SIZE => 'Le fichier téléchargé dépasse la directive upload_max_filesize de php.ini',
  UPLOAD_ERR_FORM_SIZE => 'Le fichier téléchargé dépasse la directive MAX_FILE_SIZE qui a été spécifiée dans le formulaire HTML',
  UPLOAD_ERR_PARTIAL => 'Le fichier choisi n\'a été que partiellement téléchargé',
  UPLOAD_ERR_NO_FILE => 'Aucun fichier n\'a été choisi',
  UPLOAD_ERR_NO_TMP_DIR => 'Il manque un dossier temporaire',
  UPLOAD_ERR_CANT_WRITE => 'Impossible d\'écrire le fichier sur le disque',
  UPLOAD_ERR_EXTENSION => 'Une extension PHP a arrêté le téléchargement du fichier'
);

// Reads the file info if the file exists
if ($fileExists && $_FILES["fichier"]["size"] > 0) {
  $finfo = new finfo(FILEINFO_MIME_TYPE);
  $mimeType = $finfo->file($_FILES["fichier"]["tmp_name"]);
} else {
  $mimeType = null;
}
?>

<form action="<?= htmlspecialchars($_SERVER["PHP_SELF"]) ?>" enctype="multipart/form-data" method="post">
  <input name="fichier" type="file">
  <button type="submit">Submit</button>
</form>

<!-- Checks that the request method used is POST -->
<?php if ($_SERVER["REQUEST_METHOD"] == "POST"): ?>
  <!-- Checks that there is no error and that the mime type is allowed -->
  <?php if ($_FILES["fichier"]["error"] == UPLOAD_ERR_OK && in_array($mimeType, $allowedMimeTypes)): ?>
    <!-- Moves the uploaded file to the right folder -->
    <?php
    $path = realpath('../../files/');
    $name = basename($_FILES["fichier"]["name"]);
    
    move_uploaded_file($_FILES["fichier"]["tmp_name"], "$path/$name");
    
    echo $fileMessages[UPLOAD_ERR_OK];
    ?>
    <!-- If the mime type isn't allowed and there is no upload error show a message to the user -->
  <?php elseif (!in_array($mimeType, $allowedMimeTypes) && empty($_FILES["fichier"]["error"])): ?>
    <p>Le format <?= basename($mimeType) ?> n'est pas supporté</p>
    <!-- If there is an error show it to the user -->
  <?php elseif (!empty($_FILES["fichier"]["error"])): ?>
    <p><?= $fileMessages[$_FILES["fichier"]["error"]] ?></p>
  <?php endif; ?>
<?php endif; ?>

