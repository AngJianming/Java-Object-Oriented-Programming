import javax.sound.midi.SysexMessage;

public class F_02_Create_an_Array {
    // Create an Array
    public static void main(String[] args) {
        // 1st way
        int [] arr = new int[] {10, 20,30,40,50,60};
        System.out.println(arr); // there will have a wrong outcome [I@7b23ec81
        System.out.println(arr.length); // this println the number of elements in a array there is 6 here.
        System.out.println(arr[0]); // this shows the which element you want to println.

        // 2nd way
        int[] arr2 = new int[3];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        // 3rd way
        int[] arr3;
        arr3 = new int[3];
        arr3[0] = 100;
        arr3[1] = 200;
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);


    }
}
