package day2oops.question9;

public class Employee {
	String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + ", Salary: " + salary;
    }

}
