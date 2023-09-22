package org.musie.designpatterns.facade;

// Subsystem #3: Streaming Device
class StreamingDevice {
    void startStreaming() {
        System.out.println("Streaming device is streaming content");
    }

    void stopStreaming() {
        System.out.println("Streaming device has stopped streaming");
    }
}
