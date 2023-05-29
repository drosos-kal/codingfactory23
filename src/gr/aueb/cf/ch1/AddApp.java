package gr.aueb.cf.ch1;

/**
 *  adds two integers and
 *  prints the result in stdout
 **/

public class AddApp {

    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 10;
        int num2 = 7;
        int result = 0;
//      int num1 = 10, num2 = 7, result = 0;

        //Εντολές
        result = num1 + num2;

        //Εκτύπωση αποτελεσμάτων
        System.out.println("The result is: " + result);
        System.out.printf("The result of %d, %d is %d",num1,num2,result);
    }
}
