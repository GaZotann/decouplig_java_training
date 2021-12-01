package fr.lernejo.logger;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContextualLogger implements Logger{
    private Logger delegateLogger;
    private String maclasse;
    private Logger logger;
    public ContextualLogger(String message, Logger logger){
        this.delegateLogger = logger;
        this.maclasse = message;
        log(message);
    }
    @Override
    public void log(String message){
        delegateLogger.log(String.valueOf(LocalDate.now())  + " " + maclasse + " " + message);
        return;
    }






}
