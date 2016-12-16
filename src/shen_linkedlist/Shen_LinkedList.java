/***********************************************************************
* Program Filename: Shen_LinkedList.java
* Author: Shen, Xiangyu
* Date: 12/5/16
* Description: Creates Linked List that user can interact with
* Input: Keyboard
* Output: Console
***********************************************************************/
package shen_linkedlist;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Shen_LinkedList {

    /**
     * @param args the command line arguments
     */
    
    //scanner for input
    static Scanner scan = new Scanner(System.in);
    //play variable to continue
    static boolean play = true;
    
    public static void main(String[] args) {
        /*New List and items to add to list*/
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
        
        //ASk user what to do while keep playing
        while (play) {
            try {
                choose(list);
            } catch (InterruptedException ex) {
                Logger.getLogger(Shen_LinkedList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
/***********************************************************************
* Method: choose
* Description: asks user what to do and calls appropriate method
* Parameters: MyList list
* Pre-conditions: called to get user choice, list to act on
* Post-conditions: user requests done
***********************************************************************/
    static void choose(MyList list) throws InterruptedException {
        //Prints out list and options to choose
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
            /*gets all stats for new item to create*/
            System.out.println("What is the character's name?");
            String name = scan.nextLine();
            name = scan.nextLine();
            System.out.println("What is the character's species?");
            String spec = scan.nextLine();
            System.out.println("What is the character's ability?");
            String abil = scan.nextLine();
            System.out.println("What is the character's strength rating?");
            int str = scan.nextInt();
            /*Creates and adds item to List*/
            System.out.println("Creating character...");
            Thread.sleep(500);
            System.out.println("Adding character to list...");
            Thread.sleep(500);
            System.out.println("Character added!");
            LinkedItem e = new LinkedItem(name, spec, abil, str, null);
            list.addFirst(e);
        } else if (choice == 2) {
            //Removes item
            System.out.println("Removing first item...");
            list.removeFirst();
        } else if (choice == 3) {
            //removes item
            System.out.println("Removing last item...");
            list.removeLast();
        } else {
            //ends loop
            play = false;
        }
        Thread.sleep(2000);
        //prints 100 lines
        for (int i = 0; i < 100; i++) {
            System.out.println("");
        }
    }
}