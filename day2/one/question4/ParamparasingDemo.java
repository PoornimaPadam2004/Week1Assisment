package day2.one.question4;

public class ParamparasingDemo {
	public static void main(String[] args) {
     
        int num = 10;
        Student student = new Student(101, "John");
        String name = "Doe";

        System.out.println("Before modification:");
        System.out.println("Integer value: " + num);
        student.printStudentInfo();  
        System.out.println("String value: " + name);

        modify(num);        
        modify(student);    
        modify(name);       
        System.out.println("\nAfter modification:");
        System.out.println("Integer value: " + num);  
        student.printStudentInfo();  
        System.out.println("String value: " + name); 
    }

    public static void modify(int num) {
        num = num + 1;  
    }

    public static void modify(Student student) {
        student.modify(student);  
    }

    public static void modify(String name) {
        name = "Changed Name";  
    }

}
