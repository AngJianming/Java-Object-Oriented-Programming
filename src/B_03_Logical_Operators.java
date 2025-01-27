import java.security.spec.RSAOtherPrimeInfo;

public class B_03_Logical_Operators {
    public static void main(String[] args) {
        // Logical Operator ( &&, ||, !)


        // AND (&&) - is all condition is true then return true.
//         true && true = true
//         true && false = false
//         false && true = false
//         false && false = false
        System.out.println(10>5);
        System.out.println(20>14);
        System.out.println((10>5) && (20>14));


        // OR (||) - if any condition is true, then return true.
//         true || true = true
//         true || false = true
//         false || true = true
//         false || false = false
        System.out.println((10>5) || (20<14));
        System.out.println((10<5) || (20<14) || (10<2) || (1000<999) || (1<0));
        // false, false, false, false, true. Hence, it's true still.

        System.out.println((10<5) || (20<14) || (10<2) || (1000<999) || true);
        // If at the end is true then all is true.

        System.out.println((10<5) || (20<14) || (10<2) || (1000<999) || false);
        // If at the end is all is false then false.


        // NOT(!) - vice-versa
//        true = false
//        false = true

        System.out.println(!(100>99)); // Not true. Therefore, false

        System.out.println(!(100>99) && (2>0));
        // !true AND true = false

        System.out.println(!(20>20) || !(10<=20));
        // !false OR !true = true



    }
}
