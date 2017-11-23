package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int sayi,i;

        int sonuc =1;

        Scanner girdi = new Scanner(System.in);

        System.out.println("Sayıyı Girin:");

        sayi = girdi.nextInt();

        while (sayi<0){

            System.out.println("lütfen pozitif tam sayı giriniz");

            sayi = girdi.nextInt();

        }

        for(i=1;i<=sayi;i++){



            sonuc*=i;


        }

        System.out.println("Girdiginiz Sayının Faktöriyeli: "+sonuc);

    }
}
