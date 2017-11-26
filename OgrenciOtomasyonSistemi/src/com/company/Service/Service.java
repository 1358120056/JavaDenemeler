package com.company.Service;

import com.company.model.Lesson;
import com.company.model.Student;
import com.company.model.Teacher;

import java.util.List;

public interface Service {

    List<Lesson> getAllLesons();


    void ogrenciKaydet(Student student);
    void ogreniSil(int studentID);
    void ogrenciGuncelleme(Student student);

    void ogretmenKaydet(Teacher teacher);
    void ogretmenSil(int ogretmenId);
    void ogretmenGuncelleme(Teacher teacher);

    void dersSec(int studentID , int ID);

    void ogretmenNotGirisi(int teacherID, Lesson ders);
    void ogretmenNotSorgulama(int studentID);

    void ogretmenKendiniGuncelleme(Teacher teacher);

    List<Lesson> notlariGor(int studentID);

    boolean sorgulaOgrenci(int id, String sifre);
    boolean sorgulaOgretmen(int id, String sifre);


}
