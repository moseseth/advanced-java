package org.musie.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

// Composite class: Manager
class Manager implements Employee {
    private final String name;
    private final String position;
    private final List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void addSubordinate(Employee subordinate) {
        subordinates.add(subordinate);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name + ", Position: " + position);
        for (Employee subordinate : subordinates) {
            subordinate.showDetails();
        }
    }
}
