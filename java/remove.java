package com.company.one;

import java.util.ArrayList;
import java.util.List;

public class remove {
    public static void main(String[] args) {
        List<Integer> val=new ArrayList<>();
        val.add(10);
        val.add(20);
        val.remove(1);
        System.out.println(val);
    }
}
