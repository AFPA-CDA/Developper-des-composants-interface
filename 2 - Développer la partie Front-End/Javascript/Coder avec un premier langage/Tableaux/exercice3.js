/**
 * Exercise 3
 * Ecrire un algorithme de tri à bulles
 */
const bubbleSort = arr => {
  let swapped;

  do {
    swapped = false;

    // The loop goes through each element of the array
    for (let i = 0; i < arr.length; i++) {
      // If an element is bigger than the next one swap the elements
      if (arr[i] > arr[i + 1]) {
        let temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
        swapped = true;
      }
    }
  } while (swapped);

  return arr;
};