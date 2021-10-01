package com.company.one;

import java.util.ArrayList;
import java.util.List;

public class convert {
    public static void main(String[] args) {
        List<Integer> val=new ArrayList<>();
        val.add(1);
        val.add(2);
        val.add(3);
        System.out.println(val);
        int a[]=new int[val.size()];
        for(int i=0;i< val.size();i++){
            a[i]= val.size();
        }
        System.out.println("val");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
