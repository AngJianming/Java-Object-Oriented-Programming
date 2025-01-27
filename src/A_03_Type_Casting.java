public class A_03_Type_Casting {
    // Implicit Type Casting (automatic by compiler)
    // byte -> short -> char -> int -> long -> float -> double

    // Explicit Type Casting
    // double -> float -> long -> int -> char -> short -> byte

    public static void main(String[] args) {
        // Implicit
        int number1 = 10;
        double number2 = number1;

        System.out.println(number2);

        // Explicit
        double num1 = 20.44;
        int num2 = (int)num1;

        System.out.print(num2);
    }
}
