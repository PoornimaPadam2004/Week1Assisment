package day2oops.question7;

public class Rectangle {
	private double length;
    private double breadth;

    public Rectangle(double side) {
        this.length = side;
        this.breadth = side;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void displayDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }

}
