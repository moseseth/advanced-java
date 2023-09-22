package org.musie.designpatterns.bridge.one;

// Refined Abstraction: PictureMessage
class PictureMessage extends Message {
    public PictureMessage(MessagingPlatform platform) {
        super(platform);
    }

    @Override
    public void send(String recipient) {
        platform.sendMessage("Picture: [Image]", recipient);
    }
}
