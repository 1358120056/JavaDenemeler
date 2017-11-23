package com.company;

public class Main {

    public static void main(String[] args) {

        int i,j,carpim;

        for(i=1;i<=10;i++){

            if(i==11)

                break;

            for(j=1;j<=10;j++){

                carpim = i*j;

                System.out.print(i+" X "+ j + " = "+ carpim +"\t" );

                if (j==11)
                        break;;
            }

            System.out.println();

        }
    }
}
