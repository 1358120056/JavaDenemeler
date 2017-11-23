package com.company;

import java.io.*;
import java.util.*;

public class MekanlarBinary implements Map<Integer,Mekan> {

    private static Map<Integer,Mekan> mekanlar = new HashMap<Integer, Mekan>();

    public static void main(String[] args) throws IOException {


        try(DataOutputStream mekanStreamDosya = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("MekanStrean.dat")))) {

            for(Mekan mekan : mekanlar.values() ){

                mekanStreamDosya.writeInt(mekan.getMekanId());
                mekanStreamDosya.writeUTF(mekan.getMekanTanimi());


                System.out.println("Yazılan mekanId:"+mekan.getMekanId()+" - Tanımı:"+ mekan.getMekanTanimi());
                System.out.println("Mekandaki toplam çıkışlar"+(mekan.getMekanCikisYollari().size()-1));
                mekanStreamDosya.writeInt(mekan.getMekanCikisYollari().size()-1);


                for (String cikisYon : mekan.getMekanCikisYollari().keySet()) {
                    if(!cikisYon.equalsIgnoreCase("Ç")){
                        System.out.println("\t\t" +cikisYon+","+ mekan.getMekanCikisYollari().get(cikisYon));
                        mekanStreamDosya.writeUTF(cikisYon);
                        mekanStreamDosya.writeInt(mekan.getMekanCikisYollari().get(cikisYon));
                    }
                }
            }
        }
    }
    static{


        try(DataInputStream mekanStreamDosya = new DataInputStream(new BufferedInputStream(new FileInputStream("MekanStrean.dat")))) {


            boolean eof = false;



            while (!eof){

                try {
                    Map<String,Integer> cikislar = new HashMap<>();
                    int mekanId = mekanStreamDosya.readInt();
                    String  mekanTanim = mekanStreamDosya.readUTF();
                    int cikisSayilari = mekanStreamDosya.readInt();

                    for(int i =0; i<cikisSayilari;i++){

                        String gidilecekYon = mekanStreamDosya.readUTF();
                        int gidilecekMekanId= mekanStreamDosya.readInt();
                        cikislar.put(gidilecekYon,gidilecekMekanId);
                    }
                    mekanlar.put(mekanId,new Mekan(mekanId,mekanTanim,cikislar));
                }catch (EOFException e){
                    eof=true;
                }
            }
        }catch (IOException e ){
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