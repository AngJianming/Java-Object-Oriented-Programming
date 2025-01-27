public class F_04_Print_Array_using_For_Each_Loops {
    // Print Array using For Each Loop
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        for(int element : arr) {
            System.out.println(element); // it will read the element one by one
        }

        System.out.println("------");

        String[] fruits = new String[] {"Apple", "Banana", "Orange", "Pear"};
        for(String ele : fruits) {

            if(ele == "Banana") {
                break;
            }
            // : Reads as "in" or "for each element in". It tells Java to go through each item in the array.
            // The loop will start and only look through until the 'if' statement which in this case is Banana, hence it only print an output 'Apple' if it was Orange instead, the output will be 'Apple' and 'Banana'. And if it's Pear so on...

            System.out.println(ele);
        }
    }
}
