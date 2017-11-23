package com.company;

import java.util.HashMap;
import java.util.Map;

public class Mekan {


    private final int mekanId;
    private final String mekanTanimi;
    private final Map<String, Integer> mekanCikisYollari;
    public Mekan(int mekanId,String mekanTanimi, Map<String,Integer>cikislar) {
        this.mekanId=mekanId;
        this.mekanTanimi=mekanTanimi;

        if(cikislar!=null){
            mekanCikisYollari = new HashMap<>(cikislar);
        }
        else {
            mekanCikisYollari = new HashMap<>();
        }
        mekanCikisYollari.put("Ç",0);
    }
    /*
    public void cikisYoluEKle(String yon, int mekanId){
        mekanCikisYollari.put(yon,mekanId);
    }
    */
    public int getMekanId() {
        return mekanId;
    }
    public String getMekanTanimi() {
        return mekanTanimi;
    }

    public Map<String, Integer> getMekanCikisYollari() {
        return new HashMap<String, Integer>(mekanCikisYollari);
    }
}
