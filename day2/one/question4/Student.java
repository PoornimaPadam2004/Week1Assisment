package day2.one.question4;

public class Student {
	 int rollno;
	    String fname;

	    
	    public Student(int rollno, String fname) {
	        this.rollno = rollno;
	        this.fname = fname;
	    }

	    public void modify(int num) {
	        num = num + 1;
	    }

	    public void modify(Student student) {
	        student.rollno = student.rollno + 1;
	    }

	    public void modify(String name) {
	        name = "New Name"; 
	    }

	    public void printStudentInfo() {
	        System.out.println("Roll No: " + rollno + ", Name: " + fname);
	    }

}
