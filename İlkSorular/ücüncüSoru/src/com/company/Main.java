package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        float vize,final1,gecmeNotu;



        Scanner notlar = new Scanner(System.in);

        System.out.println("Vize notunu giriniz:");

        vize = notlar.nextInt();

        System.out.println("Final notunu giriniz:");

        final1 = notlar.nextInt();

        gecmeNotu = ((vize*4)/10) + ((final1*6)/10);

        if(gecmeNotu>= 50){

            System.out.println("Geçtiniz");

        }

        else {

            System.out.println("Kaldınız");

        }


    }
}
