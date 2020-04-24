package com.afpa.control.loops;

import com.afpa.Shared;

public class Palindrome {
    /**
     * Returns true if the string is a palindrome
     * @param str The string to test
     * @return True if the string is a palindrome otherwise returns false
     */
    public static boolean isPalindrome(String str) {
        // Creates a StringBuilder
        StringBuilder reversedStr = new StringBuilder();

        // Makes the user given string lowercase
        str = str.toLowerCase();

        // Reverses the string and append the result to the reversedStr
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }

        // Returns true if the 2 strings are equal
        return str.equals(reversedStr.toString());
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Palindrome (V1.1, 24/04/2020) ****");

        String word = Shared.readString("Veuillez entrer un mot: ");

        System.out.printf("Palindrome: %b", isPalindrome(word));
    }
}
