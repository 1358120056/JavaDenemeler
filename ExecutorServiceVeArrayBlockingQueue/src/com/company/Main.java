package com.company;

import java.util.Random;
import java.util.concurrent.*;

public class Main {

        public static void main(String[] args) {

            ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<>(6);

            Uretici uretici = new Uretici(buffer,ThreadRenk.ANSI_MOR);
            Tuketici tuketici1 = new Tuketici(buffer,ThreadRenk.ANSI_MAVI);
            Tuketici tuketici2 = new Tuketici(buffer,ThreadRenk.ANSI_YESIL);

            ExecutorService executorService = Executors.newFixedThreadPool(4);

            executorService.execute(uretici);
            executorService.execute(tuketici1);
            executorService.execute(tuketici2);

            executorService.shutdown();
        }
    }
    class Uretici implements Runnable{

        private ArrayBlockingQueue<String> buffer;
        private String renk;

        public Uretici(ArrayBlockingQueue<String> buffer, String renk) {
            this.buffer = buffer;
            this.renk = renk;
        }
        @Override
        public void run() {
            String[] numaralar ={"1","2","3","4","5"};
            Random random = new Random();

            for(String numara : numaralar){

                System.out.println(renk+numara+" ekleniyor...");

                try {
                    buffer.put(numara);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(random.nextInt(3000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(renk+"EOF ekleniyor.");
            buffer.add("EOF");
        }
    }

    class Tuketici implements Runnable{

        private ArrayBlockingQueue<String> buffer;
        private String renk;

        public Tuketici(ArrayBlockingQueue<String> buffer, String renk) {
            this.buffer = buffer;
            this.renk = renk;
        }

        @Override
        public void run() {

            while (true){

                synchronized (buffer){

                    try {
                        if(buffer.isEmpty()){
                            continue;
                        }
                        if(buffer.peek().equals("EOF")){
                            System.out.println("Çıkış yapılıyor");
                            return;
                        }else{
                            System.out.println(renk + buffer.take()+ " kaldırılıyor." );
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }