public class C_05_continue_Loop_Statement {
    public static void main(String[] args) {
        // continue statement

        for (int i=1; i<=10; i++) {
            if(i == 4) {
                continue; // jump out the block, run it again
            }
        System.out.println(i); // 1,2,3,5,6,7,8,9,10 there is no 4 because the condition is met.

        } // make sure the System.out.println(i); is inside of the for loop

        System.out.println("------");

        for (int i=1; i<=10; i++) {
            if(i == 4 || i == 7) // this is the same as below
                {
                continue;
            }
            System.out.println(i); // 4 and 7 will not be shown.

        }

        System.out.println("------");

        for (int i=1; i<=10; i++) {
            if(i == 4) // same as above either way also works but the above is better and faster.
            {
                continue;
            }
            if(i == 7) {
                continue;
            }
            System.out.println(i);

        }
    } // the 'if' is based of true || false
}
