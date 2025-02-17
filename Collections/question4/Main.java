package Collections.question4;

import java.util.*;
public class Main {
	    public static void main(String[] args) {
	       
	        Set<Employee> employeeSet = new TreeSet<>();

	        employeeSet.add(new Employee(101, "John", "Doe"));
	        employeeSet.add(new Employee(102, "Alice", "Smith"));
	        employeeSet.add(new Employee(103, "Bob", "Johnson"));
	        employeeSet.add(new Employee(104, "Charlie", "Brown"));
	        employeeSet.add(new Employee(105, "Eve", "Davis"));
	        employeeSet.add(new Employee(106, "Alice", "Williams"));  

	        System.out.println("Employees sorted by empid:");
	        for (Employee emp : employeeSet) {
	            System.out.println(emp);
	        }

	        Set<Employee> sortedByFirstName = new TreeSet<>(Employee.sortByFirstName);
	        sortedByFirstName.addAll(employeeSet);

	        System.out.println("\nEmployees sorted by firstname:");
	        for (Employee emp : sortedByFirstName) {
	            System.out.println(emp);
	        }
	    }
	}