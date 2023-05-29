package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Simulates a simple calculator that performs
 * the add, sub, mul, div, mod calculations.
 * Displays a menu to the user with choices,
 * takes the value of the choice and then two more values of
 * num1, num2 and displays the result.
 */
public class CalculatorApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int result = 0;
        do {
            printMenu();
            choice = getNextInt("Please insert your choice");
            //validation
            if (isChoiceInvalid(choice)) {
                System.out.println("Choice is invalid");
                continue;
            }
            if (isChoiceQuit(choice)) {
                break;
            }
            result = onChoiceGetResult(choice);
            System.out.println(result);
        } while (true);
    }

    public static void printMenu() {
        System.out.println("Choose one of the following:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Exit");
    }

    public static int getNextInt(String message) {
        System.out.println(message);
        return in.nextInt();
    }

    public static boolean isChoiceInvalid(int choice) {
        return (choice < 1 || choice > 6);
    }

    public static boolean isChoiceQuit(int choice) {
        return (choice == 6);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 % num2;
    }

    public static int onChoiceGetResult(int choice) {
        int num1 = getNextInt("Please insert the first number (int)");
        int num2 = getNextInt("Please insert the second number (int)");
        int result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            case 6:
            default:
                break;

        }
        return result;
    }
}
