package gr.aueb.cf.ch7;

/**
 * Formats to String.
 */
public class StringFormatApp {

    public static void main(String[] args) {
        char row = 'B';
        int column = 8;

        String seat = String.format("%c%02d", row, column);

        System.out.println(seat);
    }
}
