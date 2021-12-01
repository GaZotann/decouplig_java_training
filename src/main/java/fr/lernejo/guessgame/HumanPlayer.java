package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;
public class HumanPlayer implements Player{
    @Override
    public long askNextGuess(){
        long number = 0;
        return number;
    }
    @Override
    public void respond(boolean lowerOrGreater){
        return;
    }
    private final Logger logger = LoggerFactory.getLogger("player");
}
