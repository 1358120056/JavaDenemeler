package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.rmi.registry.Registry;
import java.util.Scanner;

public class Main {

    private static Scanner tara = new Scanner(System.in);
    private static Rehber rehber = new Rehber("12345");

    public static void main(String[] args)
    {

        telefonuBaslat();
        menuyuGöster();

        boolean cikis = false;

        while (!cikis){


            int secim;
            secim =tara.nextInt();
            switch (secim){
                case 0:
                    System.out.println("çıkış yapılıyor");
                    cikis=true;
                    break;
                case 1:
                    rehber.tumRehber();
                    break;
                case 2:
                    yeniKisiEkle();
                    break;
                case 3:
                    kisiSorgula();
                    break;
                case 4:
                    kisiSilMethodu();
                    break;
                case 5:
                    System.out.println("5 e bastınız.");
                    break;
                case 6:
                    menuyuGöster();
                    break;

                default:
                    System.out.println("1-6 arası bir değer giriniz.");

            }
        }

    }

    private static void kisiSilMethodu() {

        System.out.println("Silinecek kişinin adını giriniz.");
        String isim = tara.next();

    }

    private static void kisiSorgula() {

        System.out.println("Aranacak Kişi İsmini Giriniz.");
        String isim = tara.next();

        Kisi bulunanKisi = rehber.kisiSorgula(isim);

        if(bulunanKisi==null){

            System.out.println("Kişi kayıtlı değil.");
            return;
        }
        System.out.println("Bulunan Kişi :"+bulunanKisi.getAdi() + " - " +bulunanKisi.getTelNo() );
    }

    private static void yeniKisiEkle() {

        System.out.println("Yeni Kişinin İsmi:");
        String isim = tara.next();
        System.out.println("Yeni Kişinin Numarası");
        String telNo = tara.next();

        rehber.ekleYeniKisi(Kisi.Olustur(isim,telNo));

        System.out.println();



    }

    private static void telefonuBaslat() {

        System.out.println("Telefon Başlatılıyor.");

    }

    private static void menuyuGöster() {

        System.out.println("*******MENÜ*******");
        System.out.println("0-Çıkış");
        System.out.println("1-Rehberi Göster");
        System.out.println("2-Kişi Ekle");
        System.out.println("3-Kişi Sorgula");
        System.out.println("4-Kişi Sil");
        System.out.println("5-Kişi Güncelle");
        System.out.println("6-Menüyü Göster");
        System.out.println("Yapmak istediğiniz işlemi seçiniz.");

    }
}
