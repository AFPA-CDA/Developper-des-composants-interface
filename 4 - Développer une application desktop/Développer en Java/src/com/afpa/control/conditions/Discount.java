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
        // Declares variables
        double discount;
        double shippingPrice;

        // Multiply the unitPrice and the quantity to get the totalPrice
        double totalPrice = unitPrice * quantity;

        // Calculates the shipping price
        if (totalPrice > 500) {
            shippingPrice = 0;
        } else {
            shippingPrice = totalPrice * 0.2;
        }

        // The shippingPrice can't be less than 6€
        if (shippingPrice < 6) shippingPrice = 6;

        // Calculates the discount based on the total price
        if (totalPrice >= 100) {
            if (totalPrice <= 200) {
                discount = totalPrice * 0.05;
            } else {
                discount = totalPrice * 0.1;
            }
        } else {
            discount = 0;
        }

        System.out.printf("Prix Total: %.2f\n", totalPrice);
        System.out.printf("Prix de la livraison: %.2f\n", shippingPrice);
        System.out.printf("Remise: %.2f\n", discount);

        return (totalPrice + shippingPrice) - discount;
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
        System.out.printf("Prix TTC: %.2f", calculatePrice(unitPrice, quantity));
    }
}
