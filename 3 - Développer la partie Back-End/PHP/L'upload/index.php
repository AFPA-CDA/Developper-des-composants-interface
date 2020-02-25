<?php
$fileError = $_FILES["fichier"]["error"];
$fileTempName = $_FILES["fichier"]["tmp_name"];

$fileMessages = array(
  UPLOAD_ERR_OK => "Il n'y a pas d'erreur, le fichier a été téléchargé avec succès",
  UPLOAD_ERR_INI_SIZE => 'Le fichier téléchargé dépasse la directive upload_max_filesize de php.ini',
  UPLOAD_ERR_FORM_SIZE => 'Le fichier téléchargé dépasse la directive MAX_FILE_SIZE qui a été spécifiée dans le formulaire HTML',
  UPLOAD_ERR_PARTIAL => 'Le fichier téléchargé n\'a été que partiellement téléchargé',
  UPLOAD_ERR_NO_FILE => 'Aucun fichier n\'a été téléchargé',
  UPLOAD_ERR_NO_TMP_DIR => 'Il manque un dossier temporaire',
  UPLOAD_ERR_CANT_WRITE => 'Impossible d\'écrire le fichier sur le disque',
  UPLOAD_ERR_EXTENSION => 'Une extension PHP a arrêté le téléchargement du fichier'
);

$mimeTypes = array("image/gif", "image/jpg", "image/jpeg", "image/pjpeg", "image/png", "image/x-png", "image/tiff");
?>

<form action="<?= htmlspecialchars($_SERVER["PHP_SELF"]) ?>" enctype="multipart/form-data" method="post">
  <input name="fichier" type="file">
  <button type="submit">Submit</button>
</form>

<?php
if (isset($_FILES) && $_FILES["fichier"]["size"] > 0) {
  $finfo = new finfo(FILEINFO_MIME_TYPE);
  $mimeType = $finfo->file($fileTempName);
} else {
  $mimeType = null;
}
?>


<?php if ($_SERVER["REQUEST_METHOD"] == "POST"): ?>
  <?php if ($fileError == UPLOAD_ERR_OK && in_array($mimeType, $mimeTypes)): ?>
    <p><?= $fileMessages[UPLOAD_ERR_OK] ?></p>
  <?php elseif (!in_array($mimeType, $mimeTypes) && empty($fileError)): ?>
    <p>Le format <?= basename($mimeType) ?> n'est pas supporté</p>
  <?php elseif (!empty($fileError)): ?>
    <p><?= $fileMessages[$fileError] ?></p>
  <?php endif; ?> 
<?php endif; ?>

