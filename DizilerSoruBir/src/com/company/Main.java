package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        int[] dizi1 = {1,3,5,7};
        int[] dizi2=new int[dizi1.length];

        for(int i=0; i<dizi1.length; i++){

            dizi2[i]=dizi1[i];

        }
        for (int i : dizi2){
            System.out.println(i);
        }

        int[] dizi3=new int[dizi1.length];
        System.out.println("Array copy methodu ile kopyalama");
        System.arraycopy(dizi1,0,dizi3,0,4);

        for (int gecici: dizi3){

            System.out.println(gecici);
        }







        /*
        int[] dizi = new int[10];
        int  i,j;
        for (i=0;i<=dizi.length; i++){

            dizi[i]=i*i;
            System.out.println( "Dizi["+i+"]: " + dizi[i] );

        }
        */

        /*

        int girilenDeger,i,j;

        int[] girilenSayilar = new int[5];

        Scanner deger = new Scanner(System.in);

        for(i=0;i<girilenSayilar.length; i++){

            System.out.println( i+". Elemanı Giriniz:");
            girilenDeger= deger.nextInt();
            girilenSayilar[i]=girilenDeger;

        }
        for(j=0;j<girilenSayilar.length;j++){
            System.out.println("Dizi["+j+"]: " + girilenSayilar[j]);
        }
        */
        /*
        String[] aylar = {"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};

        int girdi;
        Scanner ayBul = new Scanner(System.in);
        System.out.println("Ay numarasını giriniz.");
        girdi=ayBul.nextInt();

        if(girdi<0 || girdi >12){

            System.err.println("Lütfen 1-12 arası bir sayı giriniz.");

        }

        else {

            girdi=girdi-1;

            System.out.println(aylar[girdi]);


        }
        */
        /*
        int boyut,i;
        int toplam =0;

        Scanner tara = new Scanner(System.in);
        System.out.println("Boyutu Giriniz:");
        boyut = tara.nextInt();

        int[] dizi = new int[boyut];

        for (i=0; i<dizi.length; i++){
            dizi[i]= (int)(Math.random()*10);

            System.out.println("Dizi["+i+"]= "+dizi[i]);
            toplam = toplam + dizi[i];

        }
        System.out.println("Dizi ELemanları Toplamı: "+toplam);
        */
        /*

        int[] dizi = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        toplaminiBul(dizi);

        int[] dizi2 = new int[dizi.length];

        System.arraycopy(dizi,0,dizi2,0,dizi.length);

        for(int gecici:dizi2){

            System.out.println(gecici);
        }

        */




    }
    /*

    private static void toplaminiBul(int... sayilar) {

        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        System.out.println("Toplam:" + toplam);
    }

    */


}
