package com.mycompany.minidungeon;

public abstract class MainCharacter implements IDamage{
    double health;
    double damage;
    String nickname;
    double exp = 0;
    int level = 1;
    
    public MainCharacter(){
        this(0.0, 0.0, "traveller");
    }
    
    
    public MainCharacter(double newHealth, double newDamage, String newNickname){
        this.health = newHealth;
        this.damage = newDamage;
        this.nickname = newNickname;
    }
    
    public void setCharacter(double setHealth, double setDamage, String setNickname){
        this.health = setHealth;
        this.damage = setDamage;
        this.nickname = setNickname;
    }
    
    public void levelUp(){
        if (exp == 10 || exp == 20) {
            level += 1;
            damage += 5;
            health += 10;
            System.out.println("You have leveled up!");
        }
    }
    
    //Prints travellers stats
    public void stats (){
        System.out.println("Traveller: " + nickname + 
                "\nHealth: " + health +
                "\nDamage: " + damage +
                "\nExperience: " + exp +
                "\nLevel: " + level);
    }
    
    @Override
    public abstract void damageTaken();
    @Override
    public abstract void hit();
    
}
