package com.isep.utils;

import com.isep.rpg.Hero;
import com.isep.rpg.Warrior;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputParser {
    //Paramètres initiaux
    public static int warriorNumber =0;
    public static int mageNumber = 0;
    public static int hunterNumber = 0;
    public static int healerNumber = 0;

    public static void enterGameParameters() {
        Scanner scanner = new Scanner(System.in);

        //Demander et enregistrer le nombre de héros
        System.out.println("Enter the number of heroes you want to play with (between 2 and 5) ");
        int heroesNumber = scanner.nextInt();
        //Boucle avec message d'erreur si le nombre n'est pas compris entre 2 et 5
        while(heroesNumber<2 || heroesNumber>6){
            System.out.println("Please enter a integer number between 2 and 5");
            heroesNumber = scanner.nextInt();
        }

        //Spécifier le type de chaque héros (warrior, mage, hunter, healer)
        System.out.println("For each of your hero, enter the right number:\n" +
                    "[1]: Warrior \n" +
                    "[2]: Mage \n" +
                    "[3]: Hunter \n" +
                    "[4]: Healer \n");
        for (int i = 1; i< heroesNumber+1; i++){
            System.out.println("Hero number "+i+" will be?");
            int heroType = scanner.nextInt();
            if (heroType == 1){
                warriorNumber = warriorNumber + 1;
            }else if (heroType == 2){
                mageNumber = mageNumber + 1;
            }else if (heroType == 3){
                hunterNumber = hunterNumber + 1;
            }else if (heroType == 4) {
                healerNumber = healerNumber + 1;
            }
        }

        //Montrer la composition finale de l'équipe
        System.out.println("To summarize, your team is composed of " +
                warriorNumber + " warrior(s), " +
                mageNumber + " mage(s), " +
                hunterNumber + " hunter(s) and " +
                healerNumber + " healer(s).\n");
    }

    public static void verifyActionPlayer(int actionPlayer){

    }

}
