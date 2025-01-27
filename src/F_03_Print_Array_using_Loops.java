public class F_03_Print_Array_using_Loops {
    //println Array using Loop
    public static void main(String[] args) {
        int[] arr = new int[] {10,20,30,40,50,60,70};
        System.out.println(arr);

        // for loop, or can use while loop
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // 10,20,30,40,50,60,70, after will not go beyond 80 cause it's i++ the 'i' comes first before the '++'

        }
        System.out.println("------");
        // 7-2 = 5 so only until 50
        for(int i = 0; i < arr.length-2; i++) {
            System.out.println(arr[i]); // 10,20,30,40,50 after will not go beyond 60 cause it's i++ the 'i' comes first before the '++'

        }
        System.out.println("------");
        int j=0;
        while(j<arr.length){
            System.out.println(arr[j]);
            j++;
        }
    }
}
