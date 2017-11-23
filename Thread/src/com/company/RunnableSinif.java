package com.company;

public class RunnableSinif implements Runnable {


    @Override
    public void run() {
        System.out.println(ThreadRenk.ANSI_YESIL+"Runnable sınıfından merhaba: "+Thread.currentThread().getName());
    }
}
