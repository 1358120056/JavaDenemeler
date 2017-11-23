package com.company;

public class YeniThread extends Thread {

    @Override
    public void run() {
        System.out.println(ThreadRenk.ANSI_MAVI+"Ben 50 saniye uyuyacağım "+ Thread.currentThread().getName());

        for(int i=1;i<=50;i++){
            try {
                System.out.println(ThreadRenk.ANSI_MAVI+"Uykumun "+i+". saniyesindeyim");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(ThreadRenk.ANSI_MAVI+"Uykum Bölündü");
                return;
            }
        }
    }
}
