package day7_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q06_Arrays {
    /*
 kullanıcının girdigi bir array'in en buyuk elemani ile
 en kucuk elemanının  farkını bulan bir method create ediniz.
*/
    public static void main(String[] args) {
        maxMinFarki();
    }

    public static void maxMinFarki() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac elemanli bir array olusturmami istersiniz");
        int uzunluk = scan.nextInt();
        int[] arr = new int[uzunluk];
        int max = 0;
        int min = 0;
        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i + ". index icin sayi giriniz");
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] > max) {  // diger indexlerdeki sayilar 0.indexten buyuk degillerse 0. indexi yazdirir
                max = arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max +" - "+min+" = "+(max-min));

        //2.yontem
        /*
         Scanner scanner = new Scanner(System.in);
        System.out.print("array uzunlugunu giriniz : ");
        int uzunluk = scanner.nextInt();
        int arr[] = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
         System.out.println(i + ". index icin sayi giriniz");
         arr[i] = scan.nextInt();
         }
         Arrays.sort(arr);
        System.out.println("arraydeki en buyuk eleman ile en kucuk eleman arasindaki fark : " +
                            (arr[uzunluk-1]-arr[0]));

         */
        //  odev: bu soruyu Math classi kullanrak cozunuz..

    }
}
