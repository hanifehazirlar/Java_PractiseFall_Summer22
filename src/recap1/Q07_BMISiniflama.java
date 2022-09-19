package recap1;

import java.util.Scanner;

public class Q07_BMISiniflama {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(m*m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */
        public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);

            System.out.print("Boyunuzu giriniz(cm)");
            double boy= scan.nextDouble()/100; // boyu m cevirdik

            System.out.print("Kilonuzu giriniz(kg)");
            double kilo= scan.nextDouble();

            double bMI=kilo/(boy*boy);

            if (bMI<=20){
                System.out.println("bMI ındexiniz "+bMI+" oldukca zayifsiniz");
            }else if (bMI<=25){
                System.out.println("bMI ındexiniz "+bMI+" normal sinirlardasiniz");
            }else if(bMI<=30){
                System.out.println("bMI ındexiniz "+bMI+" sisman kategorisindesiniz");
            }else if(bMI>30){
                System.out.println("bMI ındexiniz "+bMI+" obez grubundasiniz");
            }

        }
}
