package gr.aueb.cf.ch6;


/**
 * Makes a copy of an array.
 */
public class ShallowCopy {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};

//        Shallow copy - copies references
//        int[] arr2;

//        arr2 = arr1;
//
//        arr2[0] = 222;

//        for (int item : arr1) {
//            System.out.print(item + " ");
//        }

        // Deep copy
        int[] arr2 = new int[arr1.length]; //0, 0, 0, 0

        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int item : arr2) {
            System.out.print(item + " ");
        }
    }


}
