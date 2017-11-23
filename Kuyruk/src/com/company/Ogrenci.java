package com.company;

public class Ogrenci implements Comparable<Ogrenci> {

    private int ogrNo;
    private int ogrNot;

    public Ogrenci(int ogrNo, int ogrNot) {
        this.ogrNo = ogrNo;
        this.ogrNot = ogrNot;
    }

    @Override
    public String toString() {
        return "Ogrenci No:" + this.ogrNo + " Ogrenci Not : "+this.ogrNot;
    }

    @Override
    public int compareTo(Ogrenci o) {
        if(this.ogrNot == o.ogrNot){
            return 0;
        }else if(this.ogrNot > o.ogrNot){
            return 1;
        }else if (this.ogrNot < o.ogrNot) {
            return -1;
        }

        return 0;
    }
}
