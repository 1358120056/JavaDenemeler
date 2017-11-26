package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    static ArrayList<String> kisiler = new ArrayList();

    public static void main(String[] args) {

        String[] isimler = {"Mert","Tuna","Altan"};
        String[] soyadlari = {"Yavuz","Çetinkaya","Yavuz"};


        ArrayList<String> kisiler2=birlestir(isimler,soyadlari);

        yazdir(kisiler2);


    }

    private static void yazdir(ArrayList<String> kisiler) {
        for(String s : kisiler){
            System.out.println(s);
        }
    }
    private static ArrayList<String> birlestir(String[] a , String[] b) {

        int i;
        for(i=0;i<a.length;i++){

            Random random = new Random();
            int rastgeleSayi = random.nextInt(50);
            kisiler.add(a[i]+" "+b[i]+" "+rastgeleSayi);
        }
        return kisiler;
    }
}
