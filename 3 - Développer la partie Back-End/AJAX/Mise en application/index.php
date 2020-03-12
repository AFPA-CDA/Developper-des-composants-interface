<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AJAX - Mise en application</title>
</head>

<body>
<section>
    <h1>Exercice 1</h1>
    <h3>Créez un fichier listeproduit.php qui permet d'afficher la liste des disques de la base record.</h3>

    <button id="showDiscs">Afficher les disques</button>
    <div id="div1"></div>
</section>

<hr>

<section>
    <h1>Exercice 2</h1>
    <h3>Reprenez le second exercice de la phase 2, modifiez votre script PHP pour envoyer les données au format JSON.</h3>

    <select id="regionsSelect"></select>
    <select id="departementsSelect"></select>
</section>

</body>

<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script src="index.js"></script>
</html>
