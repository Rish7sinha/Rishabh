package Employee;

import java.util.Scanner;

public class Emp {
    public int empId;
    public String name;
    public String department;
    private double salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


public static void main(String args[]) {
    Emp enq = new Emp();

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter ID: ");
    int name1 = input1.nextInt();
    enq.setEmpId(name1);

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Name: ");
    String name2 = input2.nextLine();
    enq.setName(name2);

    Scanner input3 = new Scanner(System.in);
    System.out.println("Enter Department: ");
    String name3 = input3.nextLine();
    enq.setDepartment(name3);

    Scanner input4 = new Scanner(System.in);
    System.out.println("Enter Salary: ");
    Double name4 = input4.nextDouble();
    enq.setSalary(name4);

    System.out.println(enq.getEmpId());
    System.out.println(enq.getName());
    System.out.println(enq.getDepartment());
    System.out.println(enq.getSalary());


}

}