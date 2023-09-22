package org.musie.designpatterns.facade;

// Facade
class EntertainmentControlFacade {
    private final TV tv;
    private final SoundSystem soundSystem;
    private final StreamingDevice streamingDevice;
    private final GamingConsole gamingConsole;

    public EntertainmentControlFacade() {
        tv = new TV();
        soundSystem = new SoundSystem();
        streamingDevice = new StreamingDevice();
        gamingConsole = new GamingConsole();
    }

    void watchMovie() {
        tv.turnOn();
        soundSystem.turnOn();
        streamingDevice.startStreaming();
    }

    void playGame() {
        tv.turnOn();
        soundSystem.turnOn();
        gamingConsole.startGame();
    }

    void turnOffEverything() {
        tv.turnOff();
        soundSystem.turnOff();
        streamingDevice.stopStreaming();
        gamingConsole.stopGame();
    }
}
