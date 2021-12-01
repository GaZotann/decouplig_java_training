package fr.lernejo.logger;

public class CompositeLogger implements Logger{
    private Logger logger1;
    private Logger logger2;
    private String message;
    public CompositeLogger(String message, Logger logger1, Logger logger2){
        this.logger1 = logger1;
        this.logger2 = logger2;
        this.message = message;
        log(message);
    }

    @Override
    public void log(String message){
        logger1.log(message);
        logger2.log(message);
    }
}
