package gr.aueb.cf.ch8;

import java.io.IOException;

/**
 * Demonstrates the usage of exceptions
 */
public class ExceptApp {

//    public static void main(String[] args) throws IOException {
//        int ch = System.in.read();
//    }

    public static void main(String[] args) {
        int ch;
        int[] arr = new int[10];

        //checked exceptions are exceptions that are spotted at compile time
        try {
            ch = getNextChar();
            System.out.println(ch);
        } catch (IOException e) {
            System.out.println("Error in I/O");
        }


        //unchecked exceptions are exceptions that are spotted at runtime
        for (int i = 0; i < arr.length; i++) { //for (int i = 0; i <= arr.length; i++) IndexOutOfBounds
            System.out.print(arr[i] + " ");
        }


    }

    public static int getNextChar() throws IOException {
        int ch = ' ';
        try {
           ch = System.in.read();
        } catch (IOException e) {
            // 3 things we can do in a catch
            // 1. Rollback
            // 2. Logging
            // 3. Rethrow
            e.printStackTrace();
            throw e;
        }
        return ch;
    }
}
