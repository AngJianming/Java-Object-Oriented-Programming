public class C_04_break_Loop_Statement {
    public static void main(String[] args) {
        // break statement

        for (int i=1; i<=10; i++) {
//            System.out.println(i); // 1,2,3,4,5,6,7
            // go out of the block if value is greater than and equal to 6.
            if (i > 6) {
                break;
            }// this {} is the block remember

            System.out.println(i);
            // if println outside of block then it will only be until 6 cause the condition is aiming for after the block not before.
        }

        System.out.println("----------");

        for (int j=1; j<=10; j++) {
            if (j == 4) {
                break;
                // j == 4 means the number of figures, usually '==' | '>=' is the same figure but > only is not. And there cannot be '<' cause on the very first iteration, j = 1. The condition j <= 4 is true, so the break statement is immediately executed.
                // This causes the for loop to terminate right away, without printing anything.
            }
                System.out.println(3+j); // 3+1 = 4, until the condition j == 4th figure then stop. So the output will only be until 3th figure.
        }
    }
}
