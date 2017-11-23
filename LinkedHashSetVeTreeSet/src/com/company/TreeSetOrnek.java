package com.company;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOrnek {

    public static void main(String[] args) {
        /*
        String[] isimler = {"Emre","Ali","Ayşe","Bahar","Hasan","Fatma","Ali","Ayşe","Vedat"};

        TreeSet<String> isimlerKumesi = new TreeSet<>(Collections.reverseOrder());
        for(String i: isimler){
            if(isimlerKumesi.add(i)){
                System.out.println(i+" kümeye eklendi.");
            }
            else{
                System.err.println(i+" kümeye eklenemedi.");
            }
        }

        System.out.println("****** Gelişmiş for ile dönme*****");

        for(String s : isimlerKumesi){
            System.out.println(s);
        }

        System.out.println("****** İteratör ile dönme*****");

        Iterator<String> iterator = isimlerKumesi.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

       */

        TreeSet<Ogrenci> ogrenciKumesi= new TreeSet<>(Collections.reverseOrder());

        ogrenciKumesi.add(new Ogrenci(5,15));
        ogrenciKumesi.add(new Ogrenci(15,35));
        ogrenciKumesi.add(new Ogrenci(25,40));
        ogrenciKumesi.add(new Ogrenci(225,39));
        ogrenciKumesi.add(new Ogrenci(45,18));

        Iterator<Ogrenci> iterator = ogrenciKumesi.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());

        }


    }
}
