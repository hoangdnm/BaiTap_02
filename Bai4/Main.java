package Bai4;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", 50000),
            new Employee("Bob", 60000),
            new Employee("Charlie", 55000)
        );
         
        for (Employee emp : employees) {
            System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName() + ", Salary: $" + emp.getSalary());
        }
        
        System.out.println("Total Employees: " + Employee.getEmployeeCount());
        System.out.println("Total Salary: $" + Employee.getTotalSalary());
        System.out.println("Average Salary: $" + Employee.getAverageSalary());
        Employee.changeCompanyName("NewTechCorp");
        System.out.println("Company Name: " + Employee.companyName);


        for (Employee emp : employees) {
            emp.raiseSalary(10);
            System.out.println("ID: " + emp.getId() + ", Name: " + emp.getName() + ", Salary: $" + emp.getSalary());
        }

  
    }
}
       