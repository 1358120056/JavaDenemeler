package com.company;

public class Main {

    public static void main(String[] args) {


        Dikdörtgen mert = new Dikdörtgen();

        mert.setBoy(10);

        mert.setEn(10);

        System.out.println("mert: "+ mert.alaniHesapla());

        Dikdörtgen tuna = new Dikdörtgen();

        tuna.setBoy(11);

        System.out.println("tuna:" + tuna.alaniHesapla());

        Dikdörtgen altan =new Dikdörtgen(5 );

        System.out.println("altan: "+altan.alaniHesapla());

    }
}
