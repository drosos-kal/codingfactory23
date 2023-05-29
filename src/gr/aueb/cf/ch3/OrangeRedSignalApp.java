package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * An airplane has two tanks. If one tank has < 1/4  fuel then we get an orange light
 * If both tanks have < 1/4 fuel then we get a red light
 * The pilot (stdin) enters true or false depending on tank < 1/4 or not
 */
public class OrangeRedSignalApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tank 1, tank2 are less than 1/4 full");
        isTank1LTQuarter = in.nextBoolean();
        isTank2LTQuarter = in.nextBoolean();

        orangeOn = isTank1LTQuarter || isTank2LTQuarter;
        redOn = isTank1LTQuarter && isTank2LTQuarter;

        System.out.println("Orange on : " + orangeOn);
        System.out.println("Red on : " + redOn);



    }
}
