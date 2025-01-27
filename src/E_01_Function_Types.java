public class E_01_Function_Types {
    public static void main(String[] args) {
        // Functions
        // it is not possible to add a function in a main function
//        Hence, it is added out of the main function

        nameFunction(); // call the method/function

        // if without 'static void' only 'void' it will have an error calling.

        printSum();
    }

    // data type(return type), name
    static void nameFunction() {
        // write your code here
        System.out.println("Hello World! I'm Ang Jianming");
    }

    static void printSum() {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }


    /* There is 4 types of Functions
    - 1. No return type with No argument
    - 2. Return type with No argument
    - 3. No Return type with argument
    - 4. Return type with argument
     */
}

