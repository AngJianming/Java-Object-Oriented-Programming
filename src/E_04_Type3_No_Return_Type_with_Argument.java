public class E_04_Type3_No_Return_Type_with_Argument {
    // Type 3 - No Return Type with Argument

    static void printName (String name) { //  (data type, variable)
        System.out.println(name);
    }

    static void sumOfThreeNumber (int n1, int n2, int n3) {
        int result = n1 + n2 + n3;
        System.out.println(result);
    }

    public static void main(String[] args) {
        printName("Ang Jianming");

        // call the function
        sumOfThreeNumber(10, 20, 30);


    }
}
