package org.musie.designpatterns.visitor;

public interface SalaryCalculator {
    void calculateSalary(RegularEmployee employee);
    void calculateSalary(ContractEmployee employee);
}

