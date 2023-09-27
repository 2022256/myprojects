/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icecreamflavors;

import java.util.Scanner;

/**
 *
 * @author 4istik
 */
public class IceCreamFlavors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] flavors = {"Raspberry", "Chocolate", "Vanilla"};
        int choice = 0;

        // Loop until the user chooses to leave the shop
        while (choice != 4) {
            // Display the ice-cream menu
            System.out.println("Ice-cream menu");
            for (int i = 0; i < flavors.length; i++) {
                System.out.println((i+1) + ") " + flavors[i]);
            }
            System.out.println("4) Leave Shop");

            // Get the user's choice
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Handle the user's choice
            if (choice >= 1 && choice <= 3) {
                System.out.println("You chose " + flavors[choice-1] + " ice cream.");
            } else if (choice == 4) {
                System.out.println("Thanks for visiting the ice cream shop. Goodbye!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
    }
    
}
}