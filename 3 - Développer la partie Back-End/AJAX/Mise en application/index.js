document.addEventListener("DOMContentLoaded", function () {
    // List of all elements
    const showDiscsBtn = document.getElementById("showDiscs");
    const departementsSelect = document.getElementById("departementsSelect");
    const regionsSelect = document.getElementById("regionsSelect");

    // Creates another function for all HTMLElement used to create ajax requests
    HTMLElement.prototype.load = function (url, el) {
        // Makes an ajax request to the given url
        axios.get(url).then(response => {
            // If nothing went wrong it puts the data in the innerHTML
            el.innerHTML = response.data;
        }).catch(error => {
            // If something went wrong it puts the error in the element textContent
            el.textContent = error;
        })
    };

    // On show discs button click
    showDiscsBtn.addEventListener("click", function () {
        // Makes an ajax request to listeproduit.php
        this.load("listeproduit.php", this.nextElementSibling);
    });

    // Makes an ajax request to listeoptions1.php
    departementsSelect.load("listeoptions1.php", departementsSelect);

    // On departementsSelect change
    departementsSelect.addEventListener("change", function () {
        // Makes an ajax request to listeoptions2.php
        regionsSelect.load(`listeoptions2.php?region_id=${this.value}`, regionsSelect)
    });
});
