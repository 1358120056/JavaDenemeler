package com.company;

public class Main {

    public static void main(String[] args) {

        int[] sayilar = new int[3];

        sayilar[0]=0;
        sayilar[1]=1;
        sayilar[2]=2;
        
        istisna1(sayilar);
        System.out.println("Main metodun sonu");

    }
    private static void istisna1(int[] sayilar) {

        System.out.println("istisna1 metodu başladı.");
        istisna2(sayilar);
        System.out.println("Şu an istisna1'desin.");

    }
    private static void istisna2(int[] sayilar) {

        System.out.println("istisna 2 metodu başladı.");

        try {
            System.out.println(sayilar[0]);
            System.out.println(sayilar[1]);
            System.out.println(sayilar[2]);
            System.out.println(sayilar[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("hata istisna2 de yakalandı");
        }
        System.out.println("istisna 2 metodu bitti.");
    }
}
