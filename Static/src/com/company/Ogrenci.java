package com.company;

public class Ogrenci {

    private int ogrNo;
    private String isim;
    public static int ogrSayisi=0;

    public Ogrenci(int ogrNo, String isim) {
        this.ogrNo = ogrNo;
        this.isim = isim;
        ogrSayisi++;
    }

    public int getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(int ogrNo) {
        this.ogrNo = ogrNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getOgrSayisi() {
        return ogrSayisi;
    }

    public void setOgrSayisi(int ogrSayisi) {
        this.ogrSayisi = ogrSayisi;
    }

    public static void selamVer(){

        System.out.println("merhaba");

    }

}
