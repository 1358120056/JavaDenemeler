package com.company;

import com.company.Service.Service;
import com.company.Service.ServiceImpl;
import com.company.model.Lesson;
import com.company.model.Notes;
import com.company.model.Student;
import com.company.model.Teacher;

import java.util.List;
import java.util.Scanner;

public class Main {

    static Service service = new ServiceImpl();
    static Scanner tara = new Scanner(System.in);

    public static void main(String[] args) {
        //menuGoster();

        Service service = new ServiceImpl();
        Student student = new Student();
        Teacher teacher = new Teacher();

        Notes notes1 = new Notes();

        notes1.setNote1(10);
        notes1.setNote2(100);
        notes1.setLessonID(2);
        notes1.setStudentID(12);

        //List<Notes> liste=service.notlariGor(12);
        //System.out.println(liste.get(0).getStudentID()+"-"+liste.get(0).getLessonName()+"-"+liste.get(0).getNote1());


        //service.ogretmenNotGirisi(10,notes1);


        /*List<Lesson> ders_liste=service.getAllLesons();

        for(Lesson l : ders_liste){
            System.out.println(l.getLessonName());
        }
        */

        teacher.setTeacherID(5);
        teacher.setName("recep");
        teacher.setSurname("tayyip");
        teacher.setPassword("123456789");

        service.ogretmenKendiniGuncelleme(teacher);




        //List<Notes> liste=service.ogretmenNotSorgulama(12,1);
        //System.out.println(liste.get(0).getStudentID()+"- "+liste.get(0).getNote1()+"- "+liste.get(0).getNote2());

        /*

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
                " 2- Öğrenci İşlemleri\n " +
                "3-Çıkış");

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

                case 3:
                    System.out.println("Çıkış yapılıyor...");
                    cikis = true;
                    break;

                default:
                    System.out.println("Lütfen 1-3 arası değer giriniz.");
                    break;
            }
        }
    }

    private static void ogrenciGiris() {

        boolean giris = false;

        while (!giris){

            System.out.println("ID'nizi giriniz.");
            int ogrenciID = tara.nextInt();
            System.out.println("şifrenizi giriniz.");
            String sifre = tara.next();

            boolean a = service.sorgulaOgrenci(ogrenciID, sifre);

            if(a==true){
                giris = true;
                System.out.println("Öğrenci girişi başarılı");
            }
            else {
                System.out.println("hatalı giriş. Tekrar deneyiniz...");
            }
        }
    }
    private static void ogretmenGiris() {

        boolean giris = false;

        while (!giris){

            System.out.println("ID'nizi giriniz.");
            int ogretmenID = tara.nextInt();
            System.out.println("şifrenizi giriniz.");
            String sifre = tara.next();

            boolean a =service.sorgulaOgretmen(ogretmenID, sifre);

            if(a==true){
                System.out.println("Öğretmen girişi başarılı");
            }
            else {
                System.out.println("hatalı giriş.Tekrar deneyiniz...");
            }
        }
    }
}
