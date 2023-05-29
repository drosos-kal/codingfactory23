package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * A small frog wants to cross a river.
 * The frog is at position X and wants to go to position Y
 * (or in position > Y). The frog jumps a fixed distance, D
 *
 * The program finds the minimum amount of jumps the small frog must make
 * in order to reach his destination
 *
 * For example ->
 * X = 10
 * Y = 85
 * D = 30
 *
 * Then he will make 3 jumps because:
 * Starts at 10, and after the first jump he reaches position 10 + 30 = 40
 * On the second jump 40 + 30 = 70, on the third time he jumps 70 + 30 = 100
 */

public class FrogApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int distance = 0;
        double jumps = 0;

        System.out.println("Please enter a starting position, the target and the distance the frog jumps");
        start = in.nextInt();
        end = in.nextInt();
        distance = in.nextInt();

//        for (int i = start; i < end; i += distance) {
//            jumps++;
//        }

        jumps = (int) Math.ceil((end - start) / (double) distance);

        System.out.printf("The frog will need %d jumps to reach his destination", jumps);


    }
}
