package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Determines if it's snowing based on temperature and precipitation
 * If it's raining AND temperature is < 0 then it's snowing,
 * else it doesn't.
 */
public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert whether it's raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert temperature");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
