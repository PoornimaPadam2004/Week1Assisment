package day2oops.question8;

abstract class Employee {
    
    int empid;
    String empname;

    public void input(int empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }

    public void output() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + empname);
    }

    public abstract void roles_Responsibilities();
}

class Manager extends Employee {

    @Override
    public void roles_Responsibilities() {
        System.out.println(empname + " is responsible for overseeing the team, managing projects, and ensuring deadlines are met.");
    }
}
