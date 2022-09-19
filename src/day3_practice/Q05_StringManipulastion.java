package day3_practice;

import java.util.Scanner;

public class Q05_StringManipulastion {

    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Isminizi giriniz :");
        String isim=scan.next();
        System.out.print("Soyisminizi giriniz : ");
        String soyisim = scan.next();
        if (isim.length()>soyisim.length()){
            System.out.println("Isminiz soyisminizden daha uzun");
        }else if (soyisim.length()>isim.length()){
            System.out.println("Soyisminiz isminizden daha uzun");
        }else{
            System.out.println("Isminiz ile soyisminiz ayni uzunlukta");
        }
    }
}
