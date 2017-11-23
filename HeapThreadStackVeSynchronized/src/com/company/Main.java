package com.company;

import java.lang.invoke.SwitchPoint;

public class Main {

    public static void main(String[] args) {

        /*
        GeriSayim geriSayim1 = new GeriSayim();
        GeriSayim geriSayim2 = new GeriSayim();

        */

        GeriSayim geriSayim = new GeriSayim();


        GeriSayThread t1 = new GeriSayThread(geriSayim);
        t1.setName("Thread 1");

        GeriSayThread t2 = new GeriSayThread(geriSayim);
        t2.setName("Thread 2");

        GeriSayThread t3 = new GeriSayThread(geriSayim);
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();

    }
}
class GeriSayim{

    private int i;

    public synchronized void geriSay(){

        String renk;
        switch(Thread.currentThread().getName()){

            case "Thread 1":
                renk = ThreadRenk.ANSI_KIRMIZI;
                break;

            case "Thread 2":
                renk=ThreadRenk.ANSI_MAVI;
                break;

            default:
                renk=ThreadRenk.ANSI_YESIL;
        }
        for(i=10; i>0;i--){
            System.out.println(renk + Thread.currentThread().getName() + ": i=" +i);
        }
    }
}
class GeriSayThread extends Thread{

    private GeriSayim geriSayim;
    public GeriSayThread(GeriSayim geriSayim){
        this.geriSayim =geriSayim;
    }
    @Override
    public void run() {
        geriSayim.geriSay();
    }
}