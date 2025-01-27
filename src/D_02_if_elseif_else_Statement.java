public class D_02_if_elseif_else_Statement {
    public static void main(String[] args) {
        // if elseif else statement

//        if (condition) {
//
//        } else if (condition) {
//
//        } else {
//
//        }


        // example on how to use if elseif else, else if can be used as many times as you need.
        int a = 5;
        int b = 12;
        int c = 10;

        if (a < b) {
            System.out.println(a + " is less than " + b);

        } else if (c > b) {
            System.out.println(c + " is greater than " + b);

        } else {
            int result = a+b;
            System.out.println("The result is: " + result);
        }

    }
}
