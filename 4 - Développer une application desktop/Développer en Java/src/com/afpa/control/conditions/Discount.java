package com.afpa.control.conditions;

import com.afpa.Shared;

public class Discount {
    /**
     * Calculates the price for the order
     *
     * @param unitPrice Unit price for the product
     * @param quantity  The quantity for the product
     * @return The final price with all taxes and discounts
     */
    public static double calculatePrice(double unitPrice, int quantity) {
        double discount;

        // Multiply the unitPrice and the quantity to get the totalPrice
        double totalPrice = unitPrice * quantity;

        // Calculates the shipping price
        double shippingPrice = totalPrice > 500 ? 0 : totalPrice * 0.2;

        if (shippingPrice < 6) shippingPrice = 6;

        if (totalPrice >= 100) {
            if (totalPrice <= 200) {
                discount = totalPrice * 0.05;
            } else {
                discount = totalPrice * 0.1;
            }
        } else {
            discount = 0;
        }

        System.out.printf("Total price: %.2f\n", totalPrice);
        System.out.printf("Shipping price: %.2f\n", shippingPrice);
        System.out.printf("Discount: %.2f\n", discount);

        return totalPrice + shippingPrice - discount;
    }

    /**
     * Executes the code properly
     */
    public static void exec() {
        // Prints the header
        System.out.println("**** Discount (V1.1, 22/04/2020) ****");

        // Reads the user inputs
        double unitPrice = Shared.readDouble("Veuillez entrer le prix unitaire: ");
        int quantity = Shared.readInt("Veuillez entrer la quantité: ");

        // Prints the final result to the user
        System.out.printf("Final price: %.2f", calculatePrice(unitPrice, quantity));
    }
}
