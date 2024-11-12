package Lab3;

public class Demo {
    public class Account {
        private int id;
        private double balance;
        private double annualInterestRate;
    
        public Account() {}
    
        public Account(int id, double balance, double annualInterestRate) {
            this.id = id;
            this.balance = balance;
            this.annualInterestRate = annualInterestRate;
        }
    
        public int getId() { return id; }
        public double getBalance() { return balance; }
        public double getAnnualInterestRate() { return annualInterestRate; }
    
        public void setId(int id) { this.id = id; }
        public void setBalance(double balance) { this.balance = balance; }
        public void setAnnualInterestRate(double rate) { this.annualInterestRate = rate; }
    
        public double getMonthlyInterestRate() {
            return (annualInterestRate / 12) / 100;
        }
    
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance.");
            }
        }
    
        public void deposit(double amount) {
            balance += amount;
        }
    }
    
    // Client program
    public class AccountTest {
        public static void main(String[] args) {
            Account acc = new Account(1222, 20000, 4.5);
            acc.withdraw(2500);
            acc.deposit(3000);
            System.out.println("Balance: $" + acc.getBalance());
            System.out.println("Monthly Interest: $" + (acc.getBalance() * acc.getMonthlyInterestRate()));
        }
    }
}

