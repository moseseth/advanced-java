package org.musie.designpatterns.factory;

// Product interface
// The Factory design pattern is used to create objects without exposing the instantiation logic to the client.
interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
}

// restaurant ordering system
