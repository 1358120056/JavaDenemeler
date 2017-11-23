package com.company;

public class DahiliYerelSinif {

    public static void main(String[] args) {


        String[] isimler = {"ahmet","mert","yavuz"};

        class StringDiziYaz{

            void stringDiziYazdir(String[] isimler){

                for(String gecici: isimler){
                    System.out.println(gecici);
                }
            }
        }

        StringDiziYaz nesne = new StringDiziYaz();
        nesne.stringDiziYazdir(isimler);
    }

    public void main2(){

        String[] isimler = {"ahmet","mert","yavuz"};

        class StringDiziYaz2{

            void stringDiziYazdir(String[] isimler){

                for(String gecici: isimler){
                    System.out.println(gecici);
                }
            }
        }





    }


}
