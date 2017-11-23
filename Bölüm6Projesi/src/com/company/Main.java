package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int i;

        String[] isimler = {"Mert","Kadir","Gökhan"};
        String[] soyİsimler = {"Yavuz","Özlem","Yoldaş"};

        ArrayList<String> gelen=birlestir(isimler,soyİsimler);
        yazdir(gelen);
    }
    private static void yazdir(ArrayList<String> gelen) {
        for(String temp:gelen){
            System.out.println(temp);
        }
    }
    private static ArrayList<String> birlestir(String[] isim, String[] soyad) {
        ArrayList<String> tamAdlari = new ArrayList<>();
        int yas;
        for (int i=0;i<3;i++){
            yas= (int) (Math.random()*50);
            String isimSoyisim=isim[i]+" "+soyad[i]+" "+yas;
            //System.out.println(isimSoyisim);
            tamAdlari.add(isimSoyisim);
        }
        return tamAdlari;
    }
}
