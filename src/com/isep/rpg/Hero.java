package com.isep.rpg;

import java.util.ArrayList;
import java.util.List;

public abstract class Hero {
    //Paramètres
    private String name;
    private int lifePoints;
    private int armor;
    private int weaponDamage;
    private List<Potion> potions = new ArrayList<Potion>();
    public List<Food> lembas = new ArrayList<Food>();

    //Constructeur
    public Hero(String name, int lifePoints, int armor, int weaponDamage, List<Potion> potions, List<Food> lembas) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.armor = armor;
        this.weaponDamage = weaponDamage;
        this.potions = potions;
        this.lembas = lembas;
    }

    //Implémentation des méthodes abstraites héritées de la classe Hero
    public abstract void attack();
    public abstract void defend();
    public abstract void useConsumable(); //Consumable

    //Getters
    public int getLifePoints() {
        return lifePoints;
    }

    public int getArmor() {
        return armor;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public List<Potion> getPotions() {
        return potions;
    }

    public List<Food> getLembas() {
        return lembas;
    }
}
