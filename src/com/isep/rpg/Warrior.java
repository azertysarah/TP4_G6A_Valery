package com.isep.rpg;

import java.util.List;

public class Warrior extends Hero{
    //Constructeur
    public Warrior(String name) {
        super(name, 250, 3, 30, null, null);
    }

    //Implémentation des méthodes abstraites héritées de la classe Hero
    @Override
    public void attack() {
        System.out.println("Warrior is attacking!");
    }

    @Override
    public void defend() {
        //if (Ennemy.attack()){
        //}
    }

    @Override
    public void useConsumable() { //Consumable p
        System.out.println("Warrior uses a consumable");
    }
}
