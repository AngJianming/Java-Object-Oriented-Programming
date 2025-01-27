public class D_04_Nested_if_else {
    public static void main(String[] args) {
        // nested if else

//        if (condition1) {
//            // Code to execute when condition1 is true
//
//            if (condition2) {
//                // Code to execute when condition1 is true AND condition2 is true
//            } else {
//                // Code to execute when condition1 is true AND condition2 is false
//            }
//        } else {
//            // Code to execute when condition1 is false
//
//            if (condition3) {
//                // Code to execute when condition1 is false AND condition3 is true
//            } else {
//                // Code to execute when condition1 is false AND condition3 is false
//            }
//        }


        // Example
        int number = 20; // test case
        if (number > 0) {
            System.out.println(number + " is positive.");

            if (number > 10) {
                System.out.println(number + " is also greater than 10.");
            } else {
                System.out.println(number + " is not greater than 10.");
            }

        } else {
            System.out.println(number + " is not positive.");

            if (number == 0) {
                System.out.println("Actually, it's 0.");
            } else {
                System.out.println("And it's negative.");
            }
        }

        //- Outer if checks if number is greater than 0.

        //- If true, it prints a message and then nested if checks if number is greater than 10.

        //- If false, the else part prints that the number is not positive, and another nested if-else checks whether number is exactly 0 or negative.


    }
}
