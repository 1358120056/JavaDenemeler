package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOrnek {

    public static void main(String[] args) {

        String[] isimler = {"ahmet","mert","yavuz","altan","tuna","mert","ali","veli"};
        String[] soyİsimler = {"ahmet2","mert2","yavuz2","altan2","tuna2","mert2","ali","veli","tuna"};

        ArrayList<String> isimListesi = new ArrayList<>();
        ArrayList<String> soyİsimListesi = new ArrayList<>();

        for(String s : isimler){

            isimListesi.add(s);
        }
        for(String s:soyİsimler ){

            soyİsimListesi.add(s);
        }

        Iterator<String> iterator = isimListesi.listIterator();



        /*

        //geriye isimler ve soyisimler listelerinde olan elemanları döndürür.
        isimListesi.retainAll(soyİsimListesi);
        for(String s:isimListesi){

            System.out.print(s+" ");

        }

        */

        /*
        while (iterator.hasNext()){

            if(soyİsimListesi.contains(iterator.next())){
                iterator.remove();
            }
        }
        for(String s:isimListesi){

            System.out.print(s+" ");

        }
        */



    }

}
