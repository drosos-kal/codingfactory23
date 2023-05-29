package gr.aueb.cf.ch6;

public class PopulateArray {

        public static void main(String[] args) {

            //definition and initialization of an array with fixed size
            int[] arr = new int[3];
            arr[0] = 5;  //set
            arr[1] = 7;
            arr[2] = 8;

            //System.out.print(arr[0] + " " + arr[1] + " " + arr[2]);

            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " "); //get
            }

            System.out.println();

            // Enhanced for
            for (int item : arr) {
                System.out.print(item + " ");
            }

            //undefined size initialization
            int[] arr2 = {1, 5, 8, 9, 12};


        }
    }
