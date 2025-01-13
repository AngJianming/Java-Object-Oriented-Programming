package Lab2;

public class Exercise_12_Perfect_Num_First100000 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100000; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) sum += j;
            }
            if (sum == i) {
                System.out.println(i + " is a Perfect Number.");
            }
        }
    }
}
