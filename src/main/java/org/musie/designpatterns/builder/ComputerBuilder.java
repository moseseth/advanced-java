package org.musie.designpatterns.builder;

// Builder interface
interface ComputerBuilder {
    ComputerBuilder setProcessor(String processor);
    ComputerBuilder setMemory(String memory);
    ComputerBuilder setStorage(String storage);
    ComputerBuilder setGraphicsCard(String graphicsCard);
    Computer build();
}
