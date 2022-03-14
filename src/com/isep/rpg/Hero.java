package com.isep.rpg;

import java.util.List;
import java.util.Scanner;

public abstract class Hero {
    private int lifePoints;
    private int armor;
    private int weaponDamage;
    private List<Potion> potions;
    private List<Food> lembas;

    public Hero(int lifePoints, int armor, int weaponDamage){
        this.lifePoints = lifePoints;
        this.armor = armor;
        this.weaponDamage = weaponDamage;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public List<Potion> getPotions() {
        return potions;
    }

    public void setPotions(List<Potion> potions) {
        this.potions = potions;
    }

    public List<Food> getLembas() {
        return lembas;
    }

    public void setLembas(List<Food> lembas) {
        this.lembas = lembas;
    }

    public void attack(){}
    public void defend(){}
    public void useConsumable(){
        //useConsumable(Consumable)
    }

}
