package com.company.Service;

import com.company.model.Lesson;
import com.company.model.Notes;
import com.company.model.Student;
import com.company.model.Teacher;

import java.util.List;

public interface Service {

    List<Lesson> getAllLesons();


    void ogrenciKaydet(Student student);
    void ogrenciSil(int studentID);
    void ogrenciGuncelleme(Student student);

    void ogretmenKaydet(Teacher teacher);
    void ogretmenSil(int ogretmenId);
    void ogretmenGuncelleme(Teacher teacher);

    void dersSec(int studentID , int ID);

    void ogretmenNotGirisi(int teacherID, Notes notes);
    List<Notes> ogretmenNotSorgulama(int studentID, int lessonID);

    void ogretmenKendiniGuncelleme(Teacher teacher);

    List<Notes> notlariGor(int studentID);

    boolean sorgulaOgrenci(int id, String sifre);
    boolean sorgulaOgretmen(int id, String sifre);


}
