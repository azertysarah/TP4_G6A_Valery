package com.isep.rpg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static com.isep.utils.InputParser.*;

public class Game {
    static int totalNumberOfHeroes = warriorNumber + mageNumber + hunterNumber + healerNumber;

    //Création de listes String vides pour les héros, les ennemis et l'ensemble des personnages
    static List<String> heroesString = new ArrayList<String>();
    static List<String> enemiesString = new ArrayList<String>();
    static List<String> charactersString = new ArrayList<String>();
    static List<String> randomCharactersString = new ArrayList<String>();
    static List<Hero> heroes = new ArrayList<Hero>();
    static List<Enemy> enemies = new ArrayList<Enemy>();


    public static void playGame(){
        //Générer le bon nombre de héros dans une liste String et une liste d'objets
        //Les listes Strings permettent de générer par la suite l'ordre aléatoire des personnages
        //Les listes d'objets permettent de créer les personnages et de récupérer leurs paramètres (points de vie, points d'attaques, etc.)
        for(int i=0; i<warriorNumber; i++){
            //Liste String:
            heroesString.add("Warrior "+ (i+1));
            //Liste d'objets:
            Warrior warrior = new Warrior("Warrior "+(i+1));
            heroes.add(warrior);

        }
        for(int i=0; i<mageNumber; i++){
            //Liste String:
            heroesString.add("Mage "+ (i+1));
            //Liste d'objets:
            Mage mage = new Mage("Mage "+(i+1));
            heroes.add(mage);

        }
        for(int i=0; i<hunterNumber; i++){
            //Liste String:
            heroesString.add("Hunter "+ (i+1));
            //Liste d'objets:
            Hunter hunter = new Hunter("Hunter "+(i+1));
            heroes.add(hunter);

        }
        for(int i=0; i<healerNumber; i++){
            //Liste String:
            heroesString.add("Healer "+ (i+1));
            //Liste d'objets:
            Healer healer = new Healer("Healer "+(i+1));
            heroes.add(healer);
        }

        //Générer le bon nombre d'ennemis dans une liste String et une liste d'objets
        for(int i =0; i<totalNumberOfHeroes; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(5) + 1;
            if (randomNumber == 2){
                //Liste String:
                enemiesString.add("Monster "+(i+1)+ " (BOSS)");
                //Liste d'objets:
                Boss boss = new Boss("BOSS "+(i+1));
                enemies.add(boss);
            }else{
                //Liste String:
                enemiesString.add("Monster "+(i+1));
                //Liste d'objets:
                BasicEnemy monster = new BasicEnemy("Monster "+(i+1));
                enemies.add(monster);
            }
        }

        System.out.println("Heroes list: " + heroesString);
        System.out.println("Ennemies list: " + enemiesString);

        //L'ordre d'attaque des joueurs et des ennemis est déterminé aléatoirement au début de chaque combat
        //On crée donc une liste qui regroupe à la fois les héros et les ennemis et dans une boucle on va sélectionner
        //aléatoirement des éléments de la liste 'characters' pour les placer dans la liste 'randomCharacters'
        for (int i = 0; i<totalNumberOfHeroes; i++){        //On regroupe les lites heroes et enemies dans une liste
            charactersString.add(heroesString.get(i));
            charactersString.add(enemiesString.get(i));
        }
        for (int i=0; i<(2*totalNumberOfHeroes); i++){      //On prends au hasard un élément de la liste characterString et on le place dans une autre liste
            Random random = new Random();
            int randomNumber = random.nextInt(charactersString.size());
            randomCharactersString.add(charactersString.get(randomNumber));
            charactersString.remove(charactersString.get(randomNumber));
        }
        System.out.println("Character's order of attack: "+randomCharactersString);
    }

    //Tant qu'il y a encore des personnages, on fait jouer un personnage en suivant l'ordre de la liste randomCharacterString
    static public void generateCombat(){
        while(heroes!=null || enemies!=null) {
            for(int i=0; i<randomCharactersString.size();i++){
                String characterToPlay = randomCharactersString.get(i);
                if (characterToPlay.contains("BOSS")){
                    //computerTurnBoss();
                    Random random = new Random();
                    int randomHeroToAttack = random.nextInt(heroes.size());

                    System.out.println(characterToPlay + "attacked" + heroes.get(randomHeroToAttack));
                   // System.out.println("Your hero has" + lifePoints + "left");

                }else if(characterToPlay.contains("Monster")){
                    computerTurnBasicMonster();
                }else{
                    System.out.println("What do you want to do with "+ characterToPlay+ "\n" +
                            "[1]: Attack \n" +
                            "[2]: Defend \n" +
                            "[3]: Use a consumable \n");
                    Scanner scanner = new Scanner(System.in);
                    int actionPlayer = scanner.nextInt();
                    //verifyActionPlayer()
                    playerTurn(characterToPlay,actionPlayer);
                    break;
                }
            }
        }
    }

    private static void computerTurnBoss() {
        System.out.println("BOSS");

    }
    private static void computerTurnBasicMonster() {
        System.out.println("Basic Monster");
    }

    private static void playerTurn(String hero, int action) {
        switch(hero){
            case "Warrior":

        }
    }
}
