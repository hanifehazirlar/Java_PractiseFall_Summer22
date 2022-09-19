package recap1;

import java.util.Scanner;

public class Q01_Modulus {
    /*
     *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
     *
     *   Ex :
     *   input  : 12345
     *   output : 12
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen 5 basamakli bir sayi giriniz :");
        int sayi= scanner.nextInt(); //53812
        int ilkIkiB=sayi/1000; // 53
        int sonIkiB=sayi%100;  // 12
        int ilkIkiBTop=(ilkIkiB/10)+(ilkIkiB%10); // 5+3
        int sonIkiBTop=(sonIkiB/10)+(sonIkiB %10); // 1+2
        System.out.println("Ilk iki ve son iki basamagındaki rakamlarin toplami :"+ (ilkIkiBTop+sonIkiBTop));




    }

}
