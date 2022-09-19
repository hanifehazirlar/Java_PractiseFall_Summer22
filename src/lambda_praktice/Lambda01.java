package lambda_praktice;

import java.util.*;
import java.util.stream.Stream;

public class Lambda01 {//okul projesinda listele vb lambda expression ile yapiniz
    static ArrayList<String> names=new ArrayList<>(Arrays.asList("Tulay", "zekeriya", "hasan", "ismail", "osman", "fatih","Ersin","Mevlit"));
    static List<Integer> numbers=new ArrayList<>(Arrays.asList(25,65,-56,55,98,-89,65,55,21,54,9,35,35,34));
    static List<String> menu = new ArrayList<>(Arrays.asList("kusleme", "adana", "trilice", "havucdilim", "buryan",
            "kokorec", "kuzutandir", "guvec"));

    /* TASK :
     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create ediniz.
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */
    public static void aHarfleriSilenGerisiniYazdiran(ArrayList<String> names){
//        System.out.println(names.stream()//akiisa alindi
//                .map(m -> m.toLowerCase())//hepsi kucuk harffe cevrilfi
//                .filter(m -> !m.contains("a"))//a harfi olmayanlar filtrelendi
//                .collect(Collectors.toList()));//lisste atildi
//      2.yol
//        System.out.println(names.stream()//akiisa alindi
//                .filter(m -> !m.contains("a") && !m.contains("A"))//a harfi olmayanlar filtrelendi
//                .collect(Collectors.toList()));//lisste atildi

//3.yol
        names.removeIf(t->t.contains("a") || t.contains("A"));
        System.out.println(names);
    }
    //en buyyk elemani bulun
    public static void maxElemanBul(List<Integer> numbers){
        Optional<Integer> max=numbers.stream().reduce(Math::max);
        System.out.println("Optional ile : "+max);
        //2.yol
        System.out.println("numbers.stream().reduce(Integer::max) = " + numbers.stream().reduce(Integer::max));

    }//Task : List`teki tum elemanalrin toplamini yazdiriniz.Lambda expression ile
    public static void elemanlariTopla(List<Integer> sayilar){
        System.out.println("sayilar.stream().reduce(0,(a,b)->a+b) = " + sayilar.stream().reduce(0, (a, b) -> a + b));
        System.out.println("sayilar.stream().reduce(Integer::sum).get() = " +
                sayilar.stream().reduce(Integer::sum).get());//spesifik method daha hizlidir
    }
    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void elemanlariCarp(List<Integer> sayilar){
        //lambda expression
        System.out.println("sayilar.stream().filter(t->t%2==0).reduce(Math::multiplyExact) = " +
                sayilar.stream().filter(t -> t % 2 == 0).reduce(Math::multiplyExact).get());
        //method referans
        System.out.println("sayilar.stream().filter(Utils2::ciftElemaniBul).reduce(Math::multiplyExact).get() = " +
                sayilar.stream().filter(Methodlarim::ciftElemaniBul).reduce(Math::multiplyExact).get());
    }
    //TODO task tek lerin karesini buyukten kucuge
    public static void teklerinKareBuyuktenKucuge(List<Integer> sayi) {
        sayi.stream().filter(Methodlarim::tekElemanlariBul).map(Methodlarim::karesiniBul).
                sorted(Comparator.reverseOrder()).forEach(Methodlarim::ayniSatirdaBosluklaYazdir);
    }
    // Task : List elemanlarini alfabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfabetikBuyukHarfTekrarsiz(List<String> yemek) {//yukaridaki tanimladigim listlerden calistim
        System.out.println();
        yemek.stream().distinct().map(t->t.toUpperCase()).sorted().forEach(Methodlarim::ayniSatirdaBosluklaYazdir);

    }
    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void strKarakterSayisiYazdir(List<String> yemek) {
    }
    // Task :TODO list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHarfeGoreTersSira(List<String> yemek) {
        System.out.println();


        //2.yol
        yemek.stream().sorted(Comparator//siralama aksiyonu girildi
                .comparing(t->t.toString()//her bir eleman stringe cevrildi
                        .charAt(t.toString().length()-1))// sitringe cevrilmis her elemanlanin son harfini verir
                        .reversed())//harflere gore siralar
                .forEach(Methodlarim::ayniSatirdaBosluklaYazdir);

    }
    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz
    // buyukten kucuge sirali  print ediniz..
    public static void karakterCiftKareBuyuktenKucuge(List<String> yemek) {
    }
    // TODO Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void karakterSayiYedidenBuyuk(List<String> yemek) {
        if(yemek.stream().allMatch(t->t.length()<=7)){
            System.out.println("List teki tum elemanlar 7 ve 7 karakterden az");
        }
        System.out.println("List teki tum elemanlar 7 ve 7 karakterden az degil");
        //2.yol
        System.out.println(yemek.stream().
                allMatch(t -> t.length() <= 7) ? "List teki tum elemanlar 7 ve 7 karakterden az" : "List teki tum elemanlar 7 ve 7 karakterden az degil");
    }
    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
    // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
    public static void basHarfiWIleBaslayan(List<String> yemek) {
    }
    // TODO Task : List elelmanlarinin "x" ile biten en az bir elemaı kontrol ediniz.
    public static void xIleBitenEleman(List<String> yemek) {
        System.out.println(yemek.stream().anyMatch(t -> t.endsWith("x") && t.endsWith("X"))?"X ile biten en az bir eleman var":"X ile biten eleman yok");
    }
    // TODO Task : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void karkterEnFazla(List<String> yemek) {
        //limit(1) => Sınırlandırma demek. Bu akışın elemanlarından oluşan, uzunluğu maxSize'dan uzun olmayacak
        // şekilde kesilmiş bir akış return eder. Stream return eder.
       Stream<String> sonIsim= yemek.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).limit(1);
       //limit in icine yazdigimiz sayi dondurulecek eleman sayisini yazdirir
        System.out.println( "Karakter sayisi en buyuk : "+Arrays.toString(sonIsim.toArray()));
    }
    /*
TRİCK : •    Stream'ler ekrana direk yazdırılamaz. Stream'i toArray() ile Array'e çeviririz.
Array'i de Arrays.toString() 'in içine alıp yazdırabiliriz.
•  Ör; System.out.println(Arrays.toString(***.toArray())); veya System.out.println(Arrays.asList(***.toArray()));
kullanılabilir.
*/
    //TODO Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    public static void sonHarfeGoreSiralaIlkHaricElmanlariYaz(List<String> yemek) {
       // yemek.stream().sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1))).
    }



}
