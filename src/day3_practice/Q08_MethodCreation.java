package day3_practice;

import java.util.Scanner;

public class Q08_MethodCreation {
     /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
         System.out.println("lutfen istediginiz islemin sembolunu giriniz");
         String islemSembolu=scan.next();
         System.out.println("Birinci sayiyi giriniz");
         double sayi1=scan.nextDouble();
         System.out.println("Ikinci sayiyi giriniz");
         double sayi2=scan.nextDouble();

         hesapMakinesi(islemSembolu, sayi1, sayi2);
     }

    public static void hesapMakinesi(String islemSembolu, double sayi1, double sayi2) {

        if (islemSembolu.equals("+")){
            System.out.println(sayi1+" + "+sayi2+ " = "+(sayi1+sayi2));
        }else if (islemSembolu.equals("-")){
            System.out.println(sayi1+" - "+sayi2+ " = "+(sayi1-sayi2));
        }else if (islemSembolu.equals("*")) {
            System.out.println(sayi1+" * "+sayi2+ " = "+(sayi1*sayi2));
        }else if (islemSembolu.equals("/")){
            System.out.println(sayi1+" / "+sayi2+ " = "+(sayi1/sayi2));
        }
        /*
        2.çözüm
         Scanner scan = new Scanner(System.in);
        System.out.print("yapacaginiz dort islemi * + - / olarak seciniz :");
        char islem = scan.next().charAt(0);
        System.out.print("birinci sayi :");
        double num1 = scan.nextDouble();
        System.out.print("ikinci sayi :");
        double num2 = scan.nextDouble();
        hesapMakinesi(islem, num1, num2);
    }
    public static void hesapMakinesi(char islem, double num1, double num2) {
        if(islem=='+' || islem=='-' || islem=='*' || islem=='/'){
            switch (islem) {
                case '+':
                    System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                    break;
                case '-':
                    System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                    break;
                case '/':
                    System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                    break;
                case '*':
                    System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                    break;
                //    default:
                //        System.out.println("hatali islem girisi");
            }
        }else System.out.println("hatali giris");
         */
    }
}
