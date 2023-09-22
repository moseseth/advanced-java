package org.musie.designpatterns.visitor;

public class ConcreteSalaryCalculator implements SalaryCalculator {
    @Override
    public void calculateSalary(RegularEmployee employee) {
        // Calculate regular employee's salary based on base salary
        double totalSalary = employee.baseSalary();
        System.out.println(employee.name() + "'s salary: $" + totalSalary);
    }

    @Override
    public void calculateSalary(ContractEmployee employee) {
        // Calculate contract employee's salary based on hourly rate and hours worked
        double totalSalary = employee.hourlyRate() * employee.hoursWorked();
        System.out.println(employee.name() + "'s salary: $" + totalSalary);
    }
}
