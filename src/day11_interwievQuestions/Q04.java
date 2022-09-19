package day11_interwievQuestions;

import java.util.Scanner;

public class Q04 {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    //bunu kart sifre kontrol de de kullabilirinisiz
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sifre = "hanife.123";
        int girisHakki = 3;
        while (true) {
            System.out.println("Sifrenizi giriniz");
            String str = scan.nextLine();
            if (sifre.equals(str)) {
                System.out.println("Sifre basarili");
                break;
            } else {
                System.out.println("Sifre basarisiz");
                girisHakki--;
                System.out.println("Kalan giris hakkiniz : " + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("giris hakkiniz kalmadi");
                break;
            }
        }
    }
}
