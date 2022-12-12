package com.Array_Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetA7 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> a1 = new LinkedHashSet<Integer>();
        a1.add(35);
        a1.add(57);
        a1.add(null);
        a1.add(91);
        System.out.println(a1.size());
        for (Integer s : a1) {
            System.out.println(s);
        }
        Iterator s = a1.iterator();
        while (s.hasNext()) {
            System.out.println(s.next());
        }

    }
}
