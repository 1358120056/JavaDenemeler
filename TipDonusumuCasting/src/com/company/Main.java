package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int sayi1, sayi2, sayi3;
        String enBuyuk="", enKucuk="";
        Scanner veriAl=new Scanner(System.in);
        System.out.println("Birinci Sayiyi Giriniz:");
        sayi1=veriAl.nextInt();
        System.out.println("İkinci Sayiyi Giriniz:");
        sayi2=veriAl.nextInt();
        System.out.println("Üçüncü Sayiyi Giriniz:");
        sayi3=veriAl.nextInt();

        if(sayi1 < sayi2 && sayi1 < sayi3){
            enKucuk="Girilen sayıların en küçüğü sayı1:"+sayi1;
            if(sayi2<sayi3){
                enBuyuk="Girilen sayıların en büyüğü sayi3:"+sayi3;
            }else {
                enBuyuk="Girilen sayıların en büyüğü sayi2:"+sayi2;
            }
        }else if(sayi2 < sayi1 && sayi2 < sayi3){

            enKucuk="Girilen sayıların en küçüğü sayı2:"+sayi2;
            if(sayi1<sayi3){
                enBuyuk="Girilen sayıların en büyüğü sayi3:"+sayi3;
            }else {
                enBuyuk="Girilen sayıların en büyüğü sayi1:"+sayi1;

            }
        }else if(sayi3 < sayi1 && sayi3 < sayi2){

            enKucuk="Girilen sayıların en küçüğü sayı3:"+sayi3;
            if(sayi1 < sayi2){
                enBuyuk="Girilen sayıların en büyüğü sayi2:"+sayi2;
            }else {
                enBuyuk="Girilen sayıların en büyüğü sayi1:"+sayi1;
            }
        }
        System.out.println(enKucuk);
        System.out.println(enBuyuk);
    }
}
