package com.company.one;

import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set print=new HashSet<>();
        print.add(100);
        print.add('c');
        print.add('a');
        print.add(200);
        System.out.println(print.contains('c'));
        System.out.println(print.contains(100));
    }
}
