public class G_06_String_indexOf_method {
    // String indexOf()

    public static void main(String[] args) {

        String s1 = "my name is Ang Jianming";

        int index = s1.indexOf("name");
        System.out.println(index);
        // It will check where the "name" string will start from, the string "m","y" & " " is 0,1,2. And "n" in "name" starts at the index 3. Hence, output: 3

        int index2 = s1.indexOf("e");
        System.out.println(index2); //Output: 6 as there is only 1 letter 'e' in the entire sentence, and the 'e' is index 6

        int index3 = s1.indexOf('i', 10);
        System.out.println(index3); //Output: 16 cause we want whats the next index which is 'i' after the 10th index which will the after 's' and is the empty whitespace " ". Hence, the answer is 16 as the next 'i' in Jianming appears.

        int index4 = s1.indexOf("my", 3);
        System.out.println(index4); // Output: -1 cause it goes backwards to get to the correct index.


    }
}
