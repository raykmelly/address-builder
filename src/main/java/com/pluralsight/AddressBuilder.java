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

        System.out.println("Billing Street:");
        String billingStreet = scanner.nextLine();
        System.out.println("Billing City:");
        String billingCity = scanner.nextLine();
    }


}
