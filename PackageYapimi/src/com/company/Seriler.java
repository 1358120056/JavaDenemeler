package com.company;

public class Seriler {

    private int sayi;

    public int getSayi() {
        return sayi;
    }

    public static int nToplam(int sayi){

        int i;
        int toplam=0;

        toplam=(sayi*(sayi+1))/2;

        System.out.println("Toplam:" +toplam);
        return toplam;
    }
    public static int[] faktoriyel(int sayi){

        int[] faktoriyelDegerler= new int[sayi+1];
        faktoriyelDegerler[0]=0;

        int i;
        for (i=1;i<=sayi;i++){

            faktoriyelDegerler[i]= faktoriyelHesapla(i);

        }
        return faktoriyelDegerler;
    }
    private static int faktoriyelHesapla(int sayi) {

        if(sayi==0){
            return 0;
        }
        int i;
        int deger = 1;

        for (i=1;i<sayi;i++){

            deger*=i;
        }
        return deger;
    }

    public static int fibonacci(int sayi){

        if(sayi==0){
            return 0;
        }
        else if (sayi==1){
            return 1;
        }

        int birOnceki=1;
        int ikiOnceki=0;
        int fibonacci=0;
        int i;

        for(i=1;i<sayi;i++){

            fibonacci = birOnceki+ikiOnceki;
            ikiOnceki=birOnceki;
            birOnceki=fibonacci;


        }
        return fibonacci;
    }

}