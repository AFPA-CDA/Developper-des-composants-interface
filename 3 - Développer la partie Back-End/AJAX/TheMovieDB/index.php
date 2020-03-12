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
    <h3>Concevez une page permettant de rechercher des informations sur les films.</h3>

        <label for="movieSearch">Donnez un nom de film/serie</label>
        <input id="movieSearch" name="movieSearch" type="search">
        <button id="searchButton" type="submit">Rechercher</button>

    <table id="moviesList">
        <thead>
        <tr>
            <th>Titre</th>
            <th>Date de sortie</th>
            <th>Affiche</th>
        </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
</section>

</body>

<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script src="index.js"></script>
</html>
