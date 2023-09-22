package org.musie.designpatterns.bridge.one;

public class Main {
    public static void main(String[] args) {
        // Example 1 - Bridge pattern
        MessagingPlatform emailPlatform = new EmailPlatform();
        MessagingPlatform smsPlatform = new SMSPlatform();

        Message textEmail = new TextMessage(emailPlatform);
        Message pictureSMS = new PictureMessage(smsPlatform);

        textEmail.send("user@example.com");
        pictureSMS.send("555-1234");
    }
}
