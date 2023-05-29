package gr.aueb.cf.ch6;

public class ArrayMinMaxApp {

/**
 * Looks for the minimum and maximum element of an array
 */
    public static void main(String[] args) {

        int[] arr = {30, 12, 80, 7, 15};

        int minPosition = 0;
        int minValue = arr[minPosition];


        //initiate on 1 because index 0 is already checked above
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        System.out.printf("Min Value: %d, Min Position:%d", minValue, minPosition + 1);
    }
}
