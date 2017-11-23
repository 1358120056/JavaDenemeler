package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(ThreadRenk.ANSI_MAVI+"Main Threadden Merhaba "+Thread.currentThread().getName());

        YeniThread yeniThread = new YeniThread();
        //yeniThread.setName("yeni bu");
        yeniThread.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(ThreadRenk.ANSI_KIRMIZI+"Anonim Thread sınıfından Merhaba:"+Thread.currentThread().getName());
            }
        }.start();


        Thread runnableThread = new Thread(new RunnableSinif());
        runnableThread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ThreadRenk.ANSI_TURKUAZ+"Runnable anonim classdan merhaba"+Thread.currentThread().getName());
            }
        }).start();
    }
}
