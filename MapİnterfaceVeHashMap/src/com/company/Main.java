package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(3,"ahmet");
        hashMap.put(2,"yavuz");
        hashMap.put(1,"mert");
        hashMap.put(4,"tuna");

        System.out.println(hashMap);
        System.out.println(hashMap.size());

        Collection<String> degerler =  hashMap.values();

        System.out.println(degerler);

        //hashMap.clear();
        //System.out.println(hashMap.size());

        hashMap.keySet();
        hashMap.entrySet();
        System.out.println(hashMap.get(3));

    }
}
