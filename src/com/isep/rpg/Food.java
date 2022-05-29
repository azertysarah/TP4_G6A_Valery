package com.isep.rpg;

public class Food implements Consumable{
    private int foodLifePoints;

    @Override
    public void useConsumable(Hero p) {
        foodLifePoints =+ 20;
    }
}
