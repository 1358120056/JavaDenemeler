package com.company;

public class Main3 {

    public static void main(String[] args) {

        try{
            Personel p1 = new Personel(36);
            System.out.println("P1'in yaşı: "+p1.getYas());


            Personel p2 = new Personel(-5);
            System.out.println("P2'nin yaşı :"+ p2.getYas());

            Personel p3 = new Personel(10);
            System.out.println("P3'in yaşı: "+p3.getYas());

        }catch (Exception istisna){
            System.out.println(istisna.getMessage());
            System.out.println(istisna.toString());
        }
        finally {
            Personel p4 = new Personel(30);
            System.out.println("P4'ün yaşı:"+p4.getYas());
        }

        System.out.println("Main bitti.");


    }
}
