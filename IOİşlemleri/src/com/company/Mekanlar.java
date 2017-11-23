package com.company;

import java.io.*;
import java.util.*;

public class Mekanlar implements Map<Integer,Mekan> {

    private static Map<Integer,Mekan> mekanlar = new HashMap<Integer, Mekan>();

    public static void main(String[] args) throws IOException {

        /*

        try(BufferedWriter mekanlarDosyasi = new BufferedWriter(new FileWriter("mekanlar.txt"));
            BufferedWriter yonlerDosyasi = new BufferedWriter(new FileWriter("työnler.txt"))) {
            for(Mekan dosyayaYazilacakMekan:mekanlar.values()){
                mekanlarDosyasi.write(dosyayaYazilacakMekan.getMekanId()+" - "+dosyayaYazilacakMekan.getMekanTanimi() +"\n");
                for (String yon : dosyayaYazilacakMekan.getMekanCikisYollari().keySet()){
                    yonlerDosyasi.write(dosyayaYazilacakMekan.getMekanId()+","+ yon + "," + dosyayaYazilacakMekan.getMekanCikisYollari().get(yon) +"\n" );
                }
            }
        }

        FileWriter mekanlarDosyasi = null;
        try {
            mekanlarDosyasi = new FileWriter("mekanlar.txt");
            for(Mekan dosyayaYaziaacakMekan:mekanlar.values()){
                mekanlarDosyasi.write(dosyayaYaziaacakMekan.getMekanId()+" - "+dosyayaYaziaacakMekan.getMekanTanimi() +"\n");
            }
        }finally {
                if(mekanlarDosyasi!=null){
                    System.out.println("Dosya kapatılıyor.");
                    mekanlarDosyasi.close();
                }
        }
    */
    }

    static{

        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("mekanlar.txt")))) {
            while (scanner.hasNextLine()){
                int mekanId = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String mekanTanim = scanner.nextLine();
                System.out.println("dosyadan okunan mekan: "+mekanId + " - "+ mekanTanim);

                Map<String, Integer> geciciCikis = new HashMap<>();
                mekanlar.put(mekanId,new Mekan(mekanId,mekanTanim,geciciCikis));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        /*
        try{
            scanner = new Scanner(new FileReader("mekanlar.txt"));
            scanner.useDelimiter(" - ");
            while (scanner.hasNextLine()){
                int mekanId = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String mekanTanim = scanner.nextLine();
                System.out.println("dosyadan okunan mekan: "+mekanId + " - "+ mekanTanim);


                Map<String, Integer> geciciCikis = new HashMap<>();
                mekanlar.put(mekanId,new Mekan(mekanId,mekanTanim,geciciCikis));
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(scanner!=null){
                scanner.close();
            }

        }
        */

        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("yönler.txt")))) {
            while (scanner.hasNextLine()){
                System.out.println("********************");
                while (scanner.hasNextLine()){
                    String tumSatir = scanner.nextLine();

                    String[] satirelemanlari = tumSatir.split(",");

                    int mekanId = Integer.parseInt(satirelemanlari[0]);
                    String yon = satirelemanlari[1];
                    int gidilecekMekan = Integer.parseInt(satirelemanlari[2]);

                    System.out.println(mekanId + ": " + yon + ": "+ gidilecekMekan );
                    Mekan mekan = mekanlar.get(mekanId);
                    mekan.cikisYoluEKle(yon,gidilecekMekan);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        /*
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("yönler.txt")));
            System.out.println("********************");
            while (scanner.hasNextLine()){
                String tumSatir = scanner.nextLine();

                String[] satirelemanlari = tumSatir.split(",");

                int mekanId = Integer.parseInt(satirelemanlari[0]);
                String yon = satirelemanlari[1];
                int gidilecekMekan = Integer.parseInt(satirelemanlari[2]);

                System.out.println(mekanId + ": " + yon + ": "+ gidilecekMekan );
                Mekan mekan = mekanlar.get(mekanId);
                mekan.cikisYoluEKle(yon,gidilecekMekan);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(scanner!=null){
                scanner.close();
            }
        }
        */

        /*
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

        */

    }

    @Override
    public int size() {
        return mekanlar.size();
    }

    @Override
    public boolean isEmpty() {
        return mekanlar.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return mekanlar.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return mekanlar.containsValue(value);
    }

    @Override
    public Mekan get(Object key) {
        return mekanlar.get(key);
    }

    @Override
    public Mekan put(Integer key, Mekan value) {
        return mekanlar.put(key, value);
    }

    @Override
    public Mekan remove(Object key) {
        return mekanlar.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Mekan> m) {

    }

    @Override
    public void clear() {
        mekanlar.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return mekanlar.keySet();
    }

    @Override
    public Collection<Mekan> values() {
        return mekanlar.values();
    }

    @Override
    public Set<Entry<Integer, Mekan>> entrySet() {
        return mekanlar.entrySet();
    }
}