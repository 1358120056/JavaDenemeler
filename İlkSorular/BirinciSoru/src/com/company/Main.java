package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sayi1,sayi2,sayi3;

        double ortalama;

        Scanner sayilar = new Scanner(System.in);

        System.out.println("Lütfen 1. Sayıyı Giriniz");

        sayi1=sayilar.nextInt();

        System.out.println("Lütfen 2. Sayıyı Giriniz");

        sayi2=sayilar.nextInt();

        System.out.println("Lütfen 3. Sayıyı Giriniz");

        sayi3=sayilar.nextInt();

        ortalama = (sayi1+sayi2+sayi3)/3d;

        System.out.println("Girdiğiniz sayıların ortalaması: "+ortalama);
    }
}
