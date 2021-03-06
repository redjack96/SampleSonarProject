package org.giacomo.rossi;

public class HelloSonar {
    public static void main(String[] args) {
        MyLogger.logInfo("Print da IntelliJ: Me lo analizzi? Grazie!");
        MyLogger.logWarning("Print da Eclipse 1: ora ho tolto l'analisi automatica!");
        MyLogger.logSevere("Autodistruzione tra 3 2 1 ...");
    }
}
