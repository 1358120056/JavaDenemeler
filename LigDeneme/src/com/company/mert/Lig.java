package com.company.mert;

import java.util.ArrayList;
import java.util.Collections;

public class Lig<T extends Takim> {

    private String ligAdi;

    public String getLigAdi() {
        return ligAdi;
    }

    public Lig(String ligAdi) {
        this.ligAdi = ligAdi;
    }

    private ArrayList<T> takimlar = new ArrayList<>();

    public boolean takimEkle(T yeniTakim){

        if(takimlar.contains(yeniTakim)){

            System.out.println(yeniTakim.getTakimAdi() + "zaten bir lige ekli");
            return false;
        }
        else {
            takimlar.add(yeniTakim);
            System.out.println(yeniTakim.getTakimAdi()+" "+ this.getLigAdi()+ "ine eklendi." );
            return true;
        }
    }
    public void puanTablosu(){

        Collections.sort(takimlar, Collections.reverseOrder());
        System.out.println(this.getLigAdi()+" Puan Tablosu");
        for(T gecici: takimlar){
            System.out.println(gecici.getTakimAdi() +" "+ gecici.getOynadigiMacSayisi()+" "+gecici.getKazandigiMacSayisi()
                    +" "+gecici.getBeraberlikMacSayisi()+" "+gecici.getKaybettigiiMacSayisi()+ " "+gecici.toplamPuan());
        }

    }

}
