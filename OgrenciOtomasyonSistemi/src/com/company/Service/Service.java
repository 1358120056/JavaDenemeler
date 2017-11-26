package com.company.Service;

import com.company.model.Lesson;
import com.company.model.Student;

import java.util.List;

public interface Service {

    void dersSec(int studentID , int ID);
    List<Lesson> notlariGor(int studentID);
    void ogrenciKaydet(Student student);
    void ogreniSil(Student student);
    void ogrenciGuncelleme(Student student);

}
