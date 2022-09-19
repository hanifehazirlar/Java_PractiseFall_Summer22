package day7_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayList {

    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<String> liste=new ArrayList<>();
        Random rnd=new Random();
        String kullaniciIsmiBosluksuz="";
        int sayi;

        do {
            System.out.println("Kullanici ismi giriniz");
            String kullaniciIsmi=scan.nextLine();
            System.out.println("programi sonlandirmak icin x'e basiniz");

            kullaniciIsmiBosluksuz=kullaniciIsmi.replaceAll("\\s","");
            sayi=rnd.nextInt(1000);
            if (!kullaniciIsmi.equalsIgnoreCase("x")){

            if (!liste.contains(kullaniciIsmi)){
                liste.add(kullaniciIsmiBosluksuz);
            }else{
                liste.add(kullaniciIsmiBosluksuz+sayi);

            }
            }

        }while(!kullaniciIsmiBosluksuz.equalsIgnoreCase("x"));
        System.out.println(liste);

    }

}
