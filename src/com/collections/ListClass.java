package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListClass {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(6);

        System.out.println(arrayList.toString());
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(4);
        linkedList.add(6);
        linkedList.remove(7);

        System.out.println(linkedList);

        Vector<Object> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(5);
        vector.add(7);
        vector.add(4);
        vector.add(6);
        vector.remove(7);
        System.out.println(vector);
    }
}
