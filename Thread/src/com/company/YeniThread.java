package com.company;

public class YeniThread extends Thread{

    @Override
    public void run() {

        System.out.println(ThreadRenk.ANSI_MOR +"Yeni Thread sınıfından Merhaba : "+Thread.currentThread().getName());

    }
}
