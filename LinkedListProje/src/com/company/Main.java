package com.company;

import java.util.*;

public class Main {

    private static ArrayList<Album> tumAlbumler = new ArrayList<>();

    public static void main(String[] args) {


        Album teomaninAlbümü=new Album("On Yedi", "Teoman");
        teomaninAlbümü.sarkiEkle("Hayalperest", 4.10);
        teomaninAlbümü.sarkiEkle("Gemiler", 3.50);
        teomaninAlbümü.sarkiEkle("İki Yabancı",5.10);
        teomaninAlbümü.sarkiEkle("Soluk Soluğa",2.15);

        tumAlbumler.add(teomaninAlbümü);

        Album yildizTilbeAlbumu=new Album("Anca Gidersin","Yıldız Tilbe");
        yildizTilbeAlbumu.sarkiEkle("Bin Dereden Su Getirsem",3.40);//1.şarkı
        yildizTilbeAlbumu.sarkiEkle("Delikanlım",4.20);//2.şarkı
        yildizTilbeAlbumu.sarkiEkle("Vazgeçtim", 2.35);//3.şarkı
        yildizTilbeAlbumu.sarkiEkle("Ama Evlisin", 3.50);//4.şarkı

        tumAlbumler.add(yildizTilbeAlbumu);

        LinkedList<Sarki> oynatmaListesi = new LinkedList<>();

        //teomanın albümü : tumAlbumler.get(0)
        //yildiz tilbe albümü : tumAlbumler.get(1)

        tumAlbumler.get(0).oynatmaListesineEkle("Hayalperest", oynatmaListesi);
        tumAlbumler.get(0).oynatmaListesineEkle("İki Yabancı", oynatmaListesi);
        // tumAlbumler.get(0).oynatmaListesineEkle("Bu şarkı yok ", oynatmaListesi);
        tumAlbumler.get(0).oynatmaListesineEkle("Soluk Soluğa", oynatmaListesi);

        tumAlbumler.get(1).oynatmaListesineEkle(1, oynatmaListesi);
        tumAlbumler.get(1).oynatmaListesineEkle(3, oynatmaListesi);
        tumAlbumler.get(1).oynatmaListesineEkle(4, oynatmaListesi);
        // tumAlbumler.get(1).oynatmaListesineEkle(9, oynatmaListesi);


        oynat(oynatmaListesi);


    }

    private static void oynat(LinkedList<Sarki> oynatmaListesi) {

        Scanner tara=new Scanner(System.in);
        boolean cikis = false;
        boolean ileriyeDogruMuGidiliyor = true;

        ListIterator<Sarki> iterator=oynatmaListesi.listIterator();

        if(oynatmaListesi.size() == 0){
            System.out.println("Listeye henüz şarkı eklenmemiş");
            return;
        }else{
            System.out.println("Şuan Çalan Şarkı : " + iterator.next().toString());
        }

        menuGoster();

        while(!cikis) {
            int kullaniciSecimi = tara.nextInt();
            switch (kullaniciSecimi) {

                case 0:
                    System.out.println("Uygulamadan çıkılıyor");
                    cikis = true;
                    break;

                case 1:
                    if(!ileriyeDogruMuGidiliyor){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        ileriyeDogruMuGidiliyor=true;
                    }
                    if(iterator.hasNext()){
                        System.out.println("Şu an çalan şarkı: "+iterator.next());
                    }
                    else {
                        System.out.println("Listenin sonuna geldiniz.");
                    }
                    break;

                case 2:
                    if(ileriyeDogruMuGidiliyor){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileriyeDogruMuGidiliyor=false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Şu an çalan şarkı: "+iterator.previous());
                    }
                    else {
                        System.out.println("Listenin başına geldiniz.");
                    }
                    break;
                case 3:

                    if(ileriyeDogruMuGidiliyor){
                        if(iterator.hasPrevious()){
                            System.out.println("Tekrarlanan Şarkı :"+ iterator.previous());
                            ileriyeDogruMuGidiliyor=false;
                        }
                        else {
                            System.out.println("Listenin başındasınız.");
                        }
                    }
                    else {
                        if(iterator.hasNext()){
                            System.out.println("Tekrarlanan Şarkı: "+iterator.next());
                            ileriyeDogruMuGidiliyor=true;
                        }
                        else {
                            System.out.println("Listenin sonundayız.");
                        }
                    }

                    break;

                case 4:
                    oynatmaListesiniGoster(oynatmaListesi);
                    break;

                case 5:
                    menuGoster();
                    break;

            }


        }
    }
    private static void oynatmaListesiniGoster(LinkedList<Sarki> oynatmaListesi) {

        Iterator<Sarki> iterator=oynatmaListesi.iterator();
        System.out.println("====================================================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    private static void menuGoster(){
        System.out.println("Seçiminizi yapınız");
        System.out.println("0 - Çıkış");
        System.out.println("1 - Bir sonraki şarkı");
        System.out.println("2 - Bir önceki şarkı");
        System.out.println("3 - Şarkıyı yeniden başlat");
        System.out.println("4 - Oynatma listesindeki tüm şarkılar");
        System.out.println("5 - Menüyü göster");
    }
}
