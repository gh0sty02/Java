package com.company;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.search(2));
    }
}
