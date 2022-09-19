package day3_practice;

import java.util.Scanner;

public class Q07_StringManipulation {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir kelime giriniz");
        String str=scan.next();
        String terStr=str.substring(3).concat(str.substring(2,3).concat(str.substring(1,2).concat(str.substring(0,1))));
        System.out.println(terStr);
       // 2.cözüm
        String tersInput=str.substring(str.length()-1);

        for (int i = str.length()-2; i>= 0; i--) {

          tersInput+=str.substring(i,i+1);

        }
        System.out.println(tersInput);
        /*
        3.çozum
        Scanner scan = new Scanner(System.in); //mesaj vermeden de konsol da girdi girilir
        String kelime = scan.next();
        System.out.println(kelime.length());
        if (kelime.length() <= 4) {
            char bir = kelime.charAt(0);
            char iki = kelime.charAt(1);
            char uc = kelime.charAt(2);
            char dort = kelime.charAt(3);
            System.out.println("Tersden :" + dort + uc + iki + bir);
        } else {
            System.out.println("Girdiginiz kelime uzunlugu 4 karakterden fazla");
        }
         */
    }

}
