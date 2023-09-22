package org.musie.designpatterns.bridge.one;

// Concrete Implementor: EmailPlatform
class EmailPlatform implements MessagingPlatform {
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}
