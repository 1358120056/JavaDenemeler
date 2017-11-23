package com.company;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MekanlarRAF implements Map<Integer,Mekan> {

    private static Map<Integer,Mekan> mekanlar = new HashMap<Integer, Mekan>();
    private static Map<Integer,IndexDeger> index = new HashMap<>();
    private static RandomAccessFile ra;

    public static void main(String[] args) throws IOException {





        /*

        try(RandomAccessFile raf = new RandomAccessFile("mekanlarRAF.dat","rw")) {

            raf.write(mekanlar.size());

            int indexBoyutu = mekanlar.size() * 3 * Integer.BYTES;
            int mekanBilgilerininBaslangicNoktasi=(int) (indexBoyutu +raf.getFilePointer()+Integer.BYTES);


            raf.writeInt(mekanBilgilerininBaslangicNoktasi);

            long indexBilgilerininBaslangicNoktasi = raf.getFilePointer();


            int baslangicAdresi = mekanBilgilerininBaslangicNoktasi;

            raf.seek(baslangicAdresi);


            for(Mekan mekan: mekanlar.values()){

                raf.writeInt(mekan.getMekanId());

                raf.writeUTF(mekan.getMekanTanimi());

                StringBuilder builder = new StringBuilder();

                for(String gidilecekYon : mekan.getMekanCikisYollari().keySet()){

                    builder.append(gidilecekYon);
                    builder.append(",");
                    builder.append(mekan.getMekanCikisYollari().get(gidilecekYon));
                    builder.append(",");

                }

                raf.writeUTF(builder.toString());
                IndexDeger deger = new IndexDeger(baslangicAdresi,(int)(raf.getFilePointer()-baslangicAdresi));
                index.put(mekan.getMekanId(),deger);

                baslangicAdresi = (int) raf.getFilePointer();

            }

            raf.seek(indexBilgilerininBaslangicNoktasi);

            for(Integer mekanId : index.keySet()){

                raf.writeInt(mekanId);
                raf.writeInt(index.get(mekanId).getBaslangicAdresi());
                raf.writeInt(index.get(mekanId).getUzunluk());


            }
        }
        */
    }
    static{




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