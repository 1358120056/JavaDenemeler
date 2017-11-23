package com.company;

public class IcIceSiniflar {

    private class StringDiziYaz{

        protected class IntegerDiziYaz{

            protected void IntegerDiziYazdir(int[] nesne){

                for(int gecici : nesne){
                    System.out.println(gecici +" ");
                }

                String[] dizi2 = {"selam"};
                StringDiziYazdir(dizi2);


            }
        }

        private void StringDiziYazdir(String[] dizi){

            for(String gecici : dizi){
                System.out.println(gecici +" ");
            }
        }

    }

    public static void main(String[] args) {

        int[] sayilar = {1,2,3,4,5};

        IcIceSiniflar.StringDiziYaz.IntegerDiziYaz nesne = new IcIceSiniflar().new StringDiziYaz().new IntegerDiziYaz();

        nesne.IntegerDiziYazdir(sayilar);

    }


}

