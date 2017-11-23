package com.company;

public class Main {

    public static void main(String[] args) {

        YeniThread yeniThread = new YeniThread();
        yeniThread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ThreadRenk.ANSI_KIRMIZI+"Ben 10 saniye uyuyacağım ");

                for(int i = 1;i<=10;i++){
                    try {
                        yeniThread.join(5000);
                        Thread.sleep(1000);
                        /*
                        if(i==2){
                         yeniThread.interrupt();
                        }
                        */

                        if(i==2){
                            yeniThread.interrupt();
                        }

                        System.out.println(ThreadRenk.ANSI_KIRMIZI+"Uykumun "+i+". saniyesindeyim");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


    }
}
