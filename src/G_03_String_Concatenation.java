public class G_03_String_Concatenation {
    // String Concatenation

    public static void main(String[] args) {
        // 1st way using '+'
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1 + " " + str2);

        // 2nd way using concat
        String result = str1.concat(" " + str2); // for two strings
        System.out.println(result);

        // 3rd way using format
        String first = "Hello";
        String second = "World";
        String combined = String.format("%s, %s!", first, second);
        System.out.println(combined);

        // 4th way using join
        String c = String.join(", ", "Hello", "World");
        System.out.println(c);
    }
}
