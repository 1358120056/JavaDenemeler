package com.company.Service;

import com.company.model.Lesson;
import com.company.model.Student;

import java.sql.*;
import java.util.List;

public class ServiceImpl implements Service {


    @Override
    public void dersSec(int studentID, int ID) {

    }

    @Override
    public List<Lesson> notlariGor(int studentID) {
        return null;
    }

    @Override
    public void ogrenciKaydet(Student student) {
        Connection connect=openSqlConnection();
        try {
            PreparedStatement statement = connect.prepareStatement("INSERT INTO STUDENT (STUDENT_ID,NAME,SURNAME,PASSWORD)" +
                    " VALUES(?,?,?,?)");
            statement.setInt(1,student.getStudentID());
            statement.setString(2,student.getName());
            statement.setString(3,student.getSurname());
            statement.setString(4,student.getPassword());
            statement.execute();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Öğrenci kayıt edilemedi");
        }
    }

    @Override
    public void ogreniSil(int studentID) {

        Connection connect=openSqlConnection();
        try {
            PreparedStatement statement = connect.prepareStatement("DELETE FROM STUDENT " +
                    "WHERE  STUDENT_ID  =  (?) ");
            statement.setInt(1,studentID);
            statement.execute();
            statement = connect.prepareStatement("DELETE FROM ALINAN_DERS " +
                    "WHERE  STUDENT_ID  =  (?) ");
            statement.setInt(1,studentID);
            statement.execute();
            connect.close();
        } catch (SQLException e) {
            System.out.println(studentID +" nolu öğrenci silinemedi.");
        }
    }
    @Override
    public void ogrenciGuncelleme(Student student) {

    }

    private Connection openSqlConnection() {
        Connection connect;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/OKUL_OTOMASYONU?user=root&password=12345678");
            return connect;
        } catch (Exception e) {
            System.out.println("Veritabanına bağlanılamadı.");
        }
     return null;
    }
}
