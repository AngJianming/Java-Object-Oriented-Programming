public class C_03_do_while_Loop {
    public static void main(String[] args) {
        // do while loop

//        initial variable
//        do {
//            inc/dec
//        } while (condition);

        int a = 1;
        do {
            System.out.println(a);
            a++;
        } while(a<=10);
        // 1,2,3,4,5,6,7,8,9,10 cause it's less than and EQUAL to 10



        int i = 1;
        do {
            System.out.println(i);
            i = i+2;
        } while(i<=10);
        // 1,3,5,7,9 it starts with 1 as declared value, then move on with a +2 until <=10
        // in order to find out whether 'i' have the value of 11 after the loop or not we can use
        System.out.println("--after the do while Loop--");
        System.out.println(i); // which indeed does have the value of 11 after the loop



        int b = 10;
        do {
            System.out.println(b);
        } while (b<5);
        // 10<5, false cause the condition is executed before the block statement which is (b<5); in this case.


    }
}
