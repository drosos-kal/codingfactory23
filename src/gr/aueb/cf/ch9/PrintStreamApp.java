package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Prints with PrintStream class.
 */
public class PrintStreamApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:\\Users\\user1\\OneDrive\\Documents\\Java Coding Factory\\Coding Factory 23\\f1.txt", StandardCharsets.UTF_8)) {
            ps.println("Hello Coding Factory. Γεια!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
