package com.company.mert;

public class Main {

    public static void main(String[] args) {

        Takim<FutbolOyuncusu> gs = new Takim("Galatasaray Futbol Takımı");
        Takim<FutbolOyuncusu> bs = new Takim("Boluspor Futbol Takımı");
        Takim<FutbolOyuncusu> rm = new Takim("Real Madrid Futbol Takımı");
        Takim<FutbolOyuncusu> np = new Takim("Napoli Futbol Takımı");

        Takim<BasketbolOyuncusu> efes = new Takim("Efes Pilsen");
        Takim<BasketbolOyuncusu> cska = new Takim("Cska Moskow");

        FutbolOyuncusu f1 = new FutbolOyuncusu("Ahmet");
        FutbolOyuncusu f2 = new FutbolOyuncusu("Mert");

        BasketbolOyuncusu b1 = new BasketbolOyuncusu("Altan");
        BasketbolOyuncusu b2 = new BasketbolOyuncusu("Tuna");

        Lig<Takim<FutbolOyuncusu>> fl1 = new Lig("Şampiyonlar Lig");
        Lig<Takim<BasketbolOyuncusu>> bl1 = new Lig("Eurolig");

        fl1.takimEkle(gs);
        fl1.takimEkle(bs);
        fl1.takimEkle(np);
        fl1.takimEkle(rm);

        bl1.takimEkle(efes);
        bl1.takimEkle(cska);

        gs.oyuncuEkle(f1);
        gs.oyuncuEkle(f1);
        bs.oyuncuEkle(f1);
        bs.oyuncuEkle(f2);

        gs.macYap(bs,futbolSkorUret(),futbolSkorUret());
        gs.macYap(rm,futbolSkorUret(),futbolSkorUret());
        gs.macYap(np,futbolSkorUret(),futbolSkorUret());
        bs.macYap(rm,futbolSkorUret(),futbolSkorUret());
        bs.macYap(np,futbolSkorUret(),futbolSkorUret());
        rm.macYap(np,futbolSkorUret(),futbolSkorUret());

        efes.macYap(cska,basketSkorUret(),basketSkorUret());
        cska.macYap(efes,basketSkorUret(),basketSkorUret());

        fl1.puanTablosu();

        System.out.println("Basket Ligi Puan Tablosu");

        bl1.puanTablosu();

    }
    private static int futbolSkorUret(){

        int a;
        a= (int) (Math.random() * 5);
        return a;
    }
    private static int basketSkorUret(){

        int a;
        a= (int) (Math.random() * 100);
        return a;
    }

}
