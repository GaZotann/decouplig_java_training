package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class ComputerPlayer implements Player{
    @Override
    public long askNextGuess(){
        number = (min + max)/2;
        return number;
    }
    @Override
    public void respond(boolean lowerOrGreater){
        if(lowerOrGreater == true){
            logger.log("c'est plus grand que " + number);
            min = number;
        }
        if(lowerOrGreater == false) {
            this.logger.log("C'est plus petit que "+ number);
            max = number;
        }
    }
    long min = 0;
    long max = Long.MAX_VALUE;
    long number;
    private final Logger logger = LoggerFactory.getLogger("ComputerPlayer");
}
