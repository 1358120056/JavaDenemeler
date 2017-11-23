package com.company;

import com.company.model.DataSource;
import com.company.model.Sarkici;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        DataSource dataSource = new DataSource();

        dataSource.veritabaniniAc();
        //  dataSource.veritabaniniKapat();

        ArrayList<Sarkici>  tumSarkicilar =dataSource.tumSarkilariGetir(dataSource.SIRALA_AZALAN);


        if(tumSarkicilar == null){

            System.out.println("şarkıcı yok");
            return;
        }
        for(Sarkici s: tumSarkicilar){
            System.out.println("ID: "+s.getSarkiciID() + " - ADI: "+ s.getSarkiciAdi());
        }

    }
}
