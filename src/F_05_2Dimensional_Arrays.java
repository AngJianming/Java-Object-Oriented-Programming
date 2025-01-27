public class F_05_2Dimensional_Arrays {
    // 2-Dimensional Arrays
    // ---
    // ---

    public static void main(String[] args) {
        // create 2-d array
        int[][] arr = new int[][]{
                {10, 20, 30}, // 0
                {70, 80, 90}, // 1
        };

        // print
        /* Array is 2 following the x-axis or columns */
        for(int i=0; i<arr.length; i++) {
            /* Length is 3 following the y-axis or rows*/
            for(int j=0; j<arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
        // arr[access the num of columns][access the num of rows]
        System.out.println("------");
        System.out.println(arr[1][1]); // example arr[1][1] is 80, arr[1][2] is 90, arr[0][1] is 20, etc etc...
    }
}
