/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shen_linkedlist;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ShadowX
 */
public class Shen_LinkedList {

    /**
     * @param args the command line arguments
     */
    
    static Scanner scan = new Scanner(System.in);
    static boolean play = true;
    
    public static void main(String[] args) {
        // TODO code application logic here
        MyList list = new MyList();
        LinkedItem e1 = new LinkedItem("Wheezard", "Hooman", "Cough", 100, null);
        LinkedItem e2 = new LinkedItem("Superhero", "Superhooman", "Be Super", 10, null);
        LinkedItem e3 = new LinkedItem("Wizard", "Demi-hooman", "Zap", 150, null);
        LinkedItem e4 = new LinkedItem("Munchy", "Munster", "Eat", 50, null);
        LinkedItem e5 = new LinkedItem("Bob", "Monster", "DEVOUR", 500, null);
        list.addLast(e1);
        list.addLast(e2);
        list.addLast(e3);
        list.addLast(e4);
        list.addLast(e5);
        
        while (play) {
            try {
                choose(list);
            } catch (InterruptedException ex) {
                Logger.getLogger(Shen_LinkedList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    static void choose(MyList list) throws InterruptedException {
        System.out.println("This is your LinkedList:");
        Thread.sleep(1000);
        list.listAllUser();
        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("1) Create and add a character to the front");
        System.out.println("2) Remove a character from the beginning");
        System.out.println("3) Remove the last character");
        System.out.println("4) Quit");
        int choice = scan.nextInt();
        if (choice == 1) {
            System.out.println("What is the character's name?");
            String name = scan.nextLine();
            name = scan.nextLine();
            System.out.println("What is the character's species?");
            String spec = scan.nextLine();
            System.out.println("What is the character's ability?");
            String abil = scan.nextLine();
            System.out.println("What is the character's strength rating?");
            int str = scan.nextInt();
            System.out.println("Creating character...");
            Thread.sleep(500);
            System.out.println("Adding character to list...");
            Thread.sleep(500);
            System.out.println("Character added!");
            LinkedItem e = new LinkedItem(name, spec, abil, str, null);
            list.addFirst(e);
        } else if (choice == 2) {
            System.out.println("Removing first item...");
            Thread.sleep(500);
            list.removeFirst();
        } else if (choice == 3) {
            System.out.println("Removing last item...");
            list.removeLast();
        } else {
            play = false;
        }
        Thread.sleep(2000);
        for (int i = 0; i < 100; i++) {
            System.out.println("");
        }
    }
}