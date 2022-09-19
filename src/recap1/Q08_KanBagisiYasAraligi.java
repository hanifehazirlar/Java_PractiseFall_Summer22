package recap1;

import java.util.Scanner;

public class Q08_KanBagisiYasAraligi {
		/*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.print("Yasinizi giriniz : ");
            int yas=scan.nextInt();
            System.out.print("Kilonuzu giriniz (kg) : ");
            int kilo=scan.nextInt();

            if (0<yas && yas<18) {
                System.out.println("yasi 18'den kucuk olanlar kan bagisi yapamaz");
            }
            if (0<kilo && kilo < 50) {
                System.out.println("kilosu 50 kg'dan hafif olanlar kan bagisi yapamaz");
            }else if(yas>=18 && kilo>=50){
                System.out.println("kan yagisi yapabilir");
            }else{
                System.out.println("Lutfen gecerli deger giriniz");
            }

        }



}