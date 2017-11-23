package com.company;

public class Main {

    public static void main(String[] args) {

    BankaHesap h1 = new BankaHesap("Mert Hesap");
    h1.paraYatir(500);
    h1.paraCek(150);
    h1.paraYatir(-52);
    h1.paraCek(-92);
    h1.toplamIslemiHesapla();

    h1.islemler.add(5000);
    h1.toplamIslemiHesapla();

    h1.toplamHesapMiktari+=1000;
    h1.toplamIslemiHesapla();


    }
}
