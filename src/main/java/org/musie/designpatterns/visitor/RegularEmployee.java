package org.musie.designpatterns.visitor;

public record RegularEmployee(String name, double baseSalary) implements Employee {

    @Override
    public void accept(SalaryCalculator calculator) {
        calculator.calculateSalary(this);
    }
}
