package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        String[] isimler = {"Emre","Ali","Ayşe","Bahar","Hasan","Fatma","Vedat","Ali","Ayşe"};
        HashSet<String> isimKumesi=new HashSet<>();

        for(String i : isimler){
            if(isimKumesi.add(i)){
                System.out.println(i+" kümeye eklendi");
            }
            else{
                System.out.println(i+" kümeye eklenemedi");
            }
        }
        System.out.println(isimKumesi.size());
        System.out.println("***Gelişmiş for ile yazdırma.***");
        for(String i:isimKumesi){
            System.out.println(i);
        }

        System.out.println("***İteratör for ile yazdırma.***");
        Iterator<String> iterator = isimKumesi.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        iterator=isimKumesi.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals("Fatma")){
                System.out.println("Fatma silindi.");
                iterator.remove();
            }
        }
        System.out.println("*************************");

        iterator=isimKumesi.iterator();


        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
