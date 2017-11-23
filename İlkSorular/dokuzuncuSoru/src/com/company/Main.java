package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int not ;

        Scanner girdi = new Scanner(System.in);

        System.out.println("Notunuzu Giriniz");

        not = girdi.nextInt();

        if(not>=90){
            System.out.println("AA");
        }
        else if (not<90 && not>=80){

            System.out.println("BA");
        }
        else if (not<80 && not>=70){

            System.out.println("BB");
        }
        else if (not<70 && not>=60){

            System.out.println("CB");
        }
        else if (not<60 && not>=40){

            System.out.println("CC");
        }
        else if (not<40 && not>=30){

            System.out.println("DC");
        }
        else if (not<30 && not>=10){

            System.out.println("DD");
        }
        else{
            System.out.println("FF");
        }
    }
}
