package day2oops.question5;

public class Main {
	public static void main(String[] args) {
       
        Student student = new Student();

        student.setStudDetails(101, "John Doe", 85, 90, 88);

        student.findTotal();

        
        System.out.println("Student Details:");
        student.dispStudDetails();
    }

}
