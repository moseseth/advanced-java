package org.musie.designpatterns.visitor;

public class Main {
    public static void main(String[] args) {
        //////////////////////////// Visitor pattern ///////////////////
        org.musie.designpatterns.visitor.Employee regularEmployee = new RegularEmployee("John", 50000);
        org.musie.designpatterns.visitor.Employee contractEmployee = new ContractEmployee("Alice", 20, 40);

        SalaryCalculator salaryCalculator = new ConcreteSalaryCalculator();

        regularEmployee.accept(salaryCalculator);
        contractEmployee.accept(salaryCalculator);
    }
}
