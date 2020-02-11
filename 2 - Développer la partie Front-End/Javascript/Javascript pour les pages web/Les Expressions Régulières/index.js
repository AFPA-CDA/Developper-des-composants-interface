/**
 * Javascript REGEX exercise
 */
const validateInput = str => {
    const isNumeric = /^[0-9]+$/;

    if (!isNumeric.test(str)) {
        return "La valeur donnée n'est pas un nombre.";
    }
};

/**
 * Javascript Events Exercise
 */
// IIFE (Immediately Invoked Function Expression)
(() => {
    // Generates the random number
    const magicNumber = Math.floor(Math.random() * 100) + 1;

    const button = document.getElementById("button1");
    const label = document.getElementById("label1");

    let tries = 1;

    // When the button is clicked execute the following code
    button.addEventListener("click", () => {
        const guess = document.getElementById("textBox1").value;

        const isInputValid = validateInput(guess);

        if (guess > magicNumber) {
            label.innerHTML = "Plus petit.";
        } else if (guess < magicNumber) {
            label.innerHTML = "Plus grand.";
        } else if (isInputValid !== undefined) {
            // If the input is not valid
            label.innerHTML = isInputValid;
        } else {
            label.innerHTML = `Bravo vous avez réussi en ${tries} essais.`;
        }

        tries++;
    });
})();