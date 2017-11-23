package com.company;

import java.util.ArrayList;

public class Takim<T extends Oyuncu>  implements Comparable<Takim<T>>{

    private String takimAdi;
    private int oynadigiMacSayisi=0;
    private int kazandigiMacSayisi=0;
    private int kaybettigiMacSayisi=0;
    private int beraberlikMacSayisi=0;

    public int getOynadigiMacSayisi() {
        return oynadigiMacSayisi;
    }

    public int getKazandigiMacSayisi() {
        return kazandigiMacSayisi;
    }

    public int getKaybettigiMacSayisi() {
        return kaybettigiMacSayisi;
    }

    public int getBeraberlikMacSayisi() {
        return beraberlikMacSayisi;
    }

    private ArrayList<T> oyuncular = new ArrayList<>();

    public Takim(String isim) {
        this.takimAdi = isim;
    }
    public String getIsim() {
        return takimAdi;
    }

    public boolean oyuncuEkle(T yeniOyuncu){

        if(oyuncular.contains(yeniOyuncu)){

            System.out.println(yeniOyuncu.getIsim() +" zaten takımda kayıtlı");
            return false;
        }
        else {

            oyuncular.add(yeniOyuncu);
            System.out.println(yeniOyuncu.getIsim()+" ismi takıma eklendi");
            return true;
        }
    }
    public  int toplamOyuncuSayisi(){

        return oyuncular.size();
    }
    public void macYap(Takim<T> rakipTakim, int benimSkorum, int rakibinSkoru){

        String mesaj="";

        if(benimSkorum>rakibinSkoru){
            mesaj="kazandı.";
            kazandigiMacSayisi++;
        }
        else if(benimSkorum<rakibinSkoru){
            mesaj="kaybetti.";
            kaybettigiMacSayisi++;
        }
        else{
            mesaj="berabere.";
            beraberlikMacSayisi++;
        }
        oynadigiMacSayisi++;

        if(rakipTakim!=null){

            System.out.println(this.getIsim()+" "+ rakipTakim.getIsim() +" "+" karşısında " + mesaj);
            rakipTakim.macYap(null,rakibinSkoru,benimSkorum);
        }
    }
    public int toplamTakimPuani(){

        return kazandigiMacSayisi*3+beraberlikMacSayisi;
    }

    @Override
    public int compareTo(Takim<T> o) {

        if(this.toplamTakimPuani()>o.toplamTakimPuani()){
            return 1;
        }
        else if (this.toplamTakimPuani()<o.toplamTakimPuani()){
            return -1;
        }
        else {
            return 0;
        }


    }
}
