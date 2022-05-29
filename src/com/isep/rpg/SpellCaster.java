package com.isep.rpg;

import java.util.List;

public abstract class SpellCaster extends Hero{
    private int manaPoints;

    //Constructeur
    public SpellCaster(String name, int lifePoints, int armor, int weaponDamage, List<Potion> potions, List<Food> lembas, int manaPoints) {
        super(name, lifePoints, armor, weaponDamage, potions, lembas);
        this.manaPoints = manaPoints;
    }

    //Implémentation des méthodes abstraites héritées de la classe Hero

    //On n'implémente pas la méthode attack() dans la classe SpellCaster
    //On veut spécifier la méthode attack() en fonction des classes Mage et Healer
    //Le mage attaque tandis que le Healer soigne

    @Override
    public void defend() {
        System.out.println("Spell caster is defending!");
    }

    @Override
    public void useConsumable() {
        System.out.println("Spell caster uses a consumable");
    }
}
