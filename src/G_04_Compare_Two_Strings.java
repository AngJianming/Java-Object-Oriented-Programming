public class G_04_Compare_Two_Strings {
    // Compare Two Strings

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // 1st way, the string must be same even in upper case or lower case will count as not equal.
        if(str1 == str2){
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // 2nd way using the function compareTo
        if(str1.compareTo(str2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
