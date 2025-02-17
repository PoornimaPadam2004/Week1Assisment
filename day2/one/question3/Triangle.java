package day2.one.question3;

public class Triangle extends Shape {
	private int height;

    public Triangle(int length, int height) {
        super(length);  
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * length * height;  
    }

}
