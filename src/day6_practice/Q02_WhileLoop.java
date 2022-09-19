package day6_practice;

public class Q02_WhileLoop {

     /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
     public static void main(String[] args) {
         int sayi=75;
         int bas=0;
         int count=0;

         while(bas<=sayi){
             if (bas%2!=0){
                 System.out.print(bas+" ");
                 count++;

             }

             bas++;
         }
         System.out.println("");
         System.out.println("count = " + count);
     }
}
