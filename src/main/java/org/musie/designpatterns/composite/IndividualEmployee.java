package org.musie.designpatterns.composite;

// Leaf class: Individual Employee
class IndividualEmployee implements Employee {
    private final String name;
    private final String position;

    public IndividualEmployee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee: " + name + ", Position: " + position);
    }
}
