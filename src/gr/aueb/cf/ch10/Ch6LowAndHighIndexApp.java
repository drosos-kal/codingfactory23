package gr.aueb.cf.ch10;

import java.util.Arrays;

/**
 * Assume an array: {1, 2, 4, 4, 4, 6, 7, 8, 8, 8, 9, 9}
 * The app returns the low and high index for a key (integer key)
 * that is included in the array. if the key was 8 -> {7, 9} or {8, 10}
 * if we make a user-friendly optimization
 */
public class Ch6LowAndHighIndexApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 6, 7, 8, 8, 8, 9, 9};
        arr = getLowAndHighIndexOf(arr, 8);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int low = 0;
        int high = 0;
        int pivot;

        if (arr == null) return new int[] {};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                low = i;
                break;
            }
        }

        high = low;
        pivot = low + 1;
        while (pivot < arr.length && arr[pivot++] == key) {
            high++;
        }

        return new int[] { low, high };

    }
}
