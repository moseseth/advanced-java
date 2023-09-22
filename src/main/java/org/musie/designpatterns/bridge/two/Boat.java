package org.musie.designpatterns.bridge.two;

// Concrete Implementor: Boat
class Boat implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Boat engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Boat engine stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Boat moving faster");
    }

    @Override
    public void brake() {
        System.out.println("Boat slowing down");
    }
}
