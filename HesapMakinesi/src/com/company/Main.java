package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gelen;
        int ilk;
        int ikinci;
        for (;;){
            Scanner sayilar = new Scanner(System.in);
            gelen = menuGoster();
            if(gelen==5)
                break;
            else if(gelen>=6 || gelen<=0){
            }
            else {
                System.out.println("ilk Sayıyı Giriniz");
                ilk = sayilar.nextInt();
                System.out.println("ikinci Sayıyı Giriniz");
                ikinci = sayilar.nextInt();
                switch (gelen) {
                    case 1:
                        toplaminiBul(ilk, ikinci);
                        break;
                    case 2:
                        farkBUl(ilk, ikinci);
                        break;
                    case 3:
                        carpiminiBul(ilk, ikinci);
                        break;
                    case 4:
                        bolumunuBul(ilk, ikinci);
                        break;
                }
            }
        }
    }
    public static int menuGoster(){

        int secilen;

        System.out.println("**********MENÜ**********");
        System.out.println("1-Topla");
        System.out.println("2-Fark");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");
        System.out.println("5-Çıkış");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");

        Scanner secim = new Scanner(System.in);

        secilen = secim.nextInt();

        return secilen;

    }
    public static void toplaminiBul(int x,int y){
        int toplam = x+y;
        System.out.println("Toplamları:" + toplam );
    }
    public static void farkBUl(int x,int y){
        int fark = x-y;
        System.out.println("Farkları:" + fark );
    }
    public static void carpiminiBul(int x,int y){
        int carpim = x*y;
        System.out.println("Çarpımları:" + carpim );
    }
    public static void bolumunuBul(int x,int y){
        float bolum = ((float)x/(float)y);
        System.out.println("Bölümleri:" + bolum );

    }

}
