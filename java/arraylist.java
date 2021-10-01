package com.company.one;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List<Integer> array=new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);
        System.out.println(array.contains(40));
    }
}
