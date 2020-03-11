document.addEventListener("DOMContentLoaded", function () {
    // List of all elements
    const departementsSelect = document.getElementById("departementsSelect");
    const regionsSelect = document.getElementById("regionsSelect");
    const showDiscsBtn = document.getElementById("showDiscs");

    // On show discs button click
    showDiscsBtn.addEventListener("click", function () {
        // Makes an ajax GET request to listeproduit.php
        axios("listeproduit.php").then(response => {
            // If nothing went wrong it puts the data in the innerHTML
            this.nextElementSibling.innerHTML = response.data;
        }).catch(error => {
            // If something went wrong it puts the error in the element textContent
            this.nextElementSibling.textContent = error;
        })
    });

    // Makes an ajax GET request to listeoptions1.php
    axios("listeoptions1.php").then(response => {
        // For each regions
        for (let region of response.data) {
            // Adds an option with its name and id
            regionsSelect.add(new Option(region.reg_v_nom, region.reg_id));
        }
    });


    // On regionsSelect change
    regionsSelect.addEventListener("change", function () {
        // Makes an ajax GET request to listeoptions2.php with the current region ID
        axios(`listeoptions2.php?region_id=${this.selectedOptions[0].value}`).then(response => {
            // Deletes all option in order to prevent duplicates
            while (departementsSelect.options.length) departementsSelect.options.remove(0);

            // For each departements
            for (let departement of response.data) {
                // Adds an option with its name and id
                departementsSelect.add(new Option(departement.dep_nom, departement.dep_id));
            }
        })
    });
});
