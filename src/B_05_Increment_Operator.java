public class B_05_Increment_Operator {
    public static void main(String[] args) {
        // Increment Operator (++)

        int a = 10;
//        a++; // post-increment (a = a+1)
//        ++a; // pre-increment (a = 1+a)

        System.out.println(a);

        a++;
        a++;
        System.out.println(a++);

        ++a;
        ++a;
        System.out.println(++a);

        System.out.println(a++);

        System.out.println(++a);
        // the reason why it's 18 insted of 17 is cause a++ will print out the current value 16 first, only after that it will add up to +1. Hence, the output for ++a would be 17+1 = 18;




    }
}
