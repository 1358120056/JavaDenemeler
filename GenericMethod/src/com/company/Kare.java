package com.company;

public class Kare extends Sekiller {

    private double kenarUzunluğu;

    public Kare() {
        this.kenarUzunluğu=0;
    }

    public Kare(double kenarUzunluğu) {
        this.kenarUzunluğu = kenarUzunluğu;
    }

    public double getKenarUzunluğu() {
        return kenarUzunluğu;
    }

    public void setKenarUzunluğu(double kenarUzunluğu) {
        this.kenarUzunluğu = kenarUzunluğu;
    }

    @Override
    public double alanBul() {
        return kenarUzunluğu*kenarUzunluğu;
    }
}
