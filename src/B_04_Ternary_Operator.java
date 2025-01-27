public class B_04_Ternary_Operator {
    public static void main(String[] args) {
        // Ternary Operator ( ?: )
        // condition ? true : false

        int n1 = 10;
        int n2 = 20;

//        if (n2 is greater than n1) then n2 is assigned to variable greaterNum.

        /*
        * So the expression (n2 > n1) ? n2 : n1 means:
        * - If n2 > n1 is true, then use n2.
        * - Otherwise, use n1.
        */
        int greaterNum = (n2 > n1) ? n2 : n1;
        System.out.println(greaterNum);

        int n3 = 100;
        int n4 = 20;

        int greaterNum2 = (n3 > n4) ? n3 : n4;
        System.out.println(greaterNum2);

    }
}
