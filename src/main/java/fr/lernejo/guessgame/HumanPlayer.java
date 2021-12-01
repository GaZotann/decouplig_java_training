package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;
public class HumanPlayer implements Player{
    @Override
    public long askNextGuess(){
        Scanner KeybordInput = new Scanner(System.in);
        long number = KeybordInput.nextLong();
        return number;
    }
    @Override
    public void respond(boolean lowerOrGreater){
        if(lowerOrGreater == true)
            logger.log("c'est plus grand");
        if(lowerOrGreater == false)
            this.logger.log("C'est plus petit");
    }
    private final Logger logger = LoggerFactory.getLogger("player");
}
