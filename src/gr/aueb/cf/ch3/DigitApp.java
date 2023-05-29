package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the amount of digits of an integer,
 * the sum of its digits and the sum of the first and last digit
 *
 * 531 -> count: 3,sum: 9,leftmost + rightmost: 6
 */
public class DigitApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;
        int sum = 0;
        int sumLeftRight = 0;
        int currentDigit = 0;
        int rightmost = 0;
        int leftmost = 0;

        System.out.println("Please insert num");
        inputNum = in.nextInt();

        num = inputNum;
        do {
            count++;

            currentDigit = num % 10;
            sum += currentDigit;
            if (count == 1) { //for the rightmost number
                rightmost = currentDigit;
            }
            num /= 10;
        } while (num != 0);

        leftmost = currentDigit;
        sumLeftRight = leftmost + rightmost;


        System.out.println("Count: " + count);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of leftmost, rightmost digits: " + sumLeftRight);
    }

}
