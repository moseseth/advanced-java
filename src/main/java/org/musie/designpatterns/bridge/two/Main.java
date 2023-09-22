package org.musie.designpatterns.bridge.two;

public class Main {
    public static void main(String[] args) {
        ////////////////////// Bridge pattern ////////////////
        // Example 2
        Vehicle car = new Car();
        Vehicle boat = new Boat();

        RemoteControl carRemote = new CarRemoteControl(car);
        RemoteControl boatRemote = new BoatRemoteControl(boat);

        carRemote.powerOn();
        carRemote.increaseSpeed();
        carRemote.decreaseSpeed();
        carRemote.powerOff();

        boatRemote.powerOn();
        boatRemote.increaseSpeed();
        boatRemote.decreaseSpeed();
        boatRemote.powerOff();
    }
}
