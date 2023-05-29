package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Decides if it's snowing depending on the temperature.
 * If temperature is < 0 then it's snowing, else it's not snowing.
 * User enters temperature (stdin)
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        isSnowing = (temp < 0);

        System.out.println("Is snowing " + isSnowing);

    }
}
