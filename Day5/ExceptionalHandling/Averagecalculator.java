package Day5.ExceptionalHandling;

public class Averagecalculator {
	 public double calAverage(int n) {
	       
	        if (n <= 0) {
	            throw new IllegalArgumentException("Input must be a natural number greater than 0");
	        }

	        double sum = (n * (n + 1)) / 2.0;

	        return sum / n;
	    }

	    public static void main(String[] args) {
	        Averagecalculator calculator = new Averagecalculator();

	        try {
	            int n = 5;  
	            double average = calculator.calAverage(n);
	            System.out.println("The average of the first " + n + " natural numbers is: " + average);
	        } catch (IllegalArgumentException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

}
