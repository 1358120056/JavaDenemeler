package com.company;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapOrnegi {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> linkedHashMapKumesi = new LinkedHashMap<>();


        linkedHashMapKumesi.put(3,"ahmet");
        linkedHashMapKumesi.put(2,"yavuz");
        linkedHashMapKumesi.put(1,"mert");
        linkedHashMapKumesi.put(4,"tuna");

        System.out.println(linkedHashMapKumesi);
        System.out.println("****************");

        LinkedHashMap<Integer,String> kopyaTablo = new LinkedHashMap<>(linkedHashMapKumesi);
        System.out.println(kopyaTablo);

        LinkedHashMap<Integer,String> kapasiteTablo = new LinkedHashMap<>(16,0.75f,false);

        kapasiteTablo.put(3,"ahmet");
        kapasiteTablo.put(2,"yavuz");
        kapasiteTablo.put(1,"mert");
        kapasiteTablo.put(4,"tuna");

        System.out.println(kapasiteTablo);

        TreeMap<Integer,String> treeMap = new TreeMap<>(linkedHashMapKumesi);
        System.out.println(treeMap);

        //anahtarları göster
        for(Integer anahtar : linkedHashMapKumesi.keySet()){
            System.out.println("Ahahtar: "+anahtar);
        }
        //değerleri göster
        for(String deger : linkedHashMapKumesi.values()){
            System.out.println("Değer: "+deger);
        }
        //anahtar- deger
        for(Map.Entry<Integer,String> tekTablosSatiri: linkedHashMapKumesi.entrySet()){

            int anahtar = tekTablosSatiri.getKey();
            String deger = tekTablosSatiri.getValue();

            System.out.println("Anahtar: "+anahtar+" - " +"Değer: "+deger);
        }

        System.out.println("***************");
        //iteratörle gezmek

        Iterator<Map.Entry<Integer,String >> iterator = linkedHashMapKumesi.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer,String> tekEleman = iterator.next();
            System.out.println(tekEleman.getKey()+" - " +tekEleman.getValue());
        }









    }

}
