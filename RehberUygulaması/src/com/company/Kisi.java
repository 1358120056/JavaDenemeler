package com.company;

public class Kisi {

    private String ismi;
    private String telNo;

    public Kisi(String ismi, String telNo) {
        this.ismi = ismi;
        this.telNo = telNo;
    }

    public String getAdi() {
        return ismi;
    }

    public String  getTelNo() {
        return telNo;
    }

    public static Kisi Olustur(String ismi, String  telNo){

        return new Kisi(ismi,telNo);

    }

}


