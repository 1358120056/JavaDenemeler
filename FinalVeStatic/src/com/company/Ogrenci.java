package com.company;

public class Ogrenci {

    private String isim;
    public static int toplamOgrenciSayisi =0;
    private final int ogrNo;

    public Ogrenci(String isim) {
        this.isim = isim;
        toplamOgrenciSayisi++;
        this.ogrNo = toplamOgrenciSayisi;
        System.out.println(isim + " adlı ögrenci oluşturuldu. Ogr No :" + ogrNo);
    }

}
