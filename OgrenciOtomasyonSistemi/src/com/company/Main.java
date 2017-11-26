package com.company;

import com.company.Service.Service;
import com.company.Service.ServiceImpl;
import com.company.model.Student;

import java.util.Scanner;

public class Main {

    static Service service = new ServiceImpl();
    static Scanner tara = new Scanner(System.in);

    public static void main(String[] args) {
        menuGoster();

        /*
        Service service = new ServiceImpl();
        Student student = new Student();
        student.setStudentID(12);
        student.setName("Ahmet");
        student.setSurname("Yavuz");
        student.setPassword("123");
        service.ogrenciKaydet(student);

        service.ogreniSil(15);
        */
    }

    private static void menuGoster() {

        System.out.println("Yapmak istediğiniz işlemi seçiniz:\n " +
                "1- Öğretim Üyesi İşlemleri\n" +
                " 2- Öğrenci İşlemleri ");

        boolean cikis = false;
        while (!cikis) {
            int secim = tara.nextInt();
            switch (secim) {

                case 1:
                    cikis = true;
                    ogretmenGiris();
                    break;

                case 2:
                    cikis = true;
                    ogrenciGiris();
                    break;

                default:
                    System.out.println("Lütfen düzgün seçim yapın");
                    break;
            }
        }
    }

    private static void ogrenciGiris() {

        System.out.println("ID'nizi giriniz.");
        int ogrenciID = tara.nextInt();
        System.out.println("şifrenizi giriniz.");
        String sifre = tara.next();

        boolean a = service.sorgulaOgrenci(ogrenciID, sifre);

        if(a==true){
            System.out.println("giriş başarılı");
        }
        else {
            System.out.println("hatalı giriş");
        }
    }

    private static void ogretmenGiris() {

        System.out.println("ID'nizi giriniz.");
        int ogretmenID = tara.nextInt();
        System.out.println("şifrenizi giriniz.");
        String sifre = tara.next();

        boolean a =service.sorgulaOgretmen(ogretmenID, sifre);


        if(a==true){
            System.out.println("giriş başarılı");
        }
        else {
            System.out.println("hatalı giriş");
        }


    }
}
