package org.musie.designpatterns.decorator;

// Component interface
//  structural design pattern that allows behavior to be added to individual objects,
//  either statically or dynamically, without affecting the behavior of other objects from the same class
public interface Coffee {
    double cost();
    String description();
}
