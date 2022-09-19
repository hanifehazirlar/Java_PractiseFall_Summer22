package recap1;

import java.util.Scanner;

public class Q02_YolHizZaman {


    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400 km
        Hızı giriniz: 100 km/sa
        Süre 4 saattir.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Mesafeyi giriniz(km) : ");
        double mesafe=scan.nextDouble();
        System.out.print("Hızı giriniz(km/sa) : ");
        double hiz=scan.nextDouble();
        double sure=mesafe/hiz;
        System.out.println("Sure "+ sure+" saattir");
    }
}
