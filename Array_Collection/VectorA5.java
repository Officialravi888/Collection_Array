package com.Array_Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorA5 {
    public static void main(String[] args) {
        Vector<Integer> a1 = new Vector<>();
        a1.add(26);
        a1.add(65);
        a1.add(48);
        a1.add(82);
        a1.add(784);
        System.out.println(a1);
        Enumeration e = a1.elements();
                while(e.hasMoreElements()){
                    System.out.println(e.nextElement() +    "");
                }
    }

}
