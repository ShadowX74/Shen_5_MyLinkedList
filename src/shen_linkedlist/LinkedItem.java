/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shen_linkedlist;

/**
 *
 * @author ShadowX
 */
public class LinkedItem {

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

    @Override
    public String toString() {
        if (tail != null) {
            return "LinkedItem{" + "name=" + name + ", species=" + species + ", ability=" + ability + ", str=" + str + ", tail=" + tail.name + '}';
        } else {
            return "LinkedItem{" + "name=" + name + ", species=" + species + ", ability=" + ability + ", str=" + str + ", tail=" + tail + '}';
        }
    }
    
    public String toStringUser() {
        if (tail != null) {
            return "Character [" + "Name: " + name + ", Species: " + species + ", Ability: " + ability + ", Strength: " + str + ']';
        } else {
            return "Character [" + "Name: " + name + ", Species: " + species + ", Ability: " + ability + ", Strength: " + str + ']';
        }
    }
    
    public LinkedItem getTail() {
        return tail;
    }

    public void setTail(LinkedItem next) {
        this.tail = next;
    }
}
