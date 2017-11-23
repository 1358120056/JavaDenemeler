package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String albumAdi;
    private String sarkiciAdi;
    private ArrayList<Sarki> sarkilar = new ArrayList<>();


    public Album(String albumAdi, String sarkiciAdi) {
        this.albumAdi = albumAdi;
        this.sarkiciAdi = sarkiciAdi;

        sarkilar = new ArrayList<>();
    }
    public boolean sarkiEkle(String sarkiAdi,double sarkiSuresi){

        if(sarkiBul(sarkiAdi)==null){
            Sarki s = new Sarki(sarkiAdi,sarkiSuresi);
            sarkilar.add(s);
            return true;
        }
        else {
            System.out.println("Şarkı zaten albümde yer alıyor");
            return false;
        }
    }
    private Sarki sarkiBul(String sarkiAdi) {
        for(Sarki oAnKiSarki : sarkilar){
            if(oAnKiSarki.getSarkiAdi().equals(sarkiAdi)){
                return oAnKiSarki;
            }
        }
        return null;
    }
    public boolean oynatmaListesineEkle(String sarkiAdi, LinkedList<Sarki> oynatmaListesi){

        Sarki eklenecekSarki = sarkiBul(sarkiAdi);

        if(eklenecekSarki != null){

            oynatmaListesi.add(eklenecekSarki);
            return true;
        }
        else {
            System.out.println(sarkiAdi + " bir albümde kayıtlı değil");
            return false;
        }
    }
    public boolean oynatmaListesineEkle(int sarkiNumarasi, LinkedList<Sarki> oynatmaListesi){

        int index = sarkiNumarasi -1 ;

        if(index >= 0  && index<=this.sarkilar.size()){

            oynatmaListesi.add(this.sarkilar.get(index));
            return true;
        }
        else{
            System.out.println("Bu albümde belirtilen şarkı yok.");
            return false;
        }
    }


}


