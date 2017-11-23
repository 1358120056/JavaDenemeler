package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        /*
        try{
            Connection baglanti = DriverManager.getConnection("jdbc:sqlite:test.db");
            Statement statement = baglanti.createStatement();
            statement.execute("CREATE TABLE kisiler(isim TEXT,email TEXT)");
            statement.close();
            baglanti.close();

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        */

        try(Connection baglanti = DriverManager.getConnection("jdbc:sqlite:test.db");
            Statement statement = baglanti.createStatement();)
        {
            baglanti.setAutoCommit(false);
            statement.execute("CREATE TABLE IF NOT EXISTS kisiler(isim TEXT,email TEXT)");
            /*
            statement.execute("INSERT INTO kisiler (isim,email) VALUES ('Mert','mert@mert.com')");
            statement.execute("INSERT INTO kisiler (isim,email) VALUES ('Ahmet','ahmet@mert.com')");
            statement.execute("INSERT INTO kisiler (isim,email) VALUES ('Tuna','tuna@mert.com')");
            statement.execute("INSERT INTO kisiler (isim,email) VALUES ('Altan','altan@mert.com')");
            statement.execute("UPDATE kisiler SET email ='altan@altan.com' WHERE isim='Altan' ");
            int etkilenenSatirSayisi = statement.executeUpdate("UPDATE kisiler SET email ='tuna@tuna.com' WHERE isim='Tuna'");

            System.out.println("Etkilnen satır sayısı : "+etkilenenSatirSayisi);

            statement.execute("delete from kisiler");
            */

            baglanti.commit();

            ResultSet sonuclar = statement.executeQuery("SELECT * FROM kisiler");

            while(sonuclar.next()){

                System.out.println("kişi adı: "+sonuclar.getString("isim")+" Email: "+sonuclar.getString("email") );
            }

            System.out.println("***********************************");

            PreparedStatement preparedStatement = baglanti.prepareStatement("select * from kisiler");

            sonuclar = preparedStatement.executeQuery();

            while(sonuclar.next()){

                System.out.println("kişi adı: "+sonuclar.getString("isim")+" Email: "+sonuclar.getString("email") );
            }



        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
