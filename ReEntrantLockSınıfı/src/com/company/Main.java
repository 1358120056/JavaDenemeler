package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> buffer = new ArrayList<>();
        ReentrantLock bufferLock = new ReentrantLock();


        Uretici uretici = new Uretici(buffer,ThreadRenk.ANSI_MOR,bufferLock);
        Tuketici tuketici1 = new Tuketici(buffer,ThreadRenk.ANSI_MAVI,bufferLock);
        Tuketici tuketici2 = new Tuketici(buffer,ThreadRenk.ANSI_YESIL,bufferLock);

        new Thread(uretici).start();
        new Thread(tuketici1).start();
        new Thread(tuketici2).start();
    }
}
class Uretici implements Runnable{


    private ArrayList<String> buffer;
    private String renk;
    ReentrantLock bufferLock;

    public Uretici(ArrayList<String> buffer, String renk, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.renk = renk;
        this.bufferLock=bufferLock;
    }

    @Override
    public void run() {
        String[] numaralar ={"1","2","3","4","5"};
        Random random = new Random();

        for(String numara : numaralar){

            System.out.println(renk+numara+" ekleniyor...");

            /*
            synchronized (buffer){
                buffer.add(numara);
            }
            */

            bufferLock.lock();
            buffer.add(numara);
            bufferLock.unlock();

            try {
                Thread.sleep(random.nextInt(3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(renk+"EOF ekleniyor.");

        /*
        synchronized (buffer){
            buffer.add("EOF");
        }
        */
        bufferLock.lock();
        buffer.add("EOF");
        bufferLock.unlock();

    }
}

class Tuketici implements Runnable{

    private ArrayList<String> buffer;
    private String renk;
    ReentrantLock bufferLock;

    public Tuketici(ArrayList<String> buffer, String renk,ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.renk = renk;
        this.bufferLock=bufferLock;
    }

    @Override
    public void run() {

        int sayac = 0;

        while (true){

            /*
            synchronized (buffer){
                if(buffer.isEmpty()){

                    sayac++;
                    continue;
                }
                if(buffer.get(0).equals("EOF")){
                    System.out.println("Çıkış yapılıyor");
                    return;
                }else{
                    System.out.println(renk + buffer.remove(0)+ " kaldırılıyor." );
                }
            }
            */
            try {
                bufferLock.lock();

                if(buffer.isEmpty()){
                    sayac++;
                    continue;
                }
                if(buffer.get(0).equals("EOF")){
                    System.out.println("Çıkış yapılıyor");
                    return;
                }else{
                    System.out.println(renk + buffer.remove(0)+ " kaldırılıyor." );
                }
            }
            finally {
                bufferLock.unlock();
            }
        }
    }
}