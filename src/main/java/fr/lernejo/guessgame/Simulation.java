package fr.lernejo.guessgame;
import fr.lernejo.guessgame.Player;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.security.SecureRandom;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Date;

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
        long number = player.askNextGuess();
        if(number == NumberToGuess) {
            this.logger.log("C'est la bonne réponse, result: " + NumberToGuess);
            return true;
        }
        else if(number > NumberToGuess){//un truc
            player.respond(false);
            return false;
        }
        else{
            player.respond(true);
            return false;
        }
    }
    public void loopUntilPlayerSucceed(int iteration){

        boolean var;
        int i = -1;
        long startTime = System.currentTimeMillis();
        do{
            var = nextRound();
            i++;
        }while (var == false && i <= iteration);
        if(i>= iteration){
            System.out.println("Max iteration reach...");
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        SimpleDateFormat value = new SimpleDateFormat("mm:ss:SSS");
        String format = value.format(new Date(duration));
        this.logger.log(format);
    }
}
