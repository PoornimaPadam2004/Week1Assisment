package day2oops.question7;

public class Main {
	public static void main(String[] args) {
    
        Rectangle square = new Rectangle(5.0);
        System.out.println("Dimensions of the square (same length and breadth):");
        square.displayDimensions();

        Rectangle rectangle = new Rectangle(6.0, 3.0);
        System.out.println("\nDimensions of the rectangle (different length and breadth):");
        rectangle.displayDimensions();
    }

}
