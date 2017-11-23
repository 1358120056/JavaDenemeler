package com.company;

import java.util.Collections;
import java.util.PriorityQueue;

public class OncelikliKuyruk {
    public static void main(String[] args) {

        PriorityQueue<Integer> oncelikliKuyruk=new PriorityQueue<>(Collections.reverseOrder());
        oncelikliKuyruk.add(2);
        oncelikliKuyruk.add(1);
        oncelikliKuyruk.add(4);
        oncelikliKuyruk.add(3);
        System.out.println(oncelikliKuyruk);

        PriorityQueue<String> a=new PriorityQueue<>(Collections.reverseOrder());
        a.add("Emre");
        a.offer("Hasan");
        a.add("Ayşe");
        a.offer("Ali");

        System.out.println(a);

        PriorityQueue<String> q = new PriorityQueue<>(Collections.reverseOrder());

        q.add("ahmet");
        q.add("yavuz");
        q.add("mert");
        q.add("tuna");
        System.out.println(q);


        PriorityQueue<Ogrenci> ogrenciler=new PriorityQueue<>(Collections.reverseOrder());

        Ogrenci ogr1=new Ogrenci(100, 80);
        ogrenciler.add(ogr1);
        ogrenciler.add(new Ogrenci(105, 95));
        ogrenciler.add(new Ogrenci(103, 65));
        ogrenciler.add(new Ogrenci(109, 76));
        ogrenciler.add(new Ogrenci(102, 70));

        System.out.println(ogrenciler);

        while(!ogrenciler.isEmpty()){
            System.out.println(ogrenciler.poll());
        }





    }




}
