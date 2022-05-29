package com.isep.rpg;

public class Hunter extends Hero{
    private int arrows = 20;

    //Constructeur
    public Hunter(String name) {
        super(name, 200, 2, 20, null, null);
        this.arrows = arrows;
    }

    //Implémentation des méthodes abstraites héritées de la classe Hero
    @Override
    public void attack() {
        System.out.println("Hunter is attacking!");
    }

    @Override
    public void defend() {
        System.out.println("Hunter is defending!");
    }

    @Override
    public void useConsumable() { //Consumable
        System.out.println("Hunter uses a consumable");
    }
}
