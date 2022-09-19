package day14_practice;

import java.util.Scanner;

public class C03 {
    /* 3.SORU :
    Kullanıcıdan 2 sayı girmesini isteyeceğiz, girilen bu değerlerden biri saati diğeri de dakikayı temsil edecek.
    bize akrep ile yelkovan arasındaki küçük açıyı hesaplayıp değeri açısal olarak döndüren metodu yazınız
    Örnek :
    input : hour : 12,  minutes : 30
    Output: 165
   *///yelkovan 2 dakika ilerleyince, akrep 1 dakika ilerler

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen saat girisi yapiniz");
        int saat=scan.nextInt();
        System.out.println("Lutfen dakika girisi yapiniz");
        double dakika=scan.nextInt();
        double aciFarki;
        if (saat==12){
            aciFarki=dakika*6-(dakika/2);
        }else{
            aciFarki=dakika*6-(dakika/2+saat*30);
        }
        if (aciFarki<180) {
            System.out.println(aciFarki);
        }else System.out.println(360-aciFarki);
    }

}
