package com.company;

import java.util.Scanner;

import static com.isep.rpg.Game.generateCombat;
import static com.isep.rpg.Game.playGame;
import static com.isep.utils.InputParser.enterGameParameters;


public class Main {

    public static void main(String[] args) {
        enterGameParameters();
        playGame();

    }

}
