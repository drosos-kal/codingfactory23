package gr.aueb.cf.ch7;

/**
 * Transforms strings.
 */
public class LowerUpperTrim {

    public static void main(String[] args) {
        String s = "  Athens Uni  ";
        String lowercase;
        String uppercase;
        String trimmed;
        String s2 = "";

        lowercase = s.toLowerCase();
        uppercase = s.toUpperCase();
        trimmed = s.trim(); //removes spaces from the left and right of string

        System.out.println("*".repeat(10));

        if (s2.isEmpty()) {
            System.out.println(s2.length());
        }
    }
}
