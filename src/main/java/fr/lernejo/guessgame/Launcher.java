package fr.lernejo.guessgame;

import com.sun.jdi.LongValue;
import fr.lernejo.guessgame.Simulation;
import fr.lernejo.logger.ConsoleLogger;
import fr.lernejo.logger.Logger;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;

public class Launcher {
    public static void main(String[] args){
        if(args[0].equals("-interactive")){
            SecureRandom random = new SecureRandom();
            long randomNumber = random.nextInt(100);
            Player player = new HumanPlayer();
            Simulation simulation = new Simulation(player);
            simulation.initialize(randomNumber);
            simulation.loopUntilPlayerSucceed(100);
        }
        else if(args[0].equals("-auto")){
            long randomNumber;
            if(args[1] == null ){
                SecureRandom random = new SecureRandom();
                randomNumber = random.nextInt(Integer.parseInt("50000"));
            }
            else{
                randomNumber = Long.valueOf(args[1]);
            }
            Player player = new ComputerPlayer();
            Simulation simulation = new Simulation(player);
            simulation.initialize(randomNumber);
            simulation.loopUntilPlayerSucceed(1000);
        }
        else{
            System.out.println("Il faut mettre -interactve ou -auto number en param pour lancer le programme");
        }


    }
}
