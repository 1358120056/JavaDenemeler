package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Calisan c1 = new Calisan("mert", 23);
        Calisan c2 = new Calisan("ahmet", 17);
        Calisan c3 = new Calisan("yavuz", 33);
        Calisan c4 = new Calisan("tuna", 2);

        ArrayList<Calisan> calisanlar = new ArrayList<>();
        calisanlar.add(c1);
        calisanlar.add(c2);
        calisanlar.add(c3);
        calisanlar.add(c4);


        /*
        Collections.sort(calisanlar, new Comparator<Calisan>() {
            @Override
            public int compare(Calisan o1, Calisan o2) {
                return o1.getIsim().compareTo(o2.getIsim());
            }
        });
    */



        Collections.sort(calisanlar,(Calisan cal1, Calisan cal2) -> cal1.getIsim().compareTo(cal2.getIsim()));


        for(Calisan calisan : calisanlar){

            System.out.println(calisan.getIsim());

        }


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

