public class B_02_Relational_Operators {
    // ture, false (boolean)
    // Relational Operators ( ==, !=, <, >, <=, >=)

    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        System.out.println(a == b); // if a is equal to b true, otherwise false
        System.out.println(a != b); // 10 is not equal to 15 true, otherwise false
        System.out.println(a < b); // 10 is less than 15 true, otherwise false
        System.out.println(b > a); // 10 is more than 15 true, otherwise false

        System.out.println(a <= b); // 10 is less or equal to 15 true, otherwise false

        System.out.println(b >= a); // 10 is more than or equal to 15 true, otherwise false

//        10 is less than, or equal to 10 true, otherwise false.
        System.out.println(10 < 10); // is false because it cannot 10 cannot be less than 10
        System.out.println(10 <= 10); // is true because it can be less than or EQUAL to 10 (Keyword 'equal')

        System.out.println(10 > 10); // is false because it cannot 10 cannot be more than 10
        System.out.println(10 >= 10); // is true because it can be more than or EQUAL to 10 (Keyword 'equal')



    }
}
