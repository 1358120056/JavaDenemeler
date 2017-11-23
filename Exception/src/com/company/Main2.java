package com.company;

public class Main2 {
    public static void main(String[] args) {

        int[] sayilar = new int[3];

        sayilar[0]=0;
        sayilar[1]=1;
        sayilar[2]=2;

        istisna1(sayilar);
        System.out.println("Main metodun sonu");
    }
    private static void istisna1(int[] sayilar) {
        try {
            istisna2(sayilar);
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Hata istisna1 de yakalandı.");
        }
        System.out.println("İstisna1 sonlandı");
    }
    private static void istisna2(int[] sayilar) {

        System.out.println("İstisna 2 başladı.");
        System.out.println(sayilar[0]);
        System.out.println(sayilar[1]);
        System.out.println(sayilar[2]);
        System.out.println(sayilar[3]);

        System.out.println("İstisna 2 sonu");
    }
}
