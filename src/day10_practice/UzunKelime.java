package day10_practice;

import java.util.Scanner;

public class UzunKelime {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle=scan.nextLine();
        enUzunKelime(cumle);
        System.out.println("enUzunKelime() = " + enUzunKelime(cumle));

        // ben bugun javayi daha cok sevdim ama cok zorlandım
    }

    public static String enUzunKelime(String cumle) {
        String [] arr=cumle.split(" ");
        String enUzunKelime="";
        for (int i = 0; i <arr.length; i++) {
            if (arr[i].length()>enUzunKelime.length()){
               enUzunKelime=arr[i];
            }
        }
        return enUzunKelime;

    }
}
