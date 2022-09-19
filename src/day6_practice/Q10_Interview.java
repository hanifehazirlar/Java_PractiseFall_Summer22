package day6_practice;

import java.util.Scanner;

public class Q10_Interview {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {

        String tekrarliYazimi=tekrarMethodu();

        System.out.println(tekrarliYazimi);
    }

   public static String tekrarMethodu() {
       Scanner scan=new Scanner(System.in);
       System.out.println("Bir kelime giriniz");
       String kelime=scan.next();
       System.out.println("Kaç kez tekrar etsin");

       int tekrarSayisi=scan.nextInt();
       String ilkVeSonHarf=kelime.substring(0,1).concat(kelime.substring(kelime.length()-1));
       String tekrar="";
       for (int i = 1; i <=tekrarSayisi; i++) {
           tekrar+=ilkVeSonHarf;
       }

      return tekrar;
    }
}
