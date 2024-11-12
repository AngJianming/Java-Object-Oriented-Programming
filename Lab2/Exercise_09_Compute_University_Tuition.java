package Lab2;

public class Exercise_09_Compute_University_Tuition {
    public static void main(String[] args) {
        double tuition = 10000;
        double rate = 0.05;
        
        for (int year = 1; year <= 10; year++) {
            tuition += tuition * rate;
        }
        
        System.out.println("Tuition after 10 years: RM" + tuition);
    }
}
