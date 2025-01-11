public class B_01_Assignment_Operators {
    public static void main(String[] args) {
        // Assignment Operators (=, +=, -=, /=, *=)

        int a = 10;
        int b = 5;

        a += b; // meaning a = a+b or a = 10+b
        System.out.println(a);
        // a = 15 this should be the expected result

        a -= 2; // meaning a = a-2;
        System.out.println(a);

        a /= 2; // meaning a = a/2
        System.out.println(a);

        a *= 2; // meaning a = a*2
        System.out.println(a);

        a %= 5; // meaning a = a%5
        System.out.println(a);
    }
}
