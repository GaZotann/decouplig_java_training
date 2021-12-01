package fr.lernejo.logger;
import fr.lernejo.logger.Logger;

public class LoggerFactory{
    public static Logger getLogger(String Name){
        //return new ConsoleLogger();
        return new ContextualLogger(Name, new FileLogger("./FileLogger.txt"));
    }
}
