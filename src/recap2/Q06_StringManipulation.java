package recap2;

import java.util.Locale;
import java.util.Scanner;

public class Q06_StringManipulation {
    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir kelime giriniz :");
        String kelime1=scan.next().toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.print("Ikinci kelimeyi giriniz :");
        String kelime2=scan.next().toLowerCase(Locale.forLanguageTag("Tr"));

        String kelime3=kelime1.concat(kelime2);
        System.out.println(kelime3);
        String kelime1GeriKalan=kelime1.substring(1);
        String kelime2GeriKalan=kelime2.substring(1);
        System.out.println(kelime1GeriKalan.concat(kelime2GeriKalan));

        // 2.cözum
        String kelime4=kelime1.substring(1).concat(kelime2.substring(1));
        System.out.println(kelime4);


    }
}
