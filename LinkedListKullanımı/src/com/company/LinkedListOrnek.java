package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListOrnek {

    public static void main(String[] args) {


        LinkedList<String> gezilecekYerler = new LinkedList<>();

        /*
        gezilecekYerler.add("ankara");
        gezilecekYerler.add("istanbul");
        gezilecekYerler.add("bolu");
        gezilecekYerler.add("antalya");
        gezilecekYerler.add("izmir");
        gezilecekYerler.add("missisipi");
        */

        siraliEkle(gezilecekYerler,"ankara");
        siraliEkle(gezilecekYerler,"istanbul");
        siraliEkle(gezilecekYerler,"bolu");
        siraliEkle(gezilecekYerler,"antalya");
        siraliEkle(gezilecekYerler,"izmir");
        siraliEkle(gezilecekYerler,"missipi");

        //yerleriYazdir(gezilecekYerler);
        //gezilecekYerler.add(2,"lüleburgaz");
        yerleriYazdir(gezilecekYerler);

        siraliEkle(gezilecekYerler,"ankara");
        siraliEkle(gezilecekYerler,"alanya");

        yerleriYazdir(gezilecekYerler);

        siraliEkle(gezilecekYerler,"zonguldak");
        yerleriYazdir(gezilecekYerler);





    }

    private static void yerleriYazdir(LinkedList<String> gezilecekYerler) {

        ListIterator<String> stringListIterator = gezilecekYerler.listIterator();

        while (stringListIterator.hasNext()){

            System.out.println("Şuan ki yer "+ stringListIterator.next());
        }
        System.out.println("************************");


    }

    private static boolean siraliEkle(LinkedList<String> gezilecekYerler ,String yeniSehir) {


        ListIterator<String> stringListIterator = gezilecekYerler.listIterator();

        while (stringListIterator.hasNext()){


            int karsilastir= stringListIterator.next().compareTo(yeniSehir);
            if(karsilastir ==0){

                System.out.println("Eklemeye çaıştığınız "+yeniSehir +" zaten mevcut" );
                return false;

            }
            else if(karsilastir>0){

                stringListIterator.previous();
                stringListIterator.add(yeniSehir);
                return true;

            }
            else if(karsilastir<0){


            }
        }
        stringListIterator.add(yeniSehir);
        return true;




    }

}
