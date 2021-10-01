package com.company.one;

import java.util.*;

public class iterate {
    public static void main(String[] args) {
        List<Integer> values=new ArrayList<>();
        values.add(10);
        values.add(20);
        values.add(30);
        Iterator itr= values.iterator();
        for(int i=0;i< values.size();i++){
            System.out.println(values.get(i));
        }
    }
}
