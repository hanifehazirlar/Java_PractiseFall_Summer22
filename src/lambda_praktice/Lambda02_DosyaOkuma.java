package lambda_praktice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
dosya eklemek icin 2 yol var
1) Files.lines(Path.of("path")  buradan stream e eklemek icin
Stream <String> satir=Files.lines(Path.of(".........."));
bu bize tekrardan stream tanimlamadan kullanmayi saglar
2) Files.lines(Paths.get("..........")).  kullanilir
==========================================================
intellj dosya eklemek icin src => new=>file=>text diyoruz ve istedigimiz metni buraya kopyaliyoruz
bu dosyanin path almak icin dosyanin uzerine gelip sag tikliyoruz
sonrasinda copy path seciyoruz bundan sonra iki secenek var
1) absolute path seciyoruz yada
2) path from content root seciyoruz

her ikisinde de path kopyalamis oluyoruz
cevirirken EXCEPTION OLUSMASIN DIYE => throws IOException <= EKLEMELIYIZ
buda lines altinda kirmizi uyari veriyor uzerine tiklayinca kendiliginden oluyor
*/
public class Lambda02_DosyaOkuma {// yolu src/lambda_practice/siirler.txt

    public static void main(String[] args) throws IOException {
        System.out.println("\nTASK 0 --> siirler.txt dosyasini konsolda yazdiriniz -->  ");
        //1. yol
        Path muti=Path.of("src/lambda_praktice/siirler.text");//siirler dosyasi muti obj sine atandi
        Stream <String> akis=Files.lines(muti);//muti obj si akis obj sine atanarak Stream classsinda akisa alindi
        //akis.forEach(System.out::println);
        //buyuk harfe cevirdil
        akis.map(String::toUpperCase).forEach(Methodlarim::ayniSatirdaBosluklaYazdir);
        //2.yol
        System.out.println();
        Files.lines(Path.of("src/lambda_praktice/siirler.text")).forEach(Methodlarim::ayniSatirdaBosluklaYazdir);

        System.out.println("\nTASK 1  --> siirler.txt dosyasindaki ilk satiri buyuk harflerle yazdirin  -->  ");
        Files.lines(muti).map(String::toUpperCase).limit(1).forEach(System.out::println);
        System.out.println(Files.lines(muti).map(String::toUpperCase).findFirst().get());

        System.out.println("\nTASK 2 --> siirler.txt dosyasinda hatir kelimesinin kac satirda gectiginiz yazdiriniz -->  ");
        System.out.println(Files.lines(muti).//dosya akisa alindui
                map(String::toLowerCase).//tamami kucuk harfe cevrildi
                filter(t -> t.contains("hatir")).//her bir satirda hatir kelimesi var mi kontrol edildi
                count());// kac tane hatir varsa hepsinin sayisi yazdirildi
        System.out.println("\nTASK 3  --> siirler.txt dosyasindaki ayni kelimeleri cikartarak (benzersiz yapin) yazdiriniz. -->  ");
        System.out.println(Files.lines(muti).
                map(t -> t.split(" ")).//her bir kelime alindi
                        flatMap(Arrays::stream).//duz bir yapiya yani tek bir array e cevrildi
                        distinct().
                collect(Collectors.toList()));
        //2. yol
        System.out.println(Files.lines(muti).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                collect(Collectors.toSet()));
        System.out.println("\nTASK 4 --> siirler.txt dosyasindaki tum kelimeleri natural order  yazdiriniz. -->  ");
        Files.lines(muti).
                map(t->t.toLowerCase().
                        split(" ")).
                flatMap(Arrays::stream).
                sorted().
                forEach(Methodlarim::ayniSatirdaBosluklaYazdir);
        System.out.println("\nTASK 5 --> siirler.txt dosyasinda gonlum kelimesinin kac kere gectigini  yazdiriniz. -->  ");
        System.out.println(Files.lines(muti).
                map(t -> t.toLowerCase().
                        split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.equals("gonlum"))
                .count());
        System.out.println("\nTASK 6 --> siirler.txt dosyasinda a harfi gecen kelimelerin sayisini ekrana yazdiran programi yazdiriniz. -->  ");
        System.out.println(Files.lines(muti).
                map(t -> t.toLowerCase().
                        split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.contains("a"))
                .count());
        System.out.println("\nTASK 7 --> siirler.txt dosyasinda a harfi gecen kelimeler yazdiriniz. -->  ");
        System.out.println(Files.lines(muti).
                map(t -> t.toLowerCase().
                        split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.contains("a"))//buraya kadar gelenler a harfi iceren kelimeler
                .collect(Collectors.toList()));
        System.out.println("\nTASK 8 --> siirler.txt dosyasinda kac /farklı harf kullanildigini  yazdiriniz. -->  ");
        System.out.println(Files.lines(muti).map(t -> t.replaceAll("\\W", "").replaceAll("\\d", "")
                .split("")).flatMap(Arrays::stream).distinct().count());

        System.out.println("\nTASK 9 --> siirler.txt dosyasinda kac farkli kelime kullanildiginin sayisi  yazdiriniz. -->  ");
        System.out.println(Files.lines(muti).map(t -> t.split(" ")).flatMap(Arrays::stream).distinct().count());
        System.out.println("\nTASK 10 --> siirler.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");
        Files.lines(muti).map(t -> t.toLowerCase()
                .split(" ")).flatMap(Arrays::stream).distinct().forEach(Methodlarim::ayniSatirdaBosluklaYazdir);
    }


}
