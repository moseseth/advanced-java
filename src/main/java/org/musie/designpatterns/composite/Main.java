package org.musie.designpatterns.composite;

public class Main {
    public static void main(String[] args) {
        ///////////////// Composite pattern ////////////////
        // Create individual employees
        Employee employee1 = new IndividualEmployee("Alice", "Developer");
        Employee employee2 = new IndividualEmployee("Bob", "Designer");

        // Create managers and add employees
        Manager manager1 = new Manager("Eve", "Team Lead");
        manager1.addSubordinate(employee1);
        manager1.addSubordinate(employee2);

        Employee employee3 = new IndividualEmployee("Charlie", "Developer");

        Manager manager2 = new Manager("Dave", "Department Head");
        manager2.addSubordinate(manager1);
        manager2.addSubordinate(employee3);

        // Display the organization hierarchy
        manager2.showDetails();
    }
}
