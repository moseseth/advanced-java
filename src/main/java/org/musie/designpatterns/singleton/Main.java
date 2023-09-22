package org.musie.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        ///////////////Singleton design////////////////////

        // Get the Logger instance
        Logger logger = Logger.getInstance();

        // Log some messages
        logger.log("Message 1");
        logger.log("Message 2");

        // Get the same Logger instance again
        Logger sameLogger = Logger.getInstance();

        // Log another message using the same instance
        sameLogger.log("Message 3");

        // Print the log content
        System.out.println("Log Content:");
        System.out.println(logger.getLogContent());
    }
}
