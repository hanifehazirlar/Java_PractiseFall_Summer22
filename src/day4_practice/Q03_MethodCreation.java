package day4_practice;

import java.util.Scanner;

public class Q03_MethodCreation {
    /*
Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
  0-1-1-2-3-5-8-13-21-34....
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 47'den kucuk bir tam sayi giriniz :");
        int sayi = scan.nextInt();
        fibonacci(sayi);
    }
    public static void fibonacci(int sayi) {
        int birinci = 0;
        int ikinci = 1;
        int ucuncu = birinci + ikinci;
        System.out.print("Fibonacci Sayilari : ");
        System.out.print(birinci + " " + ikinci + " ");

        if (sayi<47){
            for (int i = 2; i < sayi; i++) {
                System.out.print(ucuncu + " ");
                birinci = ikinci;
                ikinci = ucuncu;
                ucuncu = birinci + ikinci;
            }

        }else{
            System.out.println("47'den buyuk bir sayi giriniz");
        }

    }
}
