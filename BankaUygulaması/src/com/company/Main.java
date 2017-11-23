package com.company;

public class Main {

    public static void main(String[] args) {

        BankaHesap hesap1 = new BankaHesap(1000,"123-45");

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                hesap1.paraYatir(400);
                hesap1.paraCek(250);
                hesap1.hesapNoYazdir();
            }
        };
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                hesap1.paraYatir(150);
                hesap1.paraCek(350);
                System.out.println("asd : "+hesap1.getHesapNo());
            }
        });
        thread2.start();
    }
}
