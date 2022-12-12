package com.Array_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListA4 {
    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<>();
        a1.add("ravi");
        a1.add("kant");
        a1.add("raj");
        Iterator<String> iterator = a1.iterator();
        while (iterator.hasNext()){
            String next=iterator.next();
            System.out.println(next);
        }
    }
}
