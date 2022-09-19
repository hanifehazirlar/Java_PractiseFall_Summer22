package day6_practice;

import java.util.Scanner;

public class Q11_Odev {

    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    // 3 giris hakki olsun
    // her denemede giris hakki 1 azalsin
    public static void main(String[] args) {
        String pin = "mustafa.1234";
        String puk = "hanife.1234";
        int pingirisHakki = 3;
        String sifre = " ";
        String sifre2 = " ";

        int pukGirisHakki = 3;
        Scanner scan = new Scanner(System.in);
        System.out.println("********HOSGELDINIZ*********");
        while (true) {
            System.out.println("pin kodunuzu giriniz :");
            String girilenPin = scan.nextLine();
            if (pin.equals(girilenPin)) {
                System.out.println("basarili giris yaptiniz..");
                break;
            } else {
                System.out.println("yanlis giris yaptiniz..");
                pingirisHakki--;
                System.out.println("kalan giris hakkiniz :" + pingirisHakki);
            }
            if (pingirisHakki == 0) {
                System.out.println("giris hakkiniz kalmadi..bloklandiniz..");
                break;
            }

        }
        while (!sifre.equals(pin)) {
            System.out.println("Puk Kodunuzu giriniz: ");
            sifre2 = scan.nextLine();
            if (sifre2.equals(puk)) {
                System.out.println("Basarili giris yaptiniz");
                break;
            } else {
                System.out.println("Yanlıs giris yaptiniz");
                pukGirisHakki--;
                System.out.println("Kalan giris puk hakkiniz: " + pukGirisHakki);

            }
            if (pukGirisHakki == 0) {
                System.out.println("Sim karti bloke ettiniz, artik is görmez:))");
                break;

            }
        }
    }
}
