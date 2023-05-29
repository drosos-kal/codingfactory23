package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * checks for equality in floating points.
 */
public class DoubleCompare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double d1;
        double d2;
        final double EPSILON = 0.005;

        System.out.println("Please enter two doubles");
        d1 = in.nextDouble();
        d2 = in.nextDouble();

        if (Math.abs(d2-d1) <= EPSILON) {
            System.out.println("Equal");
        } else {
            System.out.println("NOT Equal");
        }
    }
}
