package com.company;

public class AlanlaraErisim {


    private String[] cerceveSiniftakiDizi = {"a","b","c"};

    public static void main(String[] args) {

        String[] stringDizi = {"ahmet","mert","yavuz"};
        int[] intDizi = {1,2,3};

        AlanlaraErisim.StringDiziYaz stringSinifNesnesi = new AlanlaraErisim().new StringDiziYaz();
        stringSinifNesnesi.StringDiziYazdir(stringDizi);

        AlanlaraErisim.IntegerDiziYaz IntegerSinifNesnesi = new AlanlaraErisim().new IntegerDiziYaz();
        IntegerSinifNesnesi.IntegerDiziYazdir(intDizi);

    }
    private class StringDiziYaz{

        private void StringDiziYazdir(String[] dizi){

            System.out.println(cerceveSiniftakiDizi.length);

            for(String gecici : dizi){
                System.out.println(gecici +" ");
            }
        }
    }
    protected class IntegerDiziYaz{

        protected void IntegerDiziYazdir(int[] nesne){

            for(int gecici : nesne){
                System.out.println(gecici +" ");
            }
        }
    }

}
