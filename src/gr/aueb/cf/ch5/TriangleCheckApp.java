package gr.aueb.cf.ch5;

import java.util.Scanner;

public class TriangleCheckApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Please enter the hypotenuse");
        a = in.nextDouble();
        System.out.println("Please enter the other two sides of the triangle");
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = (Math.abs(a*a - b*b - c*c) <= EPSILON);

        if (isRight) {
            System.out.println("Triangle is right");
        } else {
            System.out.println("Triangle is not right");
        }


    }
}
