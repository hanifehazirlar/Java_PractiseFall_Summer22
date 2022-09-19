package recap2;

import java.util.Locale;
import java.util.Scanner;

public class Q05_StringManipulation {
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("İsminiz :");
        String isim=scan.nextLine().toUpperCase(Locale.forLanguageTag("Tr"));

        System.out.print("Soyisminiz :");
        String soyisim=scan.nextLine().toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println("İsim  ve Soyisim :" + isim +" "+soyisim);
        System.out.println("Isim ve soyisim : ");

    }
}
