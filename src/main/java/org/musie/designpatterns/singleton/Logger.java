package org.musie.designpatterns.singleton;

// Singleton design pattern using a class representing a Logger
public class Logger {
    private static Logger instance;
    private String logContent;

    private Logger() {
        logContent = "";
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        logContent += message + "\n";
    }

    public String getLogContent() {
        return logContent;
    }
}

