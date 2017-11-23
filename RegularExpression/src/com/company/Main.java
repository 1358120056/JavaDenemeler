package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String ifade = "abcçdefgğh 0123456789_";

        System.out.println(ifade.replaceAll("a","A"));
        System.out.println(ifade.replaceAll(".","A"));

        System.out.println(ifade.replaceAll("ab","ABC")); // ifadenin ilk 2 karakteri ab ise değiştirir.
        System.out.println(ifade.matches("abcçdefgğh 0123456789_"));

        System.out.println(ifade.replaceAll("89_$","xxx")); // ifadenin son karakterlerine bakar
        System.out.println(ifade.replaceAll("[abc]","MERT")); // a , b , c gördüğün yere mert yazar.

        System.out.println(ifade.replaceAll("[a2]b","ğ"));
        System.out.println(ifade.replaceAll("[^ac]","ğ"));

        System.out.println(ifade.replaceAll("[1-5]","ğ"));
        System.out.println(ifade.replaceAll("[^1-5]","ğ"));

        System.out.println(ifade.replaceAll("[a-f]","ğ"));
        System.out.println(ifade.replaceAll("[A-F]","ğ"));
        System.out.println(ifade.replaceAll("(?i)[A-F]","ğ"));

        System.out.println(ifade.replaceAll("[0-9]","ğ"));

        System.out.println(ifade.replaceAll("\\d","ğ"));
        System.out.println(ifade.replaceAll("\\D","ğ"));

        System.out.println(ifade.replaceAll("\\s","MERT")); //boşluk ifadesini değiştir.
        System.out.println(ifade.replaceAll("\\S","ğ"));  // boşluk dışındakileri değştiri.

        System.out.println(ifade.replaceAll("\\w","A"));  // a-z ve 0-9 u değişştir.
        System.out.println(ifade.replaceAll("\\W","A"));  // a-z ve 0-9 u değişştir.

        String isim = "Mert Yavuz";
        System.out.println(isim.replaceAll("\\b","\t"));
        System.out.println(isim.replaceAll("\\b","\\t"));


        String yeniIfade="abcdeeeeeeeF123Ghiiiiii";

        System.out.println(yeniIfade.replaceAll("^abcde{3}", "Y"));
        System.out.println(yeniIfade.replaceAll("^abcde+","Y"));//bir veya daha fazla e arar
        System.out.println(yeniIfade.replaceAll("^abcde*","Y"));//sıfır veya birden fazla e arar
        System.out.println(yeniIfade.replaceAll("^abcde{2,5}","Y"));//sıfır veya birden fazla e arar

        String yeni="abcdefghijkl";
        System.out.println(yeni.replaceAll("h+i*j", "X"));



        StringBuilder htmlText=new StringBuilder("<h1>Başlık Bilgisi</h1>");
        htmlText.append("<h2>Alt Başlık Bilgisi</h2>");
        htmlText.append("<p>Bu birinci paragraf</p>");
        htmlText.append("<p>Bu ikinci paragraf</p>");
        htmlText.append("<h2>Özet</h2>");
        htmlText.append("<p>Bu özet paragrafı</p>");

        String h2Pattern="<h2>";
        Pattern pattern=Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int sayac=0;
        while(matcher.find()){
            sayac++;
            System.out.println("Ortaya Çıktı : "+ sayac + " : " + matcher.start() + " - " + matcher.end());
        }

        String h2GrupPattern="(<h2>.*?</h2>)";
        Pattern grupPattern=Pattern.compile(h2GrupPattern, Pattern.CASE_INSENSITIVE);
        Matcher grupMatcher=grupPattern.matcher(htmlText);

        grupMatcher.reset();

        while(grupMatcher.find()){
            System.out.println("Ortaya Çıktı : " + grupMatcher.group(1));
        }

        String h2TextPattern="(<p>)(.*?)(</p>)";
        Pattern textPattern=Pattern.compile(h2TextPattern, Pattern.CASE_INSENSITIVE);
        Matcher textmatcher=textPattern.matcher(htmlText);

        textmatcher.reset();

        while(textmatcher.find()){
            System.out.println("Ortaya Çıktı : " + textmatcher.group(2));
        }











    }
}
