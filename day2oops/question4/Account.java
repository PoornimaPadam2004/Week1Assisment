package day2oops.question4;

public class Account {
	 private int accountNo;
	    private String accountType;
	    private int accountBalance;

	    public void setAccountDetails(int accountNo, String accountType, int accountBalance) {
	        this.accountNo = accountNo;
	        this.accountType = accountType;
	        this.accountBalance = accountBalance;
	    }

	    public void withdraw() {
	        if (accountBalance >= 1000) {
	            accountBalance -= 1000;
	            System.out.println("Withdrawal of 1000 successful. New balance: " + accountBalance);
	        } else {
	            System.out.println("Insufficient balance for withdrawal.");
	        }
	    }

	    public void deposit() {
	        accountBalance += 1000;
	        System.out.println("Deposit of 1000 successful. New balance: " + accountBalance);
	    }

	    public void dispAccountDetails() {
	        System.out.println("Account No: " + accountNo);
	        System.out.println("Account Type: " + accountType);
	        System.out.println("Account Balance: " + accountBalance);
	    }

}
