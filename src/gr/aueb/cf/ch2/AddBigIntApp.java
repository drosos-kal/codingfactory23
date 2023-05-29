package gr.aueb.cf.ch2;
import java.math.BigInteger;

/**
 * Demonstrates BigInteger class.
 */
public class AddBigIntApp {
    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger("214748399964755419284");
        BigInteger bigNum2 = new BigInteger("21474836472542984");
        BigInteger result = new BigInteger("0");

        result = bigNum.add(bigNum2);

        System.out.printf("%,d", result);
    }
}
