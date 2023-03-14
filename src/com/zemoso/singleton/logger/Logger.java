package com.zemoso.singleton.logger;

public class Logger {

    private static Logger loggerInstance;
    private final int noOfPrints;

    private Logger(int noOfPrints){
        this.noOfPrints =noOfPrints;
    }

    public static Logger getLoggerInstance(int noOfPrints){
        if (loggerInstance != null) {
            return loggerInstance;
        }
        synchronized(Logger.class) {
            if (loggerInstance == null) {
                loggerInstance = new Logger(noOfPrints);
            }
            return loggerInstance;
        }
    }

    public void log(String argument){
        for(int i = 1; i<=noOfPrints; i++)
            System.out.println(argument);
    }
}
