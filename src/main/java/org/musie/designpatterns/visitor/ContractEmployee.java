package org.musie.designpatterns.visitor;

public record ContractEmployee(String name, double hourlyRate, int hoursWorked) implements Employee {

    @Override
    public void accept(SalaryCalculator calculator) {
        calculator.calculateSalary(this);
    }
}
