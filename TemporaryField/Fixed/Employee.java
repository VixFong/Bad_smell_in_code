package TemporaryField.Fixed;

public class Employee {
    private String employeeName;
    private int employeeId;
    private SalaryCalculator salaryCalculator;

    public double calculateSalary(int daysWorked, double hourlyRate) {
        return salaryCalculator.calculateSalary(daysWorked, hourlyRate);
    }
}

/* the Employee class no longer has the employeeSalary field, and instead uses the SalaryCalculator 
class to calculate the salary. The SalaryCalculator class contains the employeeSalary field and the 
calculateSalary method that was previously in the Employee class. This makes the code easier to read and 
understand, and separates the concerns of calculating the salary and managing the employee object. */



