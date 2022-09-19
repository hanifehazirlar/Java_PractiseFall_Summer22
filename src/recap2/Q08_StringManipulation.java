package recap2;

import java.util.Locale;
import java.util.Scanner;

public class Q08_StringManipulation {
    /*
     * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
     * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
     *
     * ornek
     * input = Ali
     * output = lilili
     *
     * input = el
     * output = el
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=scan.nextLine().toLowerCase(Locale.forLanguageTag("Tr"));

        if (kelime.length()>=3){
            String sonIkiHarf=kelime.substring(kelime.length()-2);
            System.out.println(sonIkiHarf+sonIkiHarf+sonIkiHarf);
        }else System.out.println(kelime);

        // 2.cozum
        if (kelime.length()>=3){
            String sonIkiHarf=kelime.substring(kelime.length()-2);
            System.out.println(sonIkiHarf.concat(sonIkiHarf.concat(sonIkiHarf)));
        }else System.out.println(kelime);



    }

}
