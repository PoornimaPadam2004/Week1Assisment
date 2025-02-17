package day2oops.question9;

public class Main {
	public static void main(String[] args) {
        
        Employee employee = new Employee("Alice", 50000);
        System.out.println(employee.toString());  

        Manager manager = new Manager("Bob", 70000, "Sales");
        System.out.println(manager.toString()); 

      
        Executive executive = new Executive("Charlie", 90000, "Marketing");
        System.out.println(executive.toString()); 
    }


}
