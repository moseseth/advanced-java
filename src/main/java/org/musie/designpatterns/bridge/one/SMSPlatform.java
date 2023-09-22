package org.musie.designpatterns.bridge.one;

// Concrete Implementor: SMSPlatform
class SMSPlatform implements MessagingPlatform {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}
