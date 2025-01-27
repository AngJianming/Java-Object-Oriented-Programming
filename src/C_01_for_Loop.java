public class C_01_for_Loop {
    public static void main(String[] args) {
        // for loop

//        for(initial variable, condition, inc/dec from initial value) {
//            System.out.println(initial variable)
//        }

        int i; // declare value
        for(i=1; i<=5; i++) {
            System.out.println(i);
        } // {} this is a block condition

        System.out.println("---After the for Loop---");
        System.out.println(i);


        // declared value can also be inside initial value
        for(int b=1; b<=5; b++) {
            System.out.println(b);
        }
    }
}
