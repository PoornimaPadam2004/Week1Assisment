package day2oops.question10;

public class Main {
	public static void main(String[] args) {
     
        calculator calculator = new calc();
        int a = 10, b = 5;

        int sum = calculator.addition(a, b);
        int difference = calculator.subtraction(a, b);

        System.out.println("Addition of " + a + " and " + b + " is: " + sum);
        System.out.println("Subtraction of " + a + " and " + b + " is: " + difference);
    }

}
