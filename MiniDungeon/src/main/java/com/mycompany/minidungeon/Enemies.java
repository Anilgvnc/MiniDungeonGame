package com.mycompany.minidungeon;

public class Enemies extends MainCharacter implements IDamage{
    String enemyID;
    double enemyHealth;
    double enemyDamage;
    
    public Enemies(){
        this( "enemy", 5.0, 3.0);
    }
    
    Enemies( String newEnemyID, double newEnemyHealth, double newEnemyDamage){
        this.enemyID = newEnemyID;
        this.enemyHealth = newEnemyHealth;
        this.enemyDamage = newEnemyDamage;
    }
    
    public void setCreature(String setEnemyID, double setEnemyHealth, double setEnemyDamage){
        this.enemyID = setEnemyID;
        this.enemyHealth = setEnemyHealth;
        this.enemyDamage = setEnemyDamage;
    }
    
    @Override
    public void damageTaken(){
        int rate = (int) (Math.random() * 6);
        
        if (rate % 2 != 0) {
            System.out.println( enemyID + " hit " + enemyDamage + " damage!");
            super.health -= enemyDamage;
        }
        else{
            System.out.println( enemyID + " missed");
        }
    }
    
    @Override
    public void hit(){
        int rate = (int) (Math.random() * 3);
        
        if (rate % 2 != 0) {
            System.out.println("You hit " + super.damage + " damage!");
            enemyHealth -= super.damage;
            super.exp += 1;
            super.levelUp();
        }
        else{
            System.out.println("You missed.");
        }
    }
}
