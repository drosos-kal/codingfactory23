package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * User enters start, end and step and prints corresponding stars
 */
public class StarsStepApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        int i = 0;

        System.out.println("Please enter start, end value and step");
        start = in.nextInt();
        end = in.nextInt();
        step = in.nextInt();

        i = start;
        while (i <= end){
            System.out.println("*");
            i += step;
        }

    }
}
