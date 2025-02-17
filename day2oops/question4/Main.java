package day2oops.question4;

public class Main {
	public static void main(String[] args) {
     
        Account account = new Account();

        account.setAccountDetails(123456, "Savings", 5000);

        System.out.println("Account Details Before Transactions:");
        account.dispAccountDetails();

        account.withdraw();

        account.deposit();

        System.out.println("\nAccount Details After Transactions:");
        account.dispAccountDetails();
    }

}
