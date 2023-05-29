package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class AutoFlushApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream(
                "C:\\Users\\user1\\OneDrive\\Documents\\Java Coding Factory\\Coding Factory 23\\fos.txt", true
        ), true, StandardCharsets.UTF_8)) {
            ps.println("Καλησπέρα");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
