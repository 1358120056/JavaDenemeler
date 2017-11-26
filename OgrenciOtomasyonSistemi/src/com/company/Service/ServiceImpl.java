package com.company.Service;

import com.company.model.Lesson;
import com.company.model.Student;
import com.company.model.Teacher;

import java.sql.*;
import java.util.List;

public class ServiceImpl implements Service {

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

    @Override
    public void ogrenciKaydet(Student student) {
        Connection connect = openSqlConnection();
        try {
            PreparedStatement statement = connect.prepareStatement("INSERT INTO STUDENT (STUDENT_ID,NAME,SURNAME,PASSWORD)" +
                    " VALUES(?,?,?,?)");
            statement.setInt(1, student.getStudentID());
            statement.setString(2, student.getName());
            statement.setString(3, student.getSurname());
            statement.setString(4, student.getPassword());
            statement.execute();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Öğrenci kayıt edilemedi");
        }
    }

    @Override
    public void ogreniSil(int studentID) {

        Connection connect = openSqlConnection();
        try {
            PreparedStatement statement = connect.prepareStatement("DELETE FROM STUDENT " +
                    "WHERE  STUDENT_ID  =  (?) ");
            statement.setInt(1, studentID);
            statement.execute();
            statement = connect.prepareStatement("DELETE FROM ALINAN_DERS " +
                    "WHERE  STUDENT_ID  =  (?) ");
            statement.setInt(1, studentID);
            statement.execute();
            connect.close();
        } catch (SQLException e) {
            System.out.println(studentID + " nolu öğrenci silinemedi.");
        }
    }


    @Override
    public void dersSec(int studentID, int ID) {

    }

    @Override
    public void ogretmenNotGirisi(int teacherID, Lesson ders) {

    }

    @Override
    public void ogretmenNotSorgulama(int studentID) {

    }

    @Override
    public void ogretmenKendiniGuncelleme(Teacher teacher) {

    }

    @Override
    public List<Lesson> notlariGor(int studentID) {
        return null;
    }

    @Override
    public boolean sorgulaOgrenci(int id, String sifre) {

        Connection connect = openSqlConnection();
        boolean a = false;
        try {
            PreparedStatement statement = connect.prepareStatement("SELECT * FROM STUDENT WHERE STUDENT_ID = ? AND PASSWORD = ? ");
            statement.setInt(1, id);
            statement.setString(2, sifre);

            ResultSet set = statement.executeQuery();
            a = set.next();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Giriş başarısız.");
        }
        return a;
    }

    @Override
    public boolean sorgulaOgretmen(int id, String sifre) {
        Connection connect = openSqlConnection();
        boolean a = false;
        try {
            PreparedStatement statement = connect.prepareStatement("SELECT * FROM TEACHER WHERE TEACHER = ? AND PASSWORD = ? ");
            statement.setInt(1, id);
            statement.setString(2, sifre);

            ResultSet set = statement.executeQuery();
            a = set.next();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Giriş başarısız.");
        }
        return a;
    }

    @Override
    public List<Lesson> getAllLesons() {
        return null;
    }


    @Override
    public void ogrenciGuncelleme(Student student) {

    }

    @Override
    public void ogretmenKaydet(Teacher teacher) {

        Connection connect = openSqlConnection();
        try {
            PreparedStatement statement = connect.prepareStatement("INSERT INTO TEACHER (TEACHER_ID,NAME,SURNAME,PASSWORD)" +
                    " VALUES(?,?,?,?)");
            statement.setInt(1, teacher.getTeacherID());
            statement.setString(2, teacher.getName());
            statement.setString(3, teacher.getSurname());
            statement.setString(4, teacher.getPassword());
            statement.execute();
            connect.close();
        } catch (SQLException e) {
            System.out.println("Hoca kayıt edilemedi");
        }
    }

    @Override
    public void ogretmenSil(int ogretmenId) {

        Connection connect = openSqlConnection();
        try {
            PreparedStatement statement = connect.prepareStatement("DELETE FROM TEACHER " +
                    "WHERE  TEACHER_ID  =  (?) ");
            statement.setInt(1, ogretmenId);
            statement.execute();
            statement = connect.prepareStatement("DELETE FROM LESSON " +
                    "WHERE  DERSI_VEREN_ID  =  (?) ");
            statement.setInt(1, ogretmenId);
            statement.execute();
            connect.close();
        } catch (SQLException e) {
            System.out.println(ogretmenId + " nolu öğretmen silinemedi.");
        }


    }

    @Override
    public void ogretmenGuncelleme(Teacher teacher) {

    }

}
