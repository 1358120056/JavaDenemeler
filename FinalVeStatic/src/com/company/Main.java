package com.company;

public class Main {

    public static void main(String[] args) {

        Ogrenci og1 = new Ogrenci("mert");
        System.out.println(Ogrenci.toplamOgrenciSayisi);
        Ogrenci og2 = new Ogrenci("ahmet");
        System.out.println(Ogrenci.toplamOgrenciSayisi);
        Ogrenci og3 = new Ogrenci("yavuz");
        System.out.println(Ogrenci.toplamOgrenciSayisi);


        Password p1 = new KalitilmisPassword(8);
        p1.sifreSakla();

        p1.girisYap(15);
        p1.girisYap(-3);
        p1.girisYap(3);
        p1.girisYap(8);




    }
}
