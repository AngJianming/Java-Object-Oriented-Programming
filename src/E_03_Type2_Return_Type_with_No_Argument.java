public class E_03_Type2_Return_Type_with_No_Argument {
    // Type 2 - Return Type with No Argument

    static int subtract(){
        int a = 20;
        int b = 10;
        int result = a - b;

        return result;
    }

    static String getMyName(){
        // String name = "Ang Jianming";
        // return name; these are same as return "something"

        return "Ang Jianming";

//        System.out.println() this is not need if there is a return type.

    }

    public static void main(String[] args) {
        int res = subtract(); // it will return value as int

        System.out.println(res); // value 10
        // or, both is fine chose which is more simple to your preferences
        System.out.println(subtract()); // value 10


        System.out.println(getMyName());
    }
}
