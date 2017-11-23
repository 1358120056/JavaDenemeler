package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        float birinciKenar,ikinciKenar,ücüncüKenar;


        Scanner kenarlar = new Scanner(System.in);

        System.out.println("İlk kenarı giriniz:");

        birinciKenar = kenarlar.nextFloat();

        System.out.println("İkinici kenarı giriniz:");

        ikinciKenar = kenarlar.nextFloat();

        System.out.println("Üçüncü kenarı giriniz:");

        ücüncüKenar = kenarlar.nextFloat();


        if(birinciKenar==ikinciKenar && birinciKenar==ücüncüKenar)
        {
            System.out.println("Eşkanar üçgen");
        }
        else if( (birinciKenar==ikinciKenar &&birinciKenar!=ücüncüKenar)
                || (birinciKenar == ücüncüKenar && birinciKenar !=ikinciKenar )
                || ( ikinciKenar == ücüncüKenar && ikinciKenar != birinciKenar)
                )
        {
            System.out.println("ikizkenar");
        }

        else{
            System.out.println("çeşitkenar");
        }

    }
}
