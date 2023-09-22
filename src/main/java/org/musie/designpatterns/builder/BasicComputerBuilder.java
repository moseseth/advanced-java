package org.musie.designpatterns.builder;

class BasicComputerBuilder implements ComputerBuilder {
    private String processor = "Default Processor";
    private String memory = "Default Memory";
    private String storage = "Default Storage";
    private String graphicsCard = "Default Graphics Card";

    @Override
    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    @Override
    public ComputerBuilder setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    @Override
    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public ComputerBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(processor, memory, storage, graphicsCard);
    }
}
