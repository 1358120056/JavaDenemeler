package com.company;

import javax.jws.soap.SOAPBinding;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(Ogrenci.ogrSayisi);
        System.out.println(Ogrenci.ogrSayisi);

        Ogrenci ogr1 = new Ogrenci(1,"ahmet");

        System.out.println(Ogrenci.ogrSayisi);

        Ogrenci ogr2 = new Ogrenci(2,"mert");

        System.out.println(Ogrenci.ogrSayisi);

        Ogrenci ogr3 = new Ogrenci(3,"yavuz");

        System.out.println(Ogrenci.ogrSayisi);


        Ogrenci.selamVer();

    }
}
