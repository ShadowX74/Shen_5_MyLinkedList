/***********************************************************************
* Program Filename: LinkeItem.java
* Author: Shen, Xiangyu
* Date: 12/5/16
* Description: Creates Linked Item for list
* Input: Keyboard, parameters where called
* Output: Console, to where called
***********************************************************************/
package shen_linkedlist;

public class LinkedItem {

    /*Stats of character*/
    String name, species, ability;
    int str;
    LinkedItem tail;
    
    LinkedItem(String name, String species, String ability, int str, LinkedItem next) {
        this.name = name;
        this.species = species;
        this.ability = ability;
        this.str = str;
        this.tail = next;
    }
    
/***********************************************************************
* Method: toString
* Description: prints variables of item
* Parameters: N/A
* Pre-conditions: called for an item
* Post-conditions: stats printed
***********************************************************************/
    @Override
    public String toString() {
        if (tail != null) {
            return "LinkedItem{" + "name=" + name + ", species=" + species + ", ability=" + ability + ", str=" + str + ", tail=" + tail.name + '}';
        } else {
            return "LinkedItem{" + "name=" + name + ", species=" + species + ", ability=" + ability + ", str=" + str + ", tail=" + tail + '}';
        }
    }
    
/***********************************************************************
* Method: toStringUser
* Description: prints variables of ite
* Parameters: N/A
* Pre-conditions: called for an item
* Post-conditions: stats printed
***********************************************************************/
    public String toStringUser() {
        if (tail != null) {
            return "Character [" + "Name: " + name + ", Species: " + species + ", Ability: " + ability + ", Strength: " + str + ']';
        } else {
            return "Character [" + "Name: " + name + ", Species: " + species + ", Ability: " + ability + ", Strength: " + str + ']';
        }
    }
}
