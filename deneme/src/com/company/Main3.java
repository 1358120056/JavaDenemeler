package com.company;

/**
 * Created by Emre Altunbilek on 19.07.2017.
 */
public class Main3 {

    public static void main(String[] args) {

        GeometrikSekil gs1=new GeometrikSekil();
        Kare k1=new Kare(7);
        Dikdortgen d1=new Dikdortgen(8, 14);

        GeometrikSekil gs2=new GeometrikSekil();
        Kare k2=new Kare(9);
        Dikdortgen d2=new Dikdortgen(18, 24);

        Daire dd1=new Daire(3);
        Daire dd2=new Daire(6);

        GeometrikSekil[] sekillerDizisi=new GeometrikSekil[8];
        sekillerDizisi[0] = gs1;
        sekillerDizisi[1] = k1;
        sekillerDizisi[2] = d1;
        sekillerDizisi[3] = gs2;
        sekillerDizisi[4] = k2;
        sekillerDizisi[5] = d2;
        sekillerDizisi[6]=  dd1;
        sekillerDizisi[7] = dd2;

        sekilAlanHesaplaMethodu(sekillerDizisi);


    }

    public static void sekilAlanHesaplaMethodu(GeometrikSekil[] sekiller){

        for(GeometrikSekil geciciNesne : sekiller){
            System.out.println("Seklin Alani: " + geciciNesne.alanHesapla());
        }

    }
}
