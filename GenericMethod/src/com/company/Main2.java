package com.company;

public class Main2 {
    public static void main(String[] args) {

        Kare k1 = new Kare(6);
        Kare k2 = new Kare(4);

        Dikdörtgen d1 = new Dikdörtgen(4,9);
        Dikdörtgen d2 = new Dikdörtgen(13,5);

        Kare alaniBuyukKare=alanKarşılaştir(k1,k2);
        System.out.println(alaniBuyukKare.alanBul());

        Dikdörtgen alaniBuyukDikdortgen = alanKarşılaştir(d1,d2);
        System.out.println(alaniBuyukDikdortgen.alanBul());


    }
    public static <Genel extends Sekiller> Genel alanKarşılaştir(Genel a,Genel b){

        if(a.alanBul()>b.alanBul()){
            return a;
        }
        else {
            return b;
        }
    }
}
