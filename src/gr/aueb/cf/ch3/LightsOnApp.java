package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Determines whether car's lights must be turned on depending on 3 variables:
 * if it's raining AND at the same time one of the following is true:
 * It's dark OR we are speeding (speed > 100)
 * Those values are taken from stdin.
 */
public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark (true/false)");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed (int)");
        speed = in.nextInt();

        isRunning = (speed > 100);
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights on : " + lightsOn);
    }
}
