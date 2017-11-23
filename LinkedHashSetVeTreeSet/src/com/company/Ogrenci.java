package com.company;

public class Ogrenci implements Comparable<Ogrenci>{

    private int ogrNo;
    private int ogrNot;

    public Ogrenci(int ogrNo, int ogrNot) {
        this.ogrNo = ogrNo;
        this.ogrNot = ogrNot;
    }

    @Override
    public String toString() {
        return "Öğrenci No: "+ogrNo +" Öğrenci Notu: "+ ogrNot ;
    }

    @Override
    public int compareTo(Ogrenci o) {
        if(this.ogrNo==o.ogrNo){
            return 0;
        }
        else if(this.ogrNo<o.ogrNo){
            return -1;
        }
        else{
            return 1;
        }
    }
}
