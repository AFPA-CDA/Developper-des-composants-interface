document.addEventListener("DOMContentLoaded", function () {
    const movieSearch = document.getElementById("movieSearch");

    const apiInstance = axios.create({
        baseURL: "https://api.themoviedb.org/3/search/movie?api_key=f33cd318f5135dba306176c13104506a"
    });

    movieSearch.addEventListener("change", function () {
        apiInstance.get("", {
            params: {
                query: this.value
            }
        }).then(response => {
            const images = document.getElementsByTagName("img");

            while (images.length) images[0].parentNode.removeChild(images[0]);

            for (let movie of response.data.results) {
                if (movie.poster_path !== null) {
                    const image = document.createElement("img");
                    image.src = `https://image.tmdb.org/t/p/w185${movie.poster_path}`;
                    movieSearch.insertAdjacentElement("afterend", image);
                }
            }
        })
    });
});