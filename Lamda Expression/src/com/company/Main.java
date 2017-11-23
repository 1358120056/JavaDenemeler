package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Calisan c1 = new Calisan("mert",23);
        Calisan c2 = new Calisan("ahmet",17);
        Calisan c3 = new Calisan("yavuz",33);
        Calisan c4 = new Calisan("tuna",2);

        ArrayList<Calisan> calisanlar = new ArrayList<>();
        calisanlar.add(c1);
        calisanlar.add(c2);
        calisanlar.add(c3);
        calisanlar.add(c4);

        /*
        for(Calisan calisan : calisanlar){

            bilgileriYazdir(new YazdiranInterface() {
                @Override
                public void yazdir() {
                    System.out.println(calisan.getIsim()+":"+calisan.getYas());
                }
            });
        }
        */

        for(Calisan calisan:calisanlar){
                bilgileriYazdir(()->System.out.println(calisan.getIsim()+":"+calisan.getYas()));
        }

        new Thread(new ThreaSinifi()).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonim sınıf çalıştı.");
            }
        }).start();


        new Thread(() -> {System.out.println("Lambda anonim run");
            System.out.println("2.satır çalıştı");} ).start();

    }

    public static void bilgileriYazdir(YazdiranInterface yazdiranInterface){

        yazdiranInterface.yazdir();

    }
}
class ThreaSinifi extends Thread{

    @Override
    public void run() {
        System.out.println("Thread sınıfı çalıştı.");
    }
}


class Calisan{

    private String isim;
    private int yas;

    public Calisan(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}

