package Bai4;

import java.util.List;

class Employee {
    private int id;  
    private String name;
    private double salary;
    private static int employeeCount = 0; 
    private static int nextId = 1000;  
    public static String companyName = "TechCorp";  
    private static double totalSalary = 0; 

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        if(name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }
    public void setSalary(double salary) {
        if (salary >= 0) {
            totalSalary -= this.salary; 
            this.salary = salary;
            totalSalary += salary; 
        }
    }
    public Employee(String name, double salary) {
        this.id = nextId++;
        this.name = name;
        this.salary = salary;
        employeeCount++;
        totalSalary += salary;
    }
     
    public static int getEmployeeCount() {
        return employeeCount;
    }
    public static double getTotalSalary() {
        return totalSalary;
    }
    public static double getAverageSalary() {
        if (employeeCount > 0) {
            return totalSalary / employeeCount;
        }
        return 0;
    }
    public static void changeCompanyName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            companyName = newName;
        }
    }
    public void raiseSalary(double percent) {
        if (percent > 0) {
            double raiseAmount = salary * (percent / 100);
            setSalary(salary + raiseAmount);
        }
    }
}
