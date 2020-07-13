package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(0,10);
        list.add(3,30);

        System.out.println("A list of integers in the array list");
        System.out.println(list);

        LinkedList<Object> linkedList = new LinkedList<Object>(list);
        linkedList.add(1, "red");
        linkedList.removeLast();
        linkedList.addFirst("green");
        System.out.println("Display linkedList a forward:");
        System.out.println(linkedList);

        ListIterator<Object> listIterator = linkedList.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next() +" ");
        }
        System.out.println();

        System.out.println("display linkedList a backward");

        listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous() +" ");
        }

    }
}
