package day5_practice;

import java.util.Scanner;

public class Q01_ForLoop {

    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
    1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
    Sesli harfler: a,e,i,o,u

    Test Data:
    a
    Beklenen Çıktı:
    a harfi sesli harfdir.
    Test Data:
    d
    Beklenen Çıktı:
    d harfi sesiz harftir.
    Test Data:
    we  yada  %
    Beklenen Çıktı:
    Yanlis karakter girdiniz!

    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        String harf=scan.next().toLowerCase();
        String sadeceHarf=harf.replaceAll("\\w","");
        String sayilar="0123456789";

        if (harf.length()!=1){
            System.out.println("Yanlis karakter girdiniz");
        }else if (!sadeceHarf.isEmpty()){
            System.out.println("Yanlis karakter girdiniz");

        }else if (sayilar.contains(harf)) {
            System.out.println("Yanlis karakter girdiniz" );
        }else{
            char tekHarf=harf.charAt(0);
            int sesliHarf=0;
            int sessizHarf=0;
            for (char i = 'a'; i <= 'z'; i++) {
                if (tekHarf=='a'||tekHarf=='e'||tekHarf=='i'|| tekHarf=='o'|| tekHarf=='u') {
                    sesliHarf++;
                }else{
                    sessizHarf++;
                }
                if (sesliHarf==1){
                    System.out.println(tekHarf+" harfi sesli harfdir.");
                }
                if (sessizHarf==1){
                    System.out.println(tekHarf+" harfi sessiz harftir.");
                }
            }
        }
        String sesli="aeiuo";
        String sessiz="qwrtypsdfghjklzxcvbnm";
        if (harf.length()>1){
            System.out.println("yalnizca bir HARF giriniz");
        } else if (sesli.contains(harf)) {
            System.out.println("girdiginiz garf sesli bir harftir");
        } else if (sessiz.contains(harf)) {
            System.out.println("Girdiginiz harf sessiz bir harftir");
        }else{
            System.out.println("yanlis karakter girdiniz");
        }


    }
}


