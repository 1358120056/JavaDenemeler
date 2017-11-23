package com.company;

public class Main {

    public static void main(String[] args) {


        int i,j;

        for(i=1;i<=100;i++){

            if (i==101)

                break;

            System.out.println("i= "+i);

        }

        for(j=100;i>=1;j--){

            if(j==0)

                break;

            System.out.println("j= "+j);

        }
    }
}
