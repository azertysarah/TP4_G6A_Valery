package com.isep.rpg;

public abstract class Enemy {
    //Paramètres
    private String name;
    private int LifePoints;
    private int Damage;

    //Constructeur
    public Enemy(String name, int LifePoints, int Damage) {
        name = this.name;
        LifePoints = this.LifePoints;
        Damage = this.Damage;
    }

    //Pas de méthode abstraite pour l'attaque des ennemies parce que ce sont les mêmes
    public void attack(){
    }
}
