package com.company;

import java.util.ArrayList;

public class Rehber {

    private ArrayList<Kisi> rehber;
    private String kendiNumaram;

    public Rehber(String kendiNumaram){
        this.kendiNumaram=kendiNumaram;
        this.rehber = new ArrayList<>();
    }
    public boolean ekleYeniKisi(Kisi yeniKisi){

        if(kisiBul(yeniKisi.getAdi())>=0){
            System.out.println(yeniKisi.getAdi()+" değeri rehberde zaten kayıtlı.");
            return false;
        }

        rehber.add(yeniKisi);
        return true;
    }

    public int kisiBul(Kisi aranacak){

        return this.rehber.indexOf(aranacak);

    }

    public int kisiBul(String isim){

        int i;
        for (i=0;i<this.rehber.size();i++){
            Kisi oAnkiKisiNesnesi = this.rehber.get(i);
            if(oAnkiKisiNesnesi.getAdi().equals(isim)){
                return i;
            }
        }

        return -1;
    }

    public void tumRehber(){

        System.out.println("*******Tüm Rehber*******");

        int i;
        if(rehber.size()==0){

            System.out.println("Rehber Boş \n\n");
            return;

        }
        for (i=0;i<this.rehber.size();i++){
            System.out.println((i+1)+"- "+rehber.get(i).getAdi() +"- "+rehber.get(i).getTelNo());
        }


    }

    public Kisi kisiSorgula(String isim){


        int position=kisiBul(isim);

        if(position>=0){
            return rehber.get(position);
        }
        return null;
    }

    public boolean silinecenKisi(String isim){

        int position = kisiBul(isim);

        if(position<0){

            System.out.println("Böyle biri yok");
            return false;

        }
        else {

            this.rehber.remove(isim);
            return true;

        }

    }

}

