package com.company;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stackYigini = new Stack<>();

        stackYigini.push(1);
        System.out.println("peek: "+ stackYigini.peek());
        stackYigini.push(2);
        stackYigini.push(3);
        System.out.println("peek: "+ stackYigini.peek());
        stackYigini.push(4);

        for (int i :stackYigini){


            System.out.println(i);
        }

        System.out.println(stackYigini.toString());

        Enumeration<Integer> e = stackYigini.elements();

        while (e.hasMoreElements()){
            System.out.println(e.nextElement());

        }

        System.out.println("Yığının son elemanı: "+stackYigini.peek());

        stackYigini.pop();
        System.out.println("Yığının son elemanı: "+stackYigini.peek());




        /*
        Vector<Integer> sayilar = new Vector<>();

        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);

        System.out.println("İlk eleman: "+sayilar.firstElement());
        System.out.println("Son eleman: "+sayilar.lastElement());


        for (int i : sayilar){
            System.out.println(i);
        }

        Enumeration<Integer> e= sayilar.elements();

        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        */

    }
}
