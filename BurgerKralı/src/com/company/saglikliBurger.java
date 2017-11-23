package com.company;
public class saglikliBurger extends Hamburger {
    private String ilaveSaglikliUrunAdi1;
    private double ilaveSaglikliUrunUcreti1;
    private String ilaveSaglikliUrunAdi2;
    private double ilaveSaglikliUrunUcreti2;
    public saglikliBurger(String etCesidi, double ucreti) {
        super("Sağlıklı Burger", "Kepekli Ekmek", etCesidi, ucreti);
    }
    public void ekleSağlikliUrun1(String ad,double ucret){
        this.ilaveSaglikliUrunAdi1=ad;
        this.ilaveSaglikliUrunUcreti1=ucret;
    }
    public void ekleSağlikliUrun2(String ad,double ucret){
        this.ilaveSaglikliUrunAdi2=ad;
        this.ilaveSaglikliUrunUcreti2=ucret;
    }
    @Override
    public double hamburgerBilgileri() {
        double toplamUcret = super.hamburgerBilgileri();
        if(this.ilaveSaglikliUrunAdi1 != null){
            toplamUcret += this.ilaveSaglikliUrunUcreti1;
            System.out.println("İlave Ürün: "+this.ilaveSaglikliUrunAdi1+ "  Ücreti: " + this.ilaveSaglikliUrunUcreti1 );

        }
        if(this.ilaveSaglikliUrunAdi2 != null){
            toplamUcret += this.ilaveSaglikliUrunUcreti2;
            System.out.println("İlave Ürün: "+this.ilaveSaglikliUrunAdi2+ "  Ücreti: " + this.ilaveSaglikliUrunUcreti2 );
        }
        return toplamUcret;
    }
}

