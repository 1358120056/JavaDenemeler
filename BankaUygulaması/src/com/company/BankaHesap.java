package com.company;

import java.sql.Time;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class BankaHesap {

    private double bakiye;
    private String hesapNo;
    private ReentrantLock kilit;

    public BankaHesap(double bakiye, String hesapNo) {

        this.bakiye = bakiye;
        this.hesapNo = hesapNo;
        this.kilit=new ReentrantLock();
    }

    public void paraYatir(double miktar){

        boolean sonuc = false;

        try {
            if(kilit.tryLock(2000, TimeUnit.MILLISECONDS)){
                try{
                    bakiye+=miktar;
                    sonuc=true;
                    System.out.println(miktar + " " +Thread.currentThread().getName()+ " tarafından para yatırıldı. Bakiye: "+bakiye);
                }finally {
                    kilit.unlock();
                }
            }else{
                System.out.println(Thread.currentThread().getName()+" 1 saniye kilitlemeye çalıştım ama başaramadım");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Yapılan işlem durumu : "+sonuc);
    }
    public void paraCek(double miktar){

        boolean sonuc = false;

        try {
            if(kilit.tryLock(2000, TimeUnit.MILLISECONDS)){
                try{
                    bakiye-=miktar;
                    sonuc = false;
                    System.out.println(miktar + " " +Thread.currentThread().getName()+ " tarafından para çekildi. Bakiye: "+bakiye);
                }finally {
                    kilit.unlock();
                }
            }else{
                System.out.println(Thread.currentThread().getName()+" 1 saniye kilitlemeye çalıştım ama başaramadım");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Yapılan işlem durumu : "+sonuc);
    }
    /*
    public void paraYatir(double miktar){

        kilit.lock();
        bakiye+=miktar;
        System.out.println(miktar + " " +Thread.currentThread().getName()+ " tarafından para yatırıldı. Bakiye: "+bakiye);
        kilit.unlock();

    }
    public void paraCek(double miktar){

            kilit.lock();
            bakiye-=miktar;
            System.out.println(miktar + " " +Thread.currentThread().getName()+ " tarafından para çekildi. Bakiye: "+bakiye);
            kilit.unlock();

    }
    */
    /*
    public synchronized void paraYatir(double miktar){
        bakiye+=miktar;
        System.out.println(miktar + " para yatırıldı. Bakiye: "+bakiye);
    }
    public void paraCek(double miktar){

        synchronized (this){
            bakiye-=miktar;
            System.out.println(miktar + " para çekildi. Bakiye: "+bakiye);
        }
    }
    */

    public String getHesapNo(){
        return hesapNo;
    }

    public void hesapNoYazdir(){
        System.out.println("Hesap No : " +getHesapNo());
    }
}
