package com.company;

public class Main {

    public static void main(String[] args) {

        String[] stringDizi = {"ahmet","mert","yavuz"};
        Integer[] intDizi = {1,2,3};

        DiziYazdir<String> s2 = new DiziYazdir<String>();
        s2.yazdir(stringDizi);


        DiziYazdir<Integer> s3 = new DiziYazdir<Integer>();
        s3.yazdir(intDizi);






    }
}
