public class D_01_if_else_Statement {
    public static void main(String[] args) {
        // if else statement

//        if (condition) {
//
//        } else {
//
//        }


        int a = 10;
        if (a > 0) { // 10 is greater than 0, then if statement will run
            System.out.println("a is greater");
        }

        if (a > 11) { // 10 is greater than 11, then if statement will run. If it is false then it will not run.
            System.out.println("a is less than 11");
        }

        if (true) { // 10 is greater than 11, then if statement will run. If it is false then it will not run.
            System.out.println("a is true");
        }

        // test around with these condition with Arithmetic Operations
        int x = 20;
        int y = 30;

        if (!(x < y)) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }


    }
}
