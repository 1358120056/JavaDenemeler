package com.company;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {



        /*
        String kelimeler = "Ahmet Mert Yavuz merhaba dünya selam";
        new Thread(()->{
            for(String kelime : kelimeler.split(" ")){
                System.out.println(kelime);
            }
        }).start();
        *
        *
        *
        */


        Function<String,String> function1 = new Function<String, String>() {
            @Override
            public String apply(String s) {
                StringBuilder stringBuilder = new StringBuilder();
                for(int i=0;i<s.length();i++){
                    if(i%2==0){
                        stringBuilder.append(s.charAt(i));
                    }
                }
                return stringBuilder.toString();
            }
        };
        Function<String ,String > function2 = (String s) -> {

            StringBuilder stringBuilder = new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(i%2==0){
                    stringBuilder.append(s.charAt(i));
                }
            }
            System.out.println("içeride: "+stringBuilder.toString());
            return stringBuilder.toString();
        };

        System.out.println(function1.apply("Ahmet Mert Yavuz"));
        System.out.println(function2.apply("merhaba dünya selam"));


        System.out.println(ciftPozisyondakiKarakterleriDondur(function2,"yeni metod ile gerçekleştirdik."));

    }

    public static String ciftPozisyondakiKarakterleriDondur(Function<String,String> fun, String kaynak ){

        return fun.apply(kaynak);

    }
}
