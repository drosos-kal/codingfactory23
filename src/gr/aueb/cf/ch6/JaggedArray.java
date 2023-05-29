package gr.aueb.cf.ch6;


/**
 * Jagged arrays are arrays with potentially different
 * dimensions in each row.
 */
public class JaggedArray {

    public static void main(String[] args) {
        int[][] jaggedArr = new int[3][]; //initialization only for rows

        //initialization for columns
        jaggedArr[0] = new int[4];
        jaggedArr[1] = new int[3];
        jaggedArr[2] = new int[6];

        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
