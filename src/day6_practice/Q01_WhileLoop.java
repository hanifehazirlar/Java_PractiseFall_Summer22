package day6_practice;

public class Q01_WhileLoop {

    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.
    public static void main(String[] args) {
        int sayi=8965;
        int temp=sayi;
        int toplam=0;

        while(sayi>0){
            toplam+=sayi%10;
            sayi/=10;

        }
        System.out.println(temp+" Sayisinin Basamaklarindaki Rakamlarin Toplami = " + toplam);
    }

}
