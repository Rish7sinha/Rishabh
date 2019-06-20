
import java.util.Scanner;

class Employee{
    public int Id;
    public String name;
    public String department;
    private double salary;

    void setName(String name){
        this.name=name;
    }
    void setEmpId(int Id){
        this.empId=empId;
    }
    void setDepartment(String Department){
        this.department=department;
    }
    void setSalary(double salary){
        this.salary=salary;
    }
   
    String getName(){
        return name;
    }
    int getId(){
        return empId;
    }
    String getDepartment(){
        return department;
    }
    double getSalary(){
        return salary;
    }

}
public class Q7 {
    public static void main(String[] args){
        Employee emp1 = new Employee();

        Scanner input1=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name1=input1.nextLine();
        emp1.setName(name1);

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter  Employee id:  ");
        int empId1 = input2.nextInt();
        emp1.setEmpId(empId1);

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter department: ");
        String department1 = input3.nextLine();
        emp1.setDepartment(department1);

        Scanner input4 = new Scanner(System.in);
        System.out.println("Enter salary: ");
        double salary1=input4.nextDouble();
        emp1.setSalary(salary1);

      

        System.out.println("Emp: ");
        System.out.println(emp1.getName());
        System.out.println(emp1.getEmpId());
        System.out.println(emp1.getDepartment());
        System.out.println(emp1.getSalary());
        



    }
}
