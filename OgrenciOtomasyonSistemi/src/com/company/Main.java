package com.company;

import com.company.Service.Service;
import com.company.Service.ServiceImpl;
import com.company.model.Student;

public class Main {

    public static void main(String[] args) {
        Service service = new ServiceImpl();
        Student student = new Student();
        student.setStudentID(12);
        student.setName("Ahmet");
        student.setSurname("Yavuz");
        student.setPassword("123");
        service.ogrenciKaydet(student);

    }
}
