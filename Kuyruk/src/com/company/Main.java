package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> sayilar = new LinkedList<>();

        //poll boş dizi döndürür.
        //remove hata fırlatır.

        sayilar.add(1);
        sayilar.offer(5);

        sayilar.add(4);
        sayilar.offer(2);

        System.out.println(sayilar);

        sayilar.remove();
        System.out.println(sayilar);

        sayilar.remove();
        System.out.println(sayilar);

        sayilar.remove();
        System.out.println(sayilar);

        sayilar.remove();
        System.out.println(sayilar);


        sayilar.add(1);
        System.out.println(sayilar);
        System.out.println("peek:"+sayilar.peek());
        sayilar.offer(5);
        System.out.println(sayilar);
        System.out.println("element:"+sayilar.element());
        sayilar.add(4);
        System.out.println(sayilar);
        System.out.println("peek2:"+sayilar.peek());
        sayilar.offer(2);
        System.out.println(sayilar);
        System.out.println("element2:"+sayilar.element());

    }
}
