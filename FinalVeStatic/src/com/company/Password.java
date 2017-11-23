package com.company;

public class Password {

    private static final int anahtarDeger=124523;

    private final int sifrelenmisPassword;

    public Password(int sifrelenmisPassword) {
        this.sifrelenmisPassword = passwordSifrele(sifrelenmisPassword);
    }

    private int passwordSifrele(int pass) {

        return pass ^anahtarDeger;
    }
    public void sifreSakla(){

        System.out.println("Şifre şu şekikde saklandı: "+this.sifrelenmisPassword);

    }
    public boolean girisYap(int pass){

        if(passwordSifrele(pass)==this.sifrelenmisPassword){

            System.out.println("Hoşgeldiniz.");
            return true;
        }
        else {
            System.out.println("Hatalı giriş yaptınız.");
            return false;
        }

    }
}
