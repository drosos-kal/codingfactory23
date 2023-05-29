package gr.aueb.cf.ch2;

/**
 * Roll two dice
 */
public class RandomDiceApp {

    public static void main(String[] args) {
        int die1 = 0;
        int die2 = 0;

        die1 = (int) (Math.random()*6) +1;
        die2 = (int) (Math.random()*6) +1;

        System.out.printf("Die 1: %d, Die 2: %d", die1, die2);
    }
}
