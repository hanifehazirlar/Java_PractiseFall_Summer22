package day13_interviewQuestions;

import java.util.Scanner;

public class Q01_AmstrongSayi {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit
numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
     toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        method creat ediniz
        method paremetre olarak sayi alsin
        method sayilarin kuptoplami conteiner atamasi
        girilen konteiner
        if icinde kontrol ediniz
        % kullaniniz
        basamktaki sayi bos variable olusur

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
      amstrong sayı olup olmadıgını
      gösteren program yazınız */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Amstrong sayi icin bir sayi giriniz");
        int sayi=scan.nextInt();
        amstrong(sayi);
        girilenSayiyaKadarOlanAmstrangSayilar(sayi);
    }

    private static void girilenSayiyaKadarOlanAmstrangSayilar(int sayi) {
        for (int i = 1; i <=sayi; i++) {
            amstrong(i);
        }
    }

    private static void amstrong(int sayi) {
        int sayininKuplerToplami=0;
        int basamaktakiSayi=0;
        int girilenSayi=sayi; // sayiyi sayinin kupler toplami ile kıyaslamak icin
        while(sayi>0){
            basamaktakiSayi=sayi%10; // rakam rakam ayirdik
            sayininKuplerToplami+=(basamaktakiSayi*basamaktakiSayi*basamaktakiSayi);
            sayi/=10;
        }
        if (girilenSayi==sayininKuplerToplami){
            System.out.println("girilenSayi amstrong sayidir = "+girilenSayi);
        }else{
            System.out.println("girilenSayi amstrong sayi degildir "+girilenSayi);
        }

    }
}
