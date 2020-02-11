/**
 * Exercise 4
 * Ecrire un algorithme de tri par insertion
 */
const insertionSort = arr => {
  let j = 1;
  let n = arr.length;

  while (j !== n) {
    let i = j - 1;
    let tmp = arr[j];

    while (i > -1 && arr[i] > tmp) {
      arr[i + 1] = arr[i];
      i -= 1;
    }

    arr[i + 1] = tmp;
    j += 1;
  }

  return arr;
};