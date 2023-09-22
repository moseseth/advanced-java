package org.musie.designpatterns.facade;

public class Main {
    public static void main(String[] args) {
        ///////////////////// Facade design //////////////////
        EntertainmentControlFacade facade = new EntertainmentControlFacade();

        // Using the facade to control the entertainment system
        facade.watchMovie();
        System.out.println("...");

        facade.playGame();
        System.out.println("...");

        facade.turnOffEverything();
    }
}
