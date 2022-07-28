package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetClass {
    public static void main(String[] args) {

        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(4);
        hashSet.add(6);//adding element to set
        hashSet.remove(4);//remove based on index
        System.out.println("print set values"+ hashSet);

        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(5);
        linkedHashSet.add(7);
        linkedHashSet.add(4);
        linkedHashSet.add(6);//adding element to set
        linkedHashSet.remove(4);//remove based on index
        System.out.println("print set in insertion order values"+ linkedHashSet);


        TreeSet<Object> treeSet= new TreeSet<>();
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(6);//adding element to set

        System.out.println("print set values in sorting order"+ treeSet);

        //this block of code use for ittrating the list of values from set list
        for (Object i: treeSet) {
            System.out.println(i);
        }

    }
}
