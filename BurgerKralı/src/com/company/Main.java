package com.company;

public class Main {
    public static void main(String[] args) {

        Hamburger h1 = new Hamburger("bigmac","kepekli","double",3);
        h1.ekleİlaveUrun1("patates",2);
        h1.ekleİlaveUrun2("soğan halkası",3);
        h1.ekleİlaveUrun3("dondurma",4);
        h1.ekleİlaveUrun4("oyuncak",5);

        System.out.println(h1.hamburgerBilgileri());
        System.out.println("************************************");

        saglikliBurger sg1 = new saglikliBurger("Beyaz Et",2);
        sg1.ekleİlaveUrun1("patates",2);
        sg1.ekleİlaveUrun2("soğan halkası",3);
        sg1.ekleİlaveUrun3("dondurma",4);
        sg1.ekleİlaveUrun4("oyuncak",5);
        sg1.ekleSağlikliUrun1("sos",5);
        sg1.ekleSağlikliUrun2("domates",1);
        System.out.println(sg1.hamburgerBilgileri());

        System.out.println("************************************");

        BabaBurger bb1 = new BabaBurger();
        System.out.println(bb1.hamburgerBilgileri());
    }
}



