package com.mycompany.question2;

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Display console menu
        System.out.println("Select the gaming console:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. SWITCH");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();
        input.nextLine();

        String consoleType;

        // Determine console selected
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;

            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = "SWITCH";
                break;

            default:
                consoleType = "INVALID";
                break;
        }

        // Capture store name
        System.out.print("Enter the store name: ");
        String store = input.nextLine();

        // Capture total sales
        System.out.print("Enter the total console sales: ");
        int totalSales = input.nextInt();

        // Create ConsoleSales object
        ConsoleSales consoleSales =
                new ConsoleSales(consoleType, store, totalSales);

        // Display report
        consoleSales.printReport();

        input.close();
    }
}