// Encapsulation.java
class Account {
    
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(5000);
        System.out.println("Balance: " + acc.getBalance());
    }
}
