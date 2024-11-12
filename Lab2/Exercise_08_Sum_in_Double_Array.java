package Lab2;

public class Exercise_08_Sum_in_Double_Array {
    public static void main(String[] args) {
        double[] numbers = new double[100];
        double sum = 0;
        
        // Initialize array with some values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1; // Fill with values 1 to 100
        }
        
        // Enhanced for loop
        for (double num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of all values: " + sum);
    }
}