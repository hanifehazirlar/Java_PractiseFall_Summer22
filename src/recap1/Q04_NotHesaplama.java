package recap1;

import java.util.Scanner;

public class Q04_NotHesaplama {

        /*
         * Kullanicidan alacaginiz vize1, vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        public static void main(String[] args) {
           Scanner scan=new Scanner(System.in);
            System.out.print("1.vize notunuzu giriniz :");
            int vize1=scan.nextInt();
            System.out.print("2.vize notunuzu giriniz :");
            int vize2=scan.nextInt();
            System.out.print("Final notunuzu giriniz :");
           int finalNot=scan.nextInt();
           double yilSonuNotu=((vize1+vize2)/2)*0.3+finalNot*0.7;
            System.out.println("Yil Sonu Notunuz :" + yilSonuNotu);
        }
}
