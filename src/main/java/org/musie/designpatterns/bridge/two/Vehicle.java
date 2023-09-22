package org.musie.designpatterns.bridge.two;

// Implementor interface
// The Bridge pattern is a structural design pattern that aims
// to decouple an abstraction from its implementation, allowing both to evolve independently.
interface Vehicle {
    void startEngine();
    void stopEngine();
    void accelerate();
    void brake();
}

