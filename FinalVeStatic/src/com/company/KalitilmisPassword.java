package com.company;

public class KalitilmisPassword extends Password {

    private int passwordSifresiz;

    public KalitilmisPassword(int sifrelenmisPassword) {
        super(sifrelenmisPassword);
        this.passwordSifresiz=sifrelenmisPassword;
    }

    @Override
    public void sifreSakla() {
        System.out.println("Şifre şu şekikde saklandı: "+this.passwordSifresiz);
    }
}
