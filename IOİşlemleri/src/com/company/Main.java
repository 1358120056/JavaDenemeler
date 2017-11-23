package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    //private static Map<Integer,Mekan> mekanlar = new HashMap<Integer, Mekan>();
    //private static Map<Integer,Mekan> mekanlar = new MekanlarBinary();

    private static Map<Integer,Mekan> mekanlar = new MekanlarObject();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String,String> sozluk = new HashMap<>();

        sozluk.put("ÇIKIŞ","Ç");
        sozluk.put("KUZEY","K");
        sozluk.put("GÜNEY","G");
        sozluk.put("DOĞU","D");
        sozluk.put("BATI","B");

        int gidilecekMekan = 1;
        boolean devamMi = true;
        System.out.println("Çıkmak için çıkış yazın.");
        while (devamMi){
            System.out.println(mekanlar.get(gidilecekMekan).getMekanTanimi());

            if(gidilecekMekan==0){
                break;
            }

            Map<String,Integer> cikislar = mekanlar.get(gidilecekMekan).getMekanCikisYollari();

            System.out.print("Gidilebilecek yönler: ");
            for(String cikis : cikislar.keySet()){
                System.out.print(cikis + ",");
            }

            String gidilecekYon = scanner.nextLine();

            gidilecekYon=gidilecekYon.toUpperCase();

            if(gidilecekYon.length()>1){
                String[] girilenCumle =gidilecekYon.split(" ");
                for(String kelime :girilenCumle){
                    if(sozluk.containsKey(kelime)){
                        gidilecekYon=sozluk.get(kelime);
                        break;
                    }
                }
            }
            if(cikislar.containsKey(gidilecekYon)){
                gidilecekMekan=cikislar.get(gidilecekYon);
            }
            else{
                System.err.println("O yöne gidemezsin.");
            }
        }
    }
}
