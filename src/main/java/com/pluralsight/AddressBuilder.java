package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        // Setup
        StringBuilder builder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for information
        System.out.println("Please provide the following information:");
        System.out.println("Full Name:");
        String fullName = scanner.nextLine();

        // Prompt for billing address
        System.out.println("Billing Street:");
        String billingStreet = scanner.nextLine();
        System.out.println("Billing City:");
        String billingCity = scanner.nextLine();
        System.out.println("Billing State:");
        String billingState = scanner.nextLine();
        System.out.println("Billing Zip:");
        String billingZip = scanner.nextLine();

        // Prompt for shipping address
        System.out.println("Shipping Street:");
        String shippingStreet = scanner.nextLine();
        System.out.println("Shipping City:");
        String shippingCity = scanner.nextLine();
        System.out.println("Shipping State:");
        String shippingState = scanner.nextLine();
        System.out.println("Shipping Zip:");
        String shippingZip = scanner.nextLine();

        System.out.println();

        // Build the billing address into the string builder
        builder.append(fullName).append("\n\n");
        builder.append("Billing Address:\n");
        builder.append(billingStreet).append("\n");
        builder.append(billingCity).append(", ");
        builder.append(billingState).append(" ").append(billingZip);

        // Build the shipping address into the string builder
        builder.append("\n\n").append("Shipping Address:\n");
        builder.append(shippingStreet).append("\n");
        builder.append(shippingCity).append(", ");
        builder.append(shippingState).append(" ").append(shippingZip);

        // Make the builder into a string
        String finalAddress = builder.toString();

        // Display the final address
        System.out.println(finalAddress);

        // Close the scanner
        scanner.close();
    }

    // TODO: Create a method to build a billing / shipping address and return it as a string
}
