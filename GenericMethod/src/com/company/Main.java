package com.company;

public class Main {

    public static void main(String[] args) {


        String[] stringDizi ={"ahmet","mert","yavuz"};
        Integer[] intDizi = {1,2,3};
        Double[] doubleDizi={1.2,3.5,7.8};
        Character[] charDizi = {'a','b','c'};

        diziYaz(stringDizi);
        yazdir(intDizi);
        yazdir(stringDizi);
        yazdir(doubleDizi);
        yazdir(charDizi);

    }
    public static void diziYaz(String[] dizi){

        for(String gecici : dizi){
            System.out.println(gecici);
        }
    }
    public static <Genel> void yazdir(Genel[] dizi){

        for(Genel gecici: dizi){
            System.out.println(gecici);
        }

    }


}
