package org.musie.designpatterns.command;

interface OrderCommand {
    void execute();
    void cancel();
}
