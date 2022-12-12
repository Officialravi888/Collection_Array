package com.Array_Collection;

import java.util.Stack;

public class StackA4 {
    public static void main(String[] args) {
        Stack<Double> s=new Stack<Double>();
        s.add(65.2);
        s.add(25.2);
        s.add(30.2);
        s.add(18.2);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s);
    }
}
