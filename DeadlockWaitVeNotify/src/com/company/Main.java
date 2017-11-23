package com.company;

import java.io.RandomAccessFile;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Mesaj mesaj = new Mesaj();
        new Thread(new Okuyucu(mesaj)).start();
        new Thread(new Yazici(mesaj)).start();

    }
}
    class Mesaj {

        private String mesaj;
        private boolean okunacakOgeVar = false;

        public synchronized String oku(){


            System.out.println(ThreadRenk.ANSI_KIRMIZI+"oku metodunda ki while çalışacak");
            while(okunacakOgeVar==false){

                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }

            okunacakOgeVar=false;
            notifyAll();
            return mesaj;
        }
        public synchronized void yaz(String m){

            System.out.println(ThreadRenk.ANSI_MAVI+"yaz metodunda ki while çalışacak");
            while(okunacakOgeVar==true){

                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            this.mesaj=m;
            okunacakOgeVar=true;
            notifyAll();
        }

    }

    class Yazici implements Runnable{

        public Mesaj mesaj;


        public Yazici(Mesaj mesaj) {
            this.mesaj = mesaj;
        }

        @Override
        public void run() {

            String[] yazilacaklar = {"ahmet","mert","yavuz","tuna"};

            Random random = new Random();

            for(int i =0;i< yazilacaklar.length;i++){

                mesaj.yaz(yazilacaklar[i]);
                try {
                    Thread.sleep(random.nextInt(4000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            mesaj.yaz("SON");
        }
    }
    class Okuyucu implements Runnable{

        private Mesaj mesaj;

        public Okuyucu(Mesaj mesaj) {
            this.mesaj = mesaj;
        }

        @Override
        public void run() {

            Random random = new Random();

            for(String sonMesaj = mesaj.oku(); !sonMesaj.equals("SON");sonMesaj=mesaj.oku() ){
                System.out.println(sonMesaj);

                try {
                    Thread.sleep(random.nextInt(4000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }



        }
    }
