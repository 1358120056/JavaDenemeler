package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner bilinmeyenler = new Scanner(System.in);

        float x,y,sonuc;

        System.out.println("X değerini giriniz.");

        x = bilinmeyenler.nextFloat();

        System.out.println("Y değerini giriniz.");

        y = bilinmeyenler.nextFloat();

        if(x>0 && y<0){

            sonuc = 4*x +2*y+ 4;
            System.out.println(sonuc);

        }

        else if(x>0 && y ==0){

            sonuc = 2*x-y+3;
            System.out.println(sonuc);

        }

        else if(x<0 && y>0){

            sonuc= 3*x + 4*y + 3;
            System.out.println(sonuc);

        }
        else
            System.out.println("uygun değerler girmediniz.");
    }
}
