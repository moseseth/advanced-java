package org.musie.designpatterns.builder;

// Director class
class ComputerDirector {
    private final ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer buildComputer() {
        return builder.build();
    }
}
