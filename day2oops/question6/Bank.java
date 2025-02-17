package day2oops.question6;

public class Bank {
	public double deposit(double amount, double balance) {
        balance += amount; 
        return balance;   
    }

    public double withdraw(double amount, double balance) {
        if (balance >= amount) {
            balance -= amount; 
            return balance;    
        } else {
            System.out.println("Insufficient funds for withdrawal.");
            return 0;         
        }
    }

}
