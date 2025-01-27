public class G_02_charAt_and_length_method {
    // String charAt() and length()

    public static void main(String[] args) {
        String str = "Hello";

        System.out.println(str.charAt(4)); // It should print 'o'
        System.out.println("-----");

        for(int i=0; i<str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        /*
        Output:
        H
        e
        l
        l
        o
         */
    }
}
