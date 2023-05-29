package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\user1\\OneDrive\\Documents\\Java Coding Factory\\random-file.txt");
        char ch;

        //for two or more catches we must go from the most specific to the most general exception
        try (Scanner in = new Scanner(file)) {
            ch = (char) System.in.read();
        } catch (FileNotFoundException | RuntimeException e2) {
            System.out.println("File not found error");
        } catch (IOException e1) {
            //e.printStackTrace();
            System.out.println("Read Error");
        } catch (Exception e3) {
            System.out.println("Oops something went wrong!");
        }
    }
}
