package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Decides whether an int is even or odd.
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        boolean isNumEven = false;

        System.out.println("Please insert an int");
        num = in.nextInt();

        isNumEven = isEven(num);

        System.out.println("Num " + num + " is even: " + isNumEven );

    }

    /**
     * Evaluates whether an int is even or not.
     * @param n     the number to evaluate.
     * @return      true if n is even, false if n is odd.
     */
    public static boolean isEven(int n) {
        return (n % 2 == 0);
    }

}
