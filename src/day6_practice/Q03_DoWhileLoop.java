package day6_practice;

import java.util.Scanner;

public class Q03_DoWhileLoop {

      /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          String harf="";
          do {

              System.out.println("Bir ifade giriniz");
               harf=scan.next();
              System.out.println("Program calisiyor");

          }while(!harf.equalsIgnoreCase("x"));
          System.out.println("Program bitti");


      }
}
