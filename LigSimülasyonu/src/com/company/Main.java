package com.company;

public class Main {

    public static void main(String[] args) {

        FutbolOyuncu f1 = new FutbolOyuncu("ahmet");
        FutbolOyuncu f2 = new FutbolOyuncu("mert");

        BasketbolOyuncu b1 = new BasketbolOyuncu("Tuna");
        BasketbolOyuncu b2 = new BasketbolOyuncu("Altan");

        Takim<FutbolOyuncu> gs = new Takim("Galatasaray Futbol Takımı");
        Takim<FutbolOyuncu> bs = new Takim("Boluspor Futbol Takımı");
        Takim<FutbolOyuncu> rm = new Takim("Real Madrid Futbol Takımı");
        Takim<FutbolOyuncu> np = new Takim("Napoli Futbol Takımı");

        Takim<BasketbolOyuncu> efes = new Takim("Efes Basketbol Takımı");
        Takim<BasketbolOyuncu> cska = new Takim("CSKA Basketbol Takımı");

        gs.oyuncuEkle(f1);
        gs.oyuncuEkle(f2);
        System.out.println(gs.toplamOyuncuSayisi());

        efes.oyuncuEkle(b1);
        efes.oyuncuEkle(b2);

        gs.macYap(bs,2,2);
        gs.macYap(rm,4,1);
        gs.macYap(np,3,0);
        bs.macYap(rm,1,1);
        bs.macYap(np,5,0);
        rm.macYap(np,2,2);

        /*

        System.out.println("Gs Puanı= "+gs.toplamTakimPuani());
        System.out.println("Bs Puanı= "+bs.toplamTakimPuani());
        System.out.println("Rm Puanı= "+rm.toplamTakimPuani());
        System.out.println("Np Puanı= "+np.toplamTakimPuani());


        System.out.println("oynadığı "+gs.getOynadigiMacSayisi());
        System.out.println("galibiyet "+gs.getKazandigiMacSayisi());
        System.out.println("berabere "+gs.getBeraberlikMacSayisi());
        System.out.println("kayıp "+gs.getKaybettigiMacSayisi());

        */

        Lig<Takim<FutbolOyuncu>> futbolLigi = new Lig("Süper Ligi");
        Lig<Takim<BasketbolOyuncu>> basketbolLigi = new Lig("Basket Ligi");

        futbolLigi.takimEkle(gs);
        futbolLigi.takimEkle(bs);
        futbolLigi.takimEkle(rm);
        futbolLigi.takimEkle(np);

        futbolLigi.puanTablosu();




    }
}
