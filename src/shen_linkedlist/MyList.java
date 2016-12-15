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
public class MyList<E> {

    int size = 0;
    static LinkedItem last;
    static LinkedItem first;
//    static LinkedItem e5 = new LinkedItem("e5", "d", "z", 0, null);
//    static LinkedItem e4 = new LinkedItem("e4", "s", "y", 1, e5);
//    static LinkedItem e3 = new LinkedItem("e3", "b", "h", 2, e4);
//    static LinkedItem e2 = new LinkedItem("e2", "c", "n", 3, e3);
//    static LinkedItem e1 = new LinkedItem("e1", "x", "m", 4, e2);

    public MyList() {
//        first = e1;
//        last = e5;
    }

    public void addLast(LinkedItem e) {
        final LinkedItem l = last;
        last = e;
        if (l == null) {
            first = e;
        } else {
            l.tail = e;
        }
        size++;
    }

    public void addFirst(LinkedItem e) {
        final LinkedItem f = first;
        first = e;
        if (f == null) {
            last = e;
        } else {
            e.tail = f;
        }
        size++;
    }

    public LinkedItem removeLast() {
        if (size == 0) {
            return null;
        }
        final LinkedItem l = last;
        LinkedItem placeholder;
        placeholder = first;
        if (l == placeholder) {
            first = null;
            last = null;
            first.tail = null;
        } else {
            while (placeholder.tail != l) {
                placeholder = placeholder.tail;
            }
            last = placeholder;
            last.tail = null;
        }
        size--;
        return l;
    }
    
    public LinkedItem removeFirst() {
        if (size == 0) {
            return null;
        }
        final LinkedItem l = first;
        first = first.tail;
        l.tail = null;
        if (first == null) {
            last = null;
        }
        size--;
        return l;
    }

    public int size() {
        return size;
    }

    public void listAll() {
        LinkedItem placeholder;
        placeholder = first;
        if (first == null) {
            System.out.println("No Items!");
        } else {
            while (placeholder.tail != null) {
                System.out.println(placeholder.toString());
                placeholder = placeholder.tail;
            }
            System.out.println(placeholder.toString());
        }
    }
    
    public void listAllUser() {
        LinkedItem placeholder;
        placeholder = first;
        if (first == null) {
            System.out.println("No Items!");
        } else {
            while (placeholder.tail != null) {
            System.out.println(placeholder.toStringUser());
            placeholder = placeholder.tail;
        }
            System.out.println(placeholder.toStringUser());
        }
    }
}
