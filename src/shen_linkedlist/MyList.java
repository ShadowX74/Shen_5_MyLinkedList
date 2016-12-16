/***********************************************************************
* Program Filename: MyList.java
* Author: Shen, Xiangyu
* Date: 12/5/16
* Description: creates linked list
* Input: Keyboard, parameters from class called in.
* Output: Console, returned to where calles
***********************************************************************/
package shen_linkedlist;

public class MyList {

    int size = 0; //size of list
    /*First and last items in the list*/
    static LinkedItem last;
    static LinkedItem first;

    public MyList() {
    }
    
/***********************************************************************
* Method: addLast
* Description: adds an item to list at the end
* Parameters: LinkedItem e
* Pre-conditions: needs LinkedItem to add, called on a list
* Post-conditions: item added to end
***********************************************************************/
    public void addLast(LinkedItem e) {
        //Placeholder for former last item
        final LinkedItem l = last;
        //new item added to end is last
        last = e;
        //If there was no last item
        if (l == null) {
            //Item is also the first
            first = e;
        } else {
            //Otherwise, the second to last item's tail is the last item
            l.tail = e;
        }
        //add 1 to size of list
        size++;
    }
    
/***********************************************************************
* Method: addFirst
* Description: adds an item to list at the front
* Parameters: LinkedItem e
* Pre-conditions: needs LinkedItem to add, called on a list
* Post-conditions: item added to beginning
***********************************************************************/
    public void addFirst(LinkedItem e) {
        //Old first item placed in placeholder
        final LinkedItem f = first;
        //New first item
        first = e;
        //If there was no first item
        if (f == null) {
            //the new item is also the last
            last = e;
        } else {
            //Otherwise, the new first item's tail is the old first item
            e.tail = f;
        }
        //add 1 to size of list
        size++;
    }
    
/***********************************************************************
* Method: removeLast
* Description: removes an item from the end of the list
* Parameters: N/A
* Pre-conditions: called on a list
* Post-conditions: item removed to end, removed item returned
***********************************************************************/
    public LinkedItem removeLast() {
        //If no items to remove
        if (size == 0) {
            return null;
        }
        //Last item to remove is defined as l
        final LinkedItem l = last;
        //placeholder to iterate through items
        LinkedItem placeholder;
        //Starting from the firt item
        placeholder = first;
        //If the last item is the first and only  item
        if (l == placeholder) {
            /*no items, everything is null*/
            first = null;
            last = null;
            first.tail = null;
        } else {
            //Goes through list until second to last item is found
            while (placeholder.tail != l) {
                placeholder = placeholder.tail;
            }
            //new last item is former second to last item
            last = placeholder;
            //has no tail
            last.tail = null;
        }
        //removes one from size of array
        size--;
        //returns item
        return l;
    }
    
/***********************************************************************
* Method: removeFirst
* Description: removes an item from the front of the list
* Parameters: N/A
* Pre-conditions: called on a list
* Post-conditions: item removed to beginning, removed item returned
***********************************************************************/
    public LinkedItem removeFirst() {
        //If no items to remove
        if (size == 0) {
            return null;
        }
        //First item to reove
        final LinkedItem l = first;
        //new first item is old first item's tail
        first = first.tail;
        //old first item has tail removed
        l.tail = null;
        //if no items now
        if (first == null) {
            //last and first are both nul
            last = null;
        }
        //removes one from size of list
        size--;
        //returns removed item
        return l;
    }

/***********************************************************************
* Method: size
* Description: returns size of list
* Parameters: N/A
* Pre-conditions: called on list
* Post-conditions: size returned
***********************************************************************/
    public int size() {
        return size;
    }

/***********************************************************************
* Method: listAll
* Description: prints stats of all items in list
* Parameters: N/A
* Pre-conditions: called on a list
* Post-conditions: items and stats printed
***********************************************************************/
    public void listAll() {
        /*Placeholder to iterate thrugh list , starting with the first one.*/
        LinkedItem placeholder;
        placeholder = first;
        //If no items
        if (first == null) {
            System.out.println("No Items!");
        } else {
            //prints stats for each item
            while (placeholder.tail != null) {
                System.out.println(placeholder.toString());
                placeholder = placeholder.tail;
            }
            //prints stats for last item
            System.out.println(placeholder.toString());
        }
    }

/***********************************************************************
* Method: listAllUser
* Description: prints stats of all items in list
* Parameters: N/A
* Pre-conditions: called on a list
* Post-conditions: items and stats printed
***********************************************************************/
    public void listAllUser() {
        /*Placeholder to iterate thrugh list , starting with the first one.*/
        LinkedItem placeholder;
        placeholder = first;
        //If no items
        if (first == null) {
            System.out.println("No Items!");
        } else {
            //prints stats for each item
            while (placeholder.tail != null) {
                System.out.println(placeholder.toStringUser());
                placeholder = placeholder.tail;
            }
            //prints stats for last item
            System.out.println(placeholder.toStringUser());
        }
    }
}
