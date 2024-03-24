package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MontyHallParadox {
    public static void main(String[] args) {
        int totalTests = 1000;
        Map<Integer, String> results = new HashMap<>();

        int wins = 0;
        int losses = 0;

        Random random = new Random();

        for (int i = 1; i <= totalTests; i++) {

            int prizeDoor = random.nextInt(3) + 1;


            int playerChoice = random.nextInt(3) + 1;


            int openDoor;
            do {
                openDoor = random.nextInt(3) + 1;
            } while (openDoor == prizeDoor || openDoor == playerChoice);


            int finalChoice;
            do {
                finalChoice = random.nextInt(3) + 1;
            } while (finalChoice == openDoor || finalChoice == playerChoice);


            if (finalChoice == prizeDoor) {
                wins++;
                results.put(i, "win");
            } else {
                losses++;
                results.put(i, "loss");
            }
        }




        System.out.println("Results:");
        for (Map.Entry<Integer, String> entry : results.entrySet()) {
            System.out.println("Test " + entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Total Wins: " + wins);
        System.out.println("Total Losses: " + losses);
    }
}
