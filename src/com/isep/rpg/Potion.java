package com.isep.rpg;

import com.isep.rpg.Consumable;

public class Potion implements Consumable {
    private int potionManaPoints;

    @Override
    public void useConsumable(Hero p) {
        potionManaPoints =+ 20;
    }
}
