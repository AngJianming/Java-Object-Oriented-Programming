public class G_07_String_replace_method {
    // String replace()

    public static void main(String[] args) {
        String s1 = "Hello Hello Hello"; //H - C, Cello

        // using .replace method you can change the String for single value
        String newS1 = s1.replace('H', 'C');
        String newS2 = newS1.replace('l', 'p');

        System.out.println(newS1); // Output: Cello
        System.out.println(newS2); // Output: Ceppo
    }
}
