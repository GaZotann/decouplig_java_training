package fr.lernejo.guessgame;
import fr.lernejo.guessgame.Player;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.security.SecureRandom;

import java.util.Scanner;

public class Simulation{
    private final Logger logger = LoggerFactory.getLogger("Simulation");
    private final Player player;
    private long NumberToGuess;

    public Simulation(Player player){
        this.player = player;
    }
    public  void initialize(long numberToGuess) {
        this.NumberToGuess = numberToGuess;
    }
    private boolean nextRound(){
        Scanner KeybordInput = new Scanner(System.in);
        long number = KeybordInput.nextInt();
        if(number == NumberToGuess) {
            this.logger.log("C'est la bonne réponse");
            return true;
        }
        else if(number > NumberToGuess){//un truc
            this.logger.log("C'est plus petit");
            return false;
        }
        else{
            this.logger.log("C'est plus grand");
            return false;
        }
    }
    public void loopUntilPlayerSucceed(){
        boolean var;
        do{
            var = nextRound();
        }while (var == false);
    }
}
