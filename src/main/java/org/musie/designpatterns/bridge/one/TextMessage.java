package org.musie.designpatterns.bridge.one;

// Refined Abstraction: TextMessage
class TextMessage extends Message {
    public TextMessage(MessagingPlatform platform) {
        super(platform);
    }

    @Override
    public void send(String recipient) {
        platform.sendMessage("Text: Hello!", recipient);
    }
}
