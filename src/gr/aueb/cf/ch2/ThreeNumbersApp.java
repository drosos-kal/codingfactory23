package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Requests 3 integers from the user, reduces their value by 1
 * and shows them in the order they were entered, leaving a space
 * in between.
 */
public class ThreeNumbersApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please enter three integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        num1--;
        num2--;
        num3--;

        System.out.printf("%d %d %d", num1, num2, num3);

    }
}
