package lambda_praktice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda03_Odev {
    //odev

    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar
    // tamsayilari toplayan bir program create ediniz.
    //Structured(AMELE) Programming
    public static void main(String[] args) {
        System.out.println("xKuvveti(2,3) = " + xKuvveti(2, 3));
    }
    public static int toplaAmele(int i) {

        return IntStream.rangeClosed(1,i).reduce(Math::addExact).getAsInt();
    }
    //TODO Functional(cincix Programming
    public static int toplaCincix(int x) {

        return 0;
    }
    //TODO TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int toplaCift(int x) {

        return IntStream.rangeClosed(1,x).filter(t->t%2==0).reduce(Math::addExact).getAsInt();
    }
    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program  create ediniz.
    public static int toplaIlkXCift(int x) {

        return IntStream.rangeClosed(1,x).filter(t->t%2==0).reduce(Math::addExact).getAsInt();
    }
    //TODO TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    public static int toplaIlkXTek(int x) {

        return IntStream.rangeClosed(1,x).filter(t->t%2!=0).reduce(Math::addExact).getAsInt();
    }
    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void ikininIlkXKuvvetPrint(int x) {
        IntStream.rangeClosed(1,x).mapToDouble(t->Math.pow(2,t)).forEach(t-> System.out.print(t+" "));
    }
    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void isteneSayiIlkXKuvvetPrint(int istenenSayi,int x) {
        System.out.println("Istenen sayinin ilk X kuvveti  ; made by Mevlut");
        IntStream.rangeClosed(1, x).mapToDouble(t -> Math.pow(istenenSayi, t)).forEach(System.out::println);
    }
    // TODO TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.
    public static int istenenSayiFactorial(int x) {

        return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
    }

    //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
    public static double xKuvveti(int sayi, int x) {

        return IntStream.rangeClosed(x,x).mapToDouble(t -> Math.pow(sayi, t)).reduce((t,u)->t).getAsDouble();
    }
    /*TASK :
2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm
elemanları bir
listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
*/
    static String[][] arr = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
    public static void harfSirasinaGoreYazdir(String[][] arr) {
        List<String> list=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                list.add(arr[i][j]);
            }
        }
        System.out.println(list.stream().sorted().collect(Collectors.toList()));

    }

}
