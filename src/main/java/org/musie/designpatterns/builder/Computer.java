package org.musie.designpatterns.builder;

// Product class
// The Builder design pattern is used to create complex objects step by step.
class Computer {
    private final String processor;
    private final String memory;
    private final String storage;
    private final String graphicsCard;

    public Computer(String processor, String memory, String storage, String graphicsCard) {
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }

    public void display() {
        System.out.println("Computer Configuration:");
        System.out.println("Processor: " + processor);
        System.out.println("Memory: " + memory);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + graphicsCard);
    }
}
