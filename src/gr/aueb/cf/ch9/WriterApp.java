package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class WriterApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:\\Users\\user1\\OneDrive\\Documents\\Java Coding Factory\\Coding Factory 23\\test1.txt");
                 PrintWriter pw = new PrintWriter("C:\\Users\\user1\\OneDrive\\Documents\\Java Coding Factory\\Coding Factory 23\\test2.txt")) {
            ps.println("Hello CF! from print stream");
            pw.println("Hello CF! from print writer");
        } catch (FileNotFoundException e) {
            System.out.println("File path not found");
        }
    }
}
