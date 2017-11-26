package com.company.Service;

import com.company.model.Lesson;
import com.company.model.Student;
import com.company.model.Teacher;

import java.util.List;

public interface Service {

    List<Lesson> getAllLesons();
    void dersSec(int studentID , int ID);
    List<Lesson> notlariGor(int studentID);
    void ogrenciKaydet(Student student);
    void ogreniSil(int studentID);
    void ogrenciGuncelleme(Student student);
    void ogretmenKaydet(Teacher teacher);
    void ogremenSil(int ogretmenId);
    void ogretmenGuncelleme(Teacher teacher);


}
