/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minidungeon;

import java.util.Scanner;

public class Quests extends Battle{
    
    public void beginning(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Mini Dungeon.");
        System.out.println("???: Welcome traveller what is your name.\n(Enter your nickname here): ");
        super.nickname = scan.nextLine();
        super.setCharacter(30, 5, nickname);
        System.out.println("???: Welcome the dungeons " + super.nickname + 
                "\nKatheryne: I'm Katheryne, the guardian of the dungeon entrance and the sorceress.");
        System.out.println("I guess you are one of the travelers who came to gather information about the beings discovered at the bottom of the dungeon.");
        System.out.println("I can help you on your journey through the dungeon.");
        System.out.println("As you progress through the dungeon, if you can collect and bring me the magic mixture materials I want from you, I can make mixtures that can strengthen you.");
        System.out.println("But you shouldn't enter the dungeon without a sword first thing. You can start by using this weapon.");
        System.out.println("(Katheryne gives you the common sword.)");
    }
    
    public void firstQuest(){
        System.out.println("Katheryne: The first mission that I want you to accomplish is killing 3 monsters.");
        for (int i = 0; i < 3; i++) {
            super.fight();
        }
        System.out.println("Mission accomplished , return to Katheryne");
        System.out.println("Katheryne: Thank you for accomplishing the misson " + super.nickname);
    }
    
    
    
}
