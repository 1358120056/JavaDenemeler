package com.company;

import java.io.*;
import java.util.*;

public class MekanlarObject implements Map<Integer,Mekan> {

    private static Map<Integer,Mekan> mekanlar = new HashMap<Integer, Mekan>();

    public static void main(String[] args) throws IOException {

        /*

        try(ObjectOutputStream mekanObjectDosya = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("MekanObjectDosya.dat")))){
            for(Mekan mekan : mekanlar.values()){
                mekanObjectDosya.writeObject(mekan);

            }
        }*/

    }

    static{

        try(ObjectInputStream mekanObjectDosya = new ObjectInputStream(new BufferedInputStream(new FileInputStream("MekanObjectDosya.dat")))) {

            boolean eof=false;

            while (!eof){
                try {

                    Mekan mekan = (Mekan)mekanObjectDosya.readObject();

                    System.out.println("Okunan Mekan="+mekan.getMekanId()+":"+mekan.getMekanTanimi());
                    System.out.println("Bulunan çıkış sayısı:" + mekan.getMekanCikisYollari().size());
                    mekanlar.put(mekan.getMekanId(),mekan);

                }
                catch (EOFException e){
                    eof=true;
                }


            }


        }catch (IOException e ){
            System.out.println("IOException :"+ e.getMessage());
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

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