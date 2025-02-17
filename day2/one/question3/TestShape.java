package day2.one.question3;

public class TestShape {
	public static void main(String[] args) {
        
        Shape[] shapes = new Shape[3];

        
        shapes[0] = new Rectangle(5, 10);  
        shapes[1] = new Square(4);        
        shapes[2] = new Triangle(6, 8);    

 
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }

}
