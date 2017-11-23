package com.company;

public class Main {

    static String[] isimler = {"a","b","c"};

    public static class StringDiziYaz{

        public static class SelamVerenSinif{

            public static void selamVer(){
                System.out.println("selam");
            }
        }
        public static void diziYaz(String[] dizi){

            for(String gecici : dizi){
                System.out.println(gecici);
            }
        }
        public static void isimleriYazdir(){

            for(String gecici : isimler){
                System.out.println(gecici);
            }

        }

    }


    public static void main(String[] args) {

        String[] dizi = {"ahmet","mert","yavuz"};

        //Main.StringDiziYaz nesne = new Main().new StringDiziYaz();
        //nesne.diziYaz(dizi);

        StringDiziYaz nesne = new StringDiziYaz();

        nesne.diziYaz(dizi);

        StringDiziYaz.diziYaz(dizi);

        //StringDiziYaz.SelamVerenSinif nesne2 = new StringDiziYaz.SelamVerenSinif();
        //nesne2.selamVer();

        StringDiziYaz.SelamVerenSinif.selamVer();

    }
}
