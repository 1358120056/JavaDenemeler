package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer,Mekan> mekanlar = new HashMap<Integer, Mekan>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> geciciCikis = new HashMap<>();

        mekanlar.put(0,new Mekan(0,"Yolun başındasın",null));


        geciciCikis.put("B",2);
        geciciCikis.put("D",3);
        geciciCikis.put("K",5);
        geciciCikis.put("G",4);
        mekanlar.put(1,new Mekan(1,"Bir yolun başındasın",geciciCikis));

        geciciCikis=new HashMap<>();
        geciciCikis.put("K",5);
        mekanlar.put(2, new Mekan(2, "Bir tepenin başındasın",geciciCikis));

        geciciCikis=new HashMap<>();
        geciciCikis.put("B",1);
        mekanlar.put(3, new Mekan(3, "Bir tepenin başındasın",geciciCikis));

        geciciCikis=new HashMap<>();
        geciciCikis.put("K",1);
        geciciCikis.put("B",2);
        mekanlar.put(4, new Mekan(4, "Bir tepenin başındasın",geciciCikis));

        geciciCikis=new HashMap<>();
        geciciCikis.put("G",1);
        geciciCikis.put("B",2);
        mekanlar.put(5, new Mekan(5, "Balta girmemiş bir ormandasın",geciciCikis));


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
