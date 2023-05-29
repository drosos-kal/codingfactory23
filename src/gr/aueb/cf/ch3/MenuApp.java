package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Displays repeatedly a menu of choice until the user selects "Exit"
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one of the following:");
            System.out.println("1. Product input");
            System.out.println("2. Delete a product");
            System.out.println("3. Exit");
            choice = in.nextInt();
        } while (choice != 3);

    }
}
