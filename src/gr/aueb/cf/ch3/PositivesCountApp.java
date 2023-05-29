package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * counts the amount of positive numbers input by the user
 */
public class PositivesCountApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positiveCount = 0;
        int i = 0;

        System.out.println("Please give a num (int)");
        num = in.nextInt();

        while(num >= 0) {
            positiveCount++;
            System.out.println("Please give a num (int)");
            num = in.nextInt();
        }

        System.out.printf("User input %d numbers", positiveCount);
    }
}
