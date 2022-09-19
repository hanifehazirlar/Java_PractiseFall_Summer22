package day10_practice.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {
        /*
          * ogretmen bilgilerini kullanicidan aliniz
          * aldiginiz bilgilerden object ureterek yeni
            ogretmenler olusturun ve bilgilerini yazdirin
        */
        System.out.println("hosgeldiniz okulumuza ");
        Scanner scan=new Scanner(System.in);

        System.out.print("isim giriniz :");
        String isim=scan.nextLine();

        System.out.print("soyisminizi giriniz :");
        String soyisim=scan.nextLine();

        System.out.print("yasinizi giriniz :");
        int yas=scan.nextInt();

        System.out.print("bransinizi giriniz :");
        String brans=scan.next();

        System.out.print("telefon numaranizi giriniz :");
        String tel=scan.next();

        OgretmenBilgileri adayOgretmen=new OgretmenBilgileri(isim,soyisim,yas,brans,tel);
        // Contructor daki variable sıralamasiyla ayni sirada olusturulmalidir
        List<OgretmenBilgileri> ogretmenList=new ArrayList<>();

        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);


    }
}
