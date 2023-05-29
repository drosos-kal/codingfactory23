package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamGenericApp {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:\\Users\\user1\\OneDrive\\Documents\\Java Coding Factory\\Coding Factory 23\\f1.txt");

        printMessage(ps, "Hello World");
        printMessage(System.out, "Hello Coding Factory");
    }

    public static void printMessage (PrintStream ps, String message) {
        ps.println(message);
    }
}
