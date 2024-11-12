package Lab2;

public class Exercise_13_Sum_of_Prime_Num_First100 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("Sum of prime numbers in the first 100 numbers: " + sum);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
