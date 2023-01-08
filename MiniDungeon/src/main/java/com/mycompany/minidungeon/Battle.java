package com.mycompany.minidungeon;

import java.util.Scanner;

/**
 *
 * @author guven
 */
public class Battle extends Enemies{
    public void randomEnemy(){
        int rand = (int) (Math.random() * 2);
        if (rand == 1) {
            super.setCreature("Zombie", 10.0, 2);
        }
        else{
            super.setCreature("Skeleton", 10.0, 2);
        }
    }
    public void fight(){
        Scanner scanner = new Scanner(System.in);
        int numberOfTurns = 0;
        int choice;
        boolean turn = true;
        randomEnemy();
        System.out.println("*********Fight!!!*********");
        System.out.println("You met a " + super.enemyID);
        
        while(true){
            if (turn == true && super.enemyHealth != 0 && super.health != 0) {
                System.out.println("Your turn!");
                if (super.level < 2) {
                    System.out.println("(1)Attack \n(2)??? \n(3)Stats");
                    choice = scanner.nextInt();
                    switch(choice){
                    case 1:
                        super.hit();
                        break;
                    case 2:
                        System.out.println("You not unlocked yet. \nYou made a normal attack ");
                        super.hit();
                        break;
                    default:
                        System.out.println("You can't escape war!");
                    }
                }
                
                else{
                    System.out.println("(1)Attack \n(2)??? \n(3)Stats");
                    choice = scanner.nextInt();
                    switch(choice){
                    case 1:
                        super.hit();
                        break;
                    default:
                        System.out.println("You can't escape war!");
                    }
                }
                
                turn = false;
            }
            else if(turn == false && super.enemyHealth != 0 && super.health != 0) {
                System.out.println(super.enemyID + " turn!");
                super.damageTaken();
                turn = true;
            }
            else if(super.enemyHealth <= 0.0){
                System.out.println(super.enemyID + " killed by " + super.nickname);
                super.stats();
                break;
            }
        
            else if(super.health <= 0.0){
                System.out.println("You died!!! \nGameOver!");
                super.stats();
                break;
            }
            numberOfTurns++;
        }
        
        
    }
}
