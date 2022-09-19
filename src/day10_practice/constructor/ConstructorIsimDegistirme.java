package day10_practice.constructor;

import java.util.Scanner;

public class ConstructorIsimDegistirme {
    String isim;
    String soyisim;

    public ConstructorIsimDegistirme(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
    }
// class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)

    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin

     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni
     *  bilgileri
     * yazdirsin

     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin

     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak
     *  "soyisim"
      variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini
      istesin ve
      eski soyismi degistirsin.

     * Not :Instance variable'lar object'lere aittir ve diger adi object
     * variable'dir
     */
    public static void main(String[] args) {
        ConstructorIsimDegistirme obje=new ConstructorIsimDegistirme("Hanife","Hazirlar");
        isimDegistir(obje.isim,obje.soyisim);
        System.out.println("isimDegistir methodundan sonra : "+obje.isim+" "+obje.soyisim);
        soyisimDegistir(obje.soyisim);
        System.out.println("soyisimDegistir methodundan sonra :"+obje.soyisim);
    }
    public static String soyisimDegistir(String soyisim) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yeni soyisim giriniz");
        String yeniSoyisim=scan.next();
       return yeniSoyisim;
    }
    public static void isimDegistir(String isim, String soyisim) {
        isim="Esma";
        soyisim="Unlu";
        System.out.println("IsimDegistir Methodunda : "+isim+" "+soyisim);
    }
    /*
    public static void main(String[] args) {
        String ogrenciIsim="Ali";
        String ogrenciSoyIsim="Can";
        String ogrenciTel ="123456789";

        System.out.println("isim :" +ogrenciIsim +" soyisim :" +ogrenciSoyIsim +" tel :"+ ogrenciTel);
        //isim :Ali soyisim :Can tel :123456789
        isimDegistir(ogrenciIsim,ogrenciSoyIsim,ogrenciTel); //isim :Mehmet soyisim :Bulut tel :4569871263

        //soyIsimDegistir(ogrenciSoyIsim); //ilk methodu create ederken bu satiri kullandik..
        ogrenciSoyIsim=soyIsimDegistir(ogrenciSoyIsim);
        System.out.println("isim :"+ogrenciIsim + " yeniSoyisim :" +ogrenciSoyIsim + " tel: " +ogrenciTel);
        //isim :Ali yeniSoyisim :Guzel tel: 123456789

    }

    private static String soyIsimDegistir(String ogrenciSoyIsim) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Yeni soyisiminizi giriniz :");
        String yeniSoyisim = scan.nextLine();
        return  yeniSoyisim;
    }

    public static void isimDegistir(String ogrenciIsim, String ogrenciSoyIsim, String ogrenciTel) {
        ogrenciIsim ="Mehmet";
        ogrenciSoyIsim ="Bulut";
        ogrenciTel="4569871263";

        System.out.println("isim :" +ogrenciIsim +" soyisim :" +ogrenciSoyIsim +" tel :"+ ogrenciTel);
    }

     */

}
