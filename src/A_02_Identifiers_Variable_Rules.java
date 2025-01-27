public class A_02_Identifiers_Variable_Rules {
    public static void main(String[] args) {
        // keyboard tip: Alt + z = To view all the contents
        // keyboard tip: Ctrl + / = Comment a line

        // Rules:
        // 1) Variable Names can contain letters, digits, underscores, and dollar signs
        // 2) Variable Names must begin with a letter, $ or _ (doesn't matter Uppercase or Lowercase)
        // 3) Variable Names best practice should start with lowercase letter, and cannot contain whitespace
        // 4) Variable Names are case-sensitive (e.g: "Name" and "name" are different variables)
        // 5) Reserved words like Java keywords (e.g: int, boolean, char) cannot be used as Variable Names.

        int a_1$ = 10;
        int A_1$ = 10;

        // as you can see there is an error as it has a white spacing in between.
//        int a_ 3$ = 10;

        System.out.println(a_1$);
        System.out.println(A_1$);

        // this file will not run as there is an error
//        System.out.println(a_ 3$);

        // similarly there will be an error cause you cannot use reserved words as Variable Names.
//        String int = 'Hello World!'
//        int String = 10;

        // however, why does it work for this? It's cause the string is not a data type keyword *String* is not string. Hence, it why Java is case sensitive.
        int string = 10;
        System.out.println(string);

    }
}
