package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Adds and multiplies n first integers.
 * n is input by the user
 */
public class AddMulApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        int result = 1;

        System.out.println("Please insert a num");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i;
            result *= i;
        }

        System.out.println("Sum = " + sum);
//        System.out.println("Mul = " + result);
        System.out.printf("Mul = %,d", result);


    }
}
