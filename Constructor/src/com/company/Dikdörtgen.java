package com.company;

public class Dikdörtgen {
    private double en;
    private double boy;
    public Dikdörtgen(){
        en=11;
    }
    public Dikdörtgen(double boy){
        this.boy=boy;
        this.en=10;
    }
    public Dikdörtgen(double en,double boy){
        this.en=en;
        this.boy=boy;
    }
    public double alaniHesapla(){
        return en*boy;
    }
    public double getEn() {
        return en;
    }

    public void setEn(double en) {
        this.en = en;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }
}
