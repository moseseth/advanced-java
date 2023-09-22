package org.musie.designpatterns.bridge.one;

// Abstraction: Message
abstract class Message {
    protected MessagingPlatform platform;

    public Message(MessagingPlatform platform) {
        this.platform = platform;
    }

    public abstract void send(String recipient);
}
