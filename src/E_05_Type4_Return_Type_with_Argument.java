public class E_05_Type4_Return_Type_with_Argument {
    // Type 4 - Return Type with Argument

    static int multiplicationOfTwoNumbers(int a, int b) {
        int result = a * b;
        return result; // return value
    }

    // it's up to the developer whether they would like to use double as a data type of other.
    static double addFourNumbers(double n1, double n2, double n3, double n4) {
        return (int) (n1 + n2 + n3 + n4); // return type
    }

    public static void main(String[] args) {
        // call the func
        System.out.println(multiplicationOfTwoNumbers(2, 5));

        System.out.println(addFourNumbers(1.0, 2.0, 3.3, 4.7)); // 11.0

        // this shows that the number is added at the main function not in the parent function.
    }
}
