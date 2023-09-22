package org.musie.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        ////////////////////////Builder Design Pattern//////////////////
        ComputerBuilder builder = new BasicComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);

        Computer basicComputer = director.buildComputer();
        basicComputer.display();

        Computer customComputer = builder
                .setProcessor("Intel Core i7")
                .setMemory("16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3070")
                .build();
        customComputer.display();
    }
}
