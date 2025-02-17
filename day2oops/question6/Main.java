package day2oops.question6;

public class Main {
	 public static void main(String[] args) {
	        Bank bank = new Bank();  
	        
	        double balance = 5000.0; 
	        double depositAmount = 2000.0; 
	        double withdrawAmount = 3000.0;        
	        System.out.println("Initial Balance: " + balance);

	        balance = bank.deposit(depositAmount, balance);
	        System.out.println("Balance after deposit of " + depositAmount + ": " + balance);

	        balance = bank.withdraw(withdrawAmount, balance);
	        System.out.println("Balance after withdrawal of " + withdrawAmount + ": " + balance);

	        balance = bank.withdraw(10000.0, balance); // Trying to withdraw more than available
	        System.out.println("Balance after withdrawal attempt: " + balance);
	    }

}
