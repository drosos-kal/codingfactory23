
package gr.aueb.cf.ch1;

import gr.aueb.cf.ch1.model.Point;
import gr.aueb.cf.ch11.HelloUtil;

import static java.lang.Math.abs;

/**
 * Prints  <b>Hello World!</b>
 * Defines a {@link HelloWorld} type.
 *
 * @author Drosos
 * @version 1.0
 * @since 0.1
 */
public class HelloWorld {

    private java.util.Scanner sc = new java.util.Scanner(System.in);
    private Point point;
    private String s;

    public static void main(String[] args) {

//      int abs = abs(-3); Instead of Math.abs because we import static java.lang.Math.abs;
        HelloUtil.sayHello();
        System.out.println("Hello World!");

    }
}

