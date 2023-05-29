package gr.aueb.cf.ch2;

import java.util.Scanner;

public class MathPowersApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please enter a number");
        inputNum = in.nextInt();

        System.out.printf("num: %d, square: %d, cube: %d",
                inputNum, (int)Math.pow(inputNum, 2), (int)Math.pow(inputNum,3));

    }
}
