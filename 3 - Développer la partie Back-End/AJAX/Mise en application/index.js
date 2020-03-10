document.addEventListener("DOMContentLoaded", function () {
    // List of all elements
    const btn1 = document.getElementById("btn1");
    const select1 = document.getElementById("select1");
    const select2 = document.getElementById("select2");

    HTMLElement.prototype.load = function (url, el) {
        axios.get(url).then(response => {
            el.innerHTML = response.data;
        }).catch(error => {
            el.textContent = error;
        })
    };

    // TODO: Add comments + closeCursor + Refactor + localhost revoir code + revoir code all cda + ranger github + voir calendrier

    btn1.addEventListener("click", function () {
        btn1.load("listeproduit.php", btn1.nextElementSibling);
    });

    select1.load("listeoptions1.php", select1);

    select1.addEventListener("change", function () {
        select2.load(`listeoptions2.php?region_id=${this.value}`, select2)
    });


});