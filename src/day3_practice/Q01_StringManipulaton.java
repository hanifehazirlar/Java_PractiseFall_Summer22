package day3_practice;

import java.util.Scanner;

public class Q01_StringManipulaton {

    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Anlamli cumle olusturmak icin 1. kelimeyi giriniz");
        String str1=scan.next().toLowerCase();
        System.out.println("Anlamli cumle olusturmak icin 2. kelimeyi giriniz");
        String str2=scan.next().toLowerCase();
        System.out.println("Anlamli cumle olusturmak icin 3. kelimeyi giriniz");
        String str3=scan.next().toLowerCase();
        System.out.println("Anlamli cumle olusturmak icin 4. kelimeyi giriniz");
        String str4=scan.next().toLowerCase();

        String input=str1+", "+str2+", "+str3+", "+str4 ;
        String output=str1.substring(0,1).toUpperCase()+str1.substring(1)+", "+str2+", "+str3+", "+str4+".";
        System.out.println("Input : "+input);
        System.out.println("Output : "+output);



    }
}
