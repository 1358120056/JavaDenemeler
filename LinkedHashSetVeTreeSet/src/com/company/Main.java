package com.company;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        String[] isimler = {"Emre","Ali","Ayşe","Bahar","Hasan","Fatma","Ali","Ayşe","Vedat"};
        LinkedHashSet<String> isimKumesi = new LinkedHashSet<>();

        for(String i: isimler){
            if(isimKumesi.add(i)){
                System.out.println(i+" kümeye eklendi.");
            }
            else{
                System.err.println(i+" kümeye eklenemedi.");
            }
        }

        System.out.println("****** Gelişmiş for ile dönme*****");

        for(String s : isimKumesi){
            System.out.println(s);
        }

        System.out.println("****** İteratör ile dönme*****");

        Iterator<String> iterator = isimKumesi.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
