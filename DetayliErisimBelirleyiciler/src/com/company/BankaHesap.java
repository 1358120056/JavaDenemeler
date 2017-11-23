package com.company;

import java.util.ArrayList;

public class BankaHesap {

    private String hesapAdi;
    private int toplamHesapMiktari;
    private ArrayList<Integer> islemler;

    public BankaHesap(String hesapAdi) {
        this.hesapAdi = hesapAdi;
        this.islemler = new ArrayList<>();
    }

    public int getToplamHesapMiktari() {
        return toplamHesapMiktari;
    }

    public void paraYatir(int miktar) {

        if (miktar > 0) {

            this.islemler.add(miktar);
            this.toplamHesapMiktari += miktar;
            System.out.println(miktar + " TL hesabınıza yatırıldı. Güncel bakiyeniz: " + this.toplamHesapMiktari);
        } else {

            System.out.println("Negatif ücret yatıramazsınız.");
        }
    }

    public void paraCek(int miktar) {

        if (miktar > 0 && miktar < getToplamHesapMiktari()) {

            int cekilenMiktar = -miktar;
            this.islemler.add(cekilenMiktar);
            this.toplamHesapMiktari -= miktar;
            System.out.println(-cekilenMiktar + " TL hesaptan çekildi. Güncel bakiyeniz: " + this.toplamHesapMiktari);
        }
        else if(miktar<0){

            System.out.println("Para çekmek için pozitif değer giriniz.");
        }

        else  {

            System.out.println("Girilen para bakiyenizden büyük olduğu için bu kadar yüksek para çekemezsiniz");
        }
    }

    public void toplamIslemiHesapla() {

        this.toplamHesapMiktari = 0;
        for (int i:islemler) {
            this.toplamHesapMiktari += i;
        }
        System.out.println("Hesaplanan İşlemler sonucu toplam para : " + this.toplamHesapMiktari);
    }
}
