public class C_02_while_Loop {
    public static void main(String[] args) {
        //while loop

//        int initial variable=0; //declare variable first
//        while (condition) {
//            inc/dec
//        }

        int i = 1; // declare value
        while(i < 10) {
            System.out.println(i);
            i++;
        }
        // it will run, 1,2,3,4,5,6,7,8,9 but not 10 as we know i ≠ less than 10, as shown above

        int j = 10; // declare value
        while (j >= 1) {
            System.out.println(j);
            j--;
        }
        // it will run, 10,9,8,7,6,5,4,3,2,1 until 1 cause it's >= 1 | less than equal to 1
        System.out.println("---j value after the Loop---");
        System.out.println(j); // 0
    }
}
