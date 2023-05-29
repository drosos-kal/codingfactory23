package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates n! (factorial)
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int i = 1;
        long factorial = 1L;

        System.out.println("Please enter the factorial");
        n = in.nextInt();

        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.printf("%d! = %d", n, factorial);
    }
}
