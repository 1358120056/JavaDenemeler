package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String adi ="";

        String soyadi ="";

        Scanner isim = new Scanner(System.in);

        System.out.println("Lütfen Adınızı giriniz");

        adi = isim.nextLine();

        System.out.println("Lütfen Adınızı giriniz");

        soyadi = isim.nextLine();

        String adSoyad = adi+" "+soyadi;

        int i;

        for (i=0;i<5;i++){

            System.out.println(i+1+". "+adSoyad);

        }
    }
}
