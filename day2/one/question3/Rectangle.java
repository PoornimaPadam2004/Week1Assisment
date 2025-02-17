package day2.one.question3;

public class Rectangle extends Shape {
	 private int height;

	    public Rectangle(int length, int height) {
	        super(length);  
	        this.height = height;
	    }

	    
	    @Override
	    public double calculateArea() {
	        return length * height; 
	    }

}
