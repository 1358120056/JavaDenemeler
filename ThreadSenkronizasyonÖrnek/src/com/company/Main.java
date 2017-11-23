package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> buffer = new ArrayList<>();


        Uretici uretici = new Uretici(buffer,ThreadRenk.ANSI_MOR);
        Tuketici tuketici1 = new Tuketici(buffer,ThreadRenk.ANSI_MAVI);
        Tuketici tuketici2 = new Tuketici(buffer,ThreadRenk.ANSI_YESIL);

        new Thread(uretici).start();
        new Thread(tuketici1).start();
        new Thread(tuketici2).start();

    }
}

class Uretici implements Runnable{


    private ArrayList<String> buffer;
    private String renk;

    public Uretici(ArrayList<String> buffer, String renk) {
        this.buffer = buffer;
        this.renk = renk;
    }

    @Override
    public void run() {
        String[] numaralar ={"1","2","3","4","5"};
        Random random = new Random();

        for(String numara : numaralar){

            System.out.println(renk+numara+" ekleniyor...");

            synchronized (buffer){
                buffer.add(numara);
            }

            try {
                Thread.sleep(random.nextInt(3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(renk+"EOF ekleniyor.");

        synchronized (buffer){
            buffer.add("EOF");
        }
    }
}

class Tuketici implements Runnable{

    private ArrayList<String> buffer;
    private String renk;

    public Tuketici(ArrayList<String> buffer, String renk) {
        this.buffer = buffer;
        this.renk = renk;
    }

    @Override
    public void run() {

        int sayac = 0;

        while (true){

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
            System.out.println(sayac);
        }
    }
}

