package com.company;

import java.util.ArrayList;

public class Takim <T extends Oyuncu>  implements Comparable<Takim<T>> {

    private String takimAdi;
    private int oynadigiMacSayisi;
    private int kazandigiMacSayisi = 0;
    private int beraberlikMacSayisi = 0;
    private int kaybettigiMacSayisi = 0;

    public String getTakimAdi() {
        return takimAdi;
    }

    public int getOynadigiMacSayisi() {
        return oynadigiMacSayisi;
    }

    public int getKazandigiMacSayisi() {
        return kazandigiMacSayisi;
    }

    public int getBeraberlikMacSayisi() {
        return beraberlikMacSayisi;
    }

    public int getKaybettigiiMacSayisi() {
        return kaybettigiMacSayisi;
    }

    private ArrayList<T> oyuncular = new ArrayList<>();

    public Takim(String takimAdi) {

        this.takimAdi = takimAdi;
    }

    public boolean oyuncuEkle(T yeniOyuncu) {

        if (oyuncular.contains(yeniOyuncu)) {
            System.out.println(yeniOyuncu.getOyuncuAdi() + " zaten bir takımda bulunuyor.");
            return false;
        } else {
            oyuncular.add(yeniOyuncu);
            System.out.println(yeniOyuncu.getOyuncuAdi() + " takıma eklendi.");
            return true;
        }
    }

    public int oyuncuSayisi() {
        return oyuncular.size();
    }

    public void macYap(Takim<T> rakipTakim, int benimGoller, int rakipGoller) {

        oynadigiMacSayisi++;
        String mesaj = "";
        if (benimGoller > rakipGoller) {

            mesaj = "Kazandı";
            kazandigiMacSayisi++;
        } else if (benimGoller < rakipGoller) {
            mesaj = "Kaybetti.";
            kaybettigiMacSayisi++;
        } else {
            mesaj = "Berabere bitti.";
            beraberlikMacSayisi++;
        }
        if (rakipTakim != null) {

            System.out.println(this.getTakimAdi() + " " + benimGoller + " : " + rakipGoller + " " + rakipTakim.getTakimAdi());
            rakipTakim.macYap(null, rakipGoller, benimGoller);
        }


    }

    public int toplamPuan() {

        return kazandigiMacSayisi * 3 + beraberlikMacSayisi;
    }

    @Override
    public int compareTo(Takim<T> o) {

        if (this.toplamPuan() > o.toplamPuan()) {

            return 1;
        }
        else if(this.toplamPuan() < o.toplamPuan()){

            return -1;
        }
        else {
            return 0;
        }
    }
}