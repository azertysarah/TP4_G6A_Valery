package com.isep.rpg;

public class BasicEnemy extends Enemy{
    //Constructeur
    public BasicEnemy(String name) {
        super(name, 250, 20);
    }

    //Implémentation des méthodes abstraites héritées de la classe Enemy
    @Override
    public void attack() {
        System.out.println("A monster is attacking!");
    }
}