package TemporaryField.Wrong;

public class Employee {
    private String employeeName;
    private int employeeId;
    private double employeeSalary;

    public double calculateSalary(int daysWorked, double hourlyRate) {
        // Complex algorithm that uses employeeSalary
        // ...
        return employeeSalary;
    }
}

/*To make the code more readable and to separate the temporary field from the Employee class, 
you can create a new class called SalaryCalculator that contains the employeeSalary field and the calculateSalary method. 
The new Employee class will then use an instance of the SalaryCalculator class to calculate the salary  */

/* Go to Fixed Folder to see */