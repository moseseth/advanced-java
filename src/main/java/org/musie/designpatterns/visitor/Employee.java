package org.musie.designpatterns.visitor;

public interface Employee {
    void accept(SalaryCalculator calculator);
}

