package com.Array_Collection;

import javax.naming.InsufficientResourcesException;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetA6 {
    public static void main(String[] args) {
        HashSet<Integer> a1 = new HashSet<Integer>();
        a1.add(893);
        a1.add(793);
        a1.add(253);
        a1.add(829);
        a1.add(827);
        System.out.println(a1.size());
            for(Integer e : a1){
                System.out.println(a1);
            }
            Iterator it = a1.iterator();
            while(it.hasNext());
        System.out.println(it.next());
    }
}
