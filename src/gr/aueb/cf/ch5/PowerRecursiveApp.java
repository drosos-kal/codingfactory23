package gr.aueb.cf.ch5;

/**
 * Recursive a^n
 */
public class PowerRecursiveApp {

    public static void main(String[] args) {

        System.out.println(power(2,-2));
    }

    /**
     * Recursive a^n.
     * @param a     the base.
     * @param n     the power.
     * @return      the n power of num a.
     */
    public static float power(float a, float n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / power(a, -n);
        }
        return a * power(a, n-1);
    }
}
