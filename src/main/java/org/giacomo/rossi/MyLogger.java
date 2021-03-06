package org.giacomo.rossi;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {

    private static final String LOGGER_NAME = "MyLogger";
    private static final Logger instance = Logger.getLogger(LOGGER_NAME);

    private MyLogger(){
        instance.setLevel(Level.FINEST);
    }

    public static void logInfo(String message){
        instance.log(Level.INFO, message);
    }

    public static void logWarning(String message){
        instance.log(Level.WARNING, message);
    }

    public static void logSevere(String message){
        instance.log(Level.SEVERE, message);
    }
}
