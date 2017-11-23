package com.company;
public class BabaBurger extends Hamburger {
    public BabaBurger() {
        super("Baba Burger", "Beyaz Ekmek", "Kırmızı Et", 20.12);
        super.ekleİlaveUrun1("patates",2.75);
        super.ekleİlaveUrun2("kola",1.88);
    }
    @Override
    public void ekleİlaveUrun1(String ad, double ucret) {
        System.out.println("İlave Ürün Ekleyemezsiniz");
    }
    @Override
    public void ekleİlaveUrun2(String ad, double ucret) {
        System.out.println("İlave Ürün Ekleyemezsiniz");
    }
    @Override
    public void ekleİlaveUrun3(String ad, double ucret) {
        System.out.println("İlave Ürün Ekleyemezsiniz");
    }
    @Override
    public void ekleİlaveUrun4(String ad, double ucret) {
        System.out.println("İlave Ürün Ekleyemezsiniz");
    }
}
