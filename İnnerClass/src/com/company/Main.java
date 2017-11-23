package com.company;

public class Main {

    public static void main(String[] args) {

        String[] stringDizi = {"ahmet","mert","yavuz"};

        Main.StringDiziYaz nesne = new Main().new StringDiziYaz();

        nesne.diziYaz(stringDizi);

    }

    protected class StringDiziYaz{

        public void diziYaz(String[] nesne){

            for(String gecici : nesne){

                System.out.println(gecici +" ");

            }
        }
    }
}
