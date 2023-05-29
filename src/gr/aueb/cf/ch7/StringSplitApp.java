package gr.aueb.cf.ch7;

/**
 * Splits a String.
 */
public class StringSplitApp {

    public static void main(String[] args) {
        String s = "Athens       Uni of Econ and Business";

        String[] tokens = s.split(" "); // s.split(" +") + sign is used to ignore any number of spaces but one

        for (String token : tokens) {
            System.out.println(token);
        }
    }



}
