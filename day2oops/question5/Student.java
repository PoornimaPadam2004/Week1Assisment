package day2oops.question5;

public class Student {
	private int rollNo;
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;
    private int total;

    public void setStudDetails(int rollNo, String name, int mark1, int mark2, int mark3) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public void findTotal() {
        total = mark1 + mark2 + mark3;  
    }

    public void dispStudDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
    }

}
