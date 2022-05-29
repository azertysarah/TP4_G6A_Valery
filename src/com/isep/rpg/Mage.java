package com.isep.rpg;

public class Mage extends SpellCaster{
    //Constructeur
    public Mage(String name) {
        super(name, 150, 3, 40, null, null, 70);
    }

    //Implémentation de la méthode abstraite attack() héritée de la classe Hero
    @Override
    public void attack() {
        System.out.println("Mage is casting a spell!");
    }

}
