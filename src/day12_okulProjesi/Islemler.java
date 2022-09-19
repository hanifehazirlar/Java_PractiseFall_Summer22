package day12_okulProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrtmnList = new ArrayList<>();
    static List<Kisi> ogrncList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;
    //static yazmamizin sebebi tum methodlardan ulasamk icin gokte ki ay
    //gokteki ay gibi heryeden ulaşılabilsin

    public static void girisPaneli() {
        System.out.println();
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("0- ÇIKIŞ");

       int secim = scan.nextInt();
        switch (secim) {
            case 1:
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case 2:
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case 0:
                cıkıs();
                break;
            default:
                System.out.println("hatali giris :(");
                girisPaneli();
                break;
        }
    }
    private static void islemMenusu() {
        System.out.println("Sectigin kisi turu "+kisiTuru+" lutfen asagidaki islemleri seciniz");
        System.out.println("=========Islemler=========\n"+
                "        1-EKLEME\n"+
                "        2-ARAMA\n"+
                "        3-LISTELEME\n"+
                "        4-SİLME\n"+
                "        5-ANA MENU\n"+
                "        0-CIKIS");
        System.out.println("Islem tercihinizi giriniz :");
        int secilenIslem=scan.nextInt();
        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listele();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 5:
                girisPaneli();
                break;
            case 0:
               cıkıs();
                break;
            default:
                System.out.println("Hatali giris");
                islemMenusu();
                break;
        }
    }
    private static void cıkıs() {
        System.out.println("*****YINE BEKLERIZ***** )");
    }
    private static void silme() {
        System.out.println("***** "+kisiTuru+" ***** silme sayfasina hosgeldiniz");
        System.out.println("Silmek istediginiz kisinin kimlik nosunu giriniz");
        String kimlikNo=scan.next();
        if (kisiTuru.equals("OGRENCI")) {
            String sonuc="";
            for (int i = 0; i < ogrncList.size(); i++) {
                if (ogrncList.get(i).getKimlikNo().contains(kimlikNo)){
                    sonuc="Silmis oldugunuz kisi = \n"+ogrncList.remove(i);
                    break;
                }else{
                    sonuc="Bu kisi ogrenci listesinde yok";
                }
            }
            System.out.println(sonuc);
        }else {
            String sonuc = "";
            for (int i = 0; i < ogrtmnList.size(); i++) {
                if (ogrtmnList.get(i).getKimlikNo().contains(kimlikNo)) {
                    sonuc = "Bu kisi Ogretmen listesinde var";
                    System.out.println(ogrtmnList.get(i));
                    break;
                } else {
                    sonuc = "Bu kisi Ogretmen listesinde yok";
                }
            }
            System.out.println(sonuc);
        }

    }

    private static void listele() {
        System.out.println("***** "+kisiTuru+" ***** listeleme sayfasina hosgeldiniz");
        if (kisiTuru.equals("OGRENCI")){
            System.out.println(ogrncList);
        }else{
            System.out.println(ogrtmnList);
            /*
            for(Kisi each:ogrtmnList){
             System.out.println(each.toString()); bu sekilde de yazdirabiliriz
             */
        }
    }

    private static void arama() {
        System.out.println("***** "+kisiTuru+" ***** arama sayfasina hosgeldiniz");
        System.out.println("Aramak istediginiz kisinin kimlik nosunu giriniz");
        String kimlikNo=scan.next().replaceAll(" ","");//Kullanici bosluk yaparsa diye bosluk hiclik yapildi
        if (kisiTuru.equals("OGRENCI")) {
            String sonuc="";
            for (int i = 0; i < ogrncList.size(); i++) {
                if (ogrncList.get(i).getKimlikNo().contains(kimlikNo)){
                    sonuc="Bu kisi ogrenci listesinde var \n"+ogrncList.get(i);
                    break;
                }else{
                    sonuc="Bu kisi ogrenci listesinde yok";
                }
            }
            System.out.println(sonuc);
        }else {
            String sonuc="";
            for (int i = 0; i < ogrtmnList.size(); i++) {
                if (ogrtmnList.get(i).getKimlikNo().contains(kimlikNo)){
                    sonuc="Bu kisi Ogretmen listesinde var";
                    System.out.println(ogrtmnList.get(i));break;
                }else{
                    sonuc="Bu kisi Ogretmen listesinde yok";
                }
            }
            System.out.println(sonuc);
        }
    }
    private static void ekle() {// Bu method hem ogrenci hem de ogretmen eklemek icin tasarlandi
        System.out.println("***** "+kisiTuru+" ***** ekleme sayfasina hosgeldiniz");
        System.out.println("isim soyisim giriniz");
        scan.nextLine();
        String adSoyad=scan.nextLine();
        System.out.println("kimlik no giriniz");
        String kimlikNo=scan.next();
        System.out.println("Yasinizi giriniz");
        int yas=scan.nextInt();

        if (kisiTuru.equals("OGRENCI")){
            System.out.println("Ogrenci no giriniz");
            String ogrenciNo=scan.next();
            System.out.println("Sinif giriniz");
            String sinif=scan.next();
            Ogrenci ogrenci=new Ogrenci(adSoyad,kimlikNo,yas,ogrenciNo,sinif);
            ogrncList.add(ogrenci);
            System.out.println(ogrncList);

        }else{// kisiTuru OGRETMEN oldu
            System.out.println("Bransinizi giriniz");
            String bolum=scan.next();
            System.out.println("Sicil no giriniz");
            String sicilNo=scan.next();
            Ogretmen ogretmen=new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
            ogrtmnList.add(ogretmen);
            System.out.println(ogrtmnList);
        }
    }

}
