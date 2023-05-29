package gr.aueb.cf.ch6;

public class ReplaceWithMethod {

/**
 * Updates the elements of an array
 */

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6};
        upscaleByOne(arr);
        printArray(arr);

    }

    public static void upscaleByOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 1;
        }
    }

    public static void printArray(int[] arr) {
        for(int item : arr) {
            System.out.print(item + " ");
        }
    }
}
