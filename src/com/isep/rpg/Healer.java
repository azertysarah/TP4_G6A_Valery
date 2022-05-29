package com.isep.rpg;

public class Healer extends SpellCaster{
    //Constructeur
    public Healer(String name) {
        super(name, 150, 2, 30, null, null, 100);
    }

    //Implémentation de la méthode abstraite attack() héritée de la classe Hero
    @Override
    public void attack() {
        System.out.println("Healer is healing!");
    }
}
