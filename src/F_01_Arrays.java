public class F_01_Arrays {
    // What is an Array & Why we use Array?

    public static void main(String[] args) {
//        the array are stored in box with how any amount of elements
//        |40|55|63|17|22|68|89|97|89|

        String[] toys = new String[5];

/*        In Java, an array is like that row of cubbyholes:

        - It can store many pieces of the same type of information (like a list of numbers or a list of words).

        - Each spot in the array has a special number called an index that tells you its position (just like how each cubbyhole has a label).
*/
//        Example with toys:
//        Think of an array like a toy box with 5 spaces:
//        Space 0: Teddy Bear
//        Space 1: Car
//        Space 2: Doll
//        Space 3: Ball
//        Space 4: Robot

        toys[0] = "Teddy Bear";
        toys[1] = "Car";
        toys[2] = "Doll";
        toys[3] = "Ball";
        toys[4] = "Robot";

        System.out.println(toys[2]);



    }
}
