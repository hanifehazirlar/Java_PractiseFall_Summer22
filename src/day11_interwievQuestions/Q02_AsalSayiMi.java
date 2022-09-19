package day11_interwievQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_AsalSayiMi {
   /*
     Ask user enter a positive number and check if it is prime or not
     Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını
     kontrol edin

     Kısaca asal sayılar sadece kendine ve 1'e bölünebilen pozitif tam sayılardır.
     1 sayısı ise asal sayı değildir. Çünkü asal sayıların sadece 2 pozitif tam
      sayı böleni olmalıdır.
      1 ise sadece 1'e bölünebildiği için yalnız tek böleni bulunmaktadır.
 */
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Lütfen bir sayi giriniz");
       int sayi= scan.nextInt();
       boolean asalMi=true;
       if (sayi>1){
           for (int i = 2; i <sayi ; i++) {//bolen sayilar
               if (sayi % i ==0){
                   asalMi=false;
                   break;
               }
           }
           if (asalMi) System.out.println("sayi asaldir kirve");
           else System.out.println("sayi asal degil asal sayi gir gari ");
       }else System.out.println("sayi asal degil anliyin mu");


       // 2.yol cook guzel yontem
       List<Integer> list = new ArrayList<>();
       List<Integer> list2 = new ArrayList<>();
       list2.add(1);
       list2.add(sayi);
       for (int i = 1; i <=sayi; i++) {
           if (sayi%i==0){
               list.add(i);
           }
       }
       System.out.println(list);
       System.out.println(list2);
       if (list.equals(list2)){
           System.out.println(sayi+" asal sayidir");
       }else{
           System.out.println(sayi+" asal sayi degildir");
       }
   }
}
