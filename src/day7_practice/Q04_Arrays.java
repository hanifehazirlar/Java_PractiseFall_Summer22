package day7_practice;

import java.util.Arrays;

public class Q04_Arrays {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */
    public static void main(String[] args) {
        String cumle="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        cumle=cumle.replaceAll("\\s",""); // bosluklari kaldirdik

        String [] arr=cumle.split("");

        System.out.println(Arrays.toString(arr));//[V, e, r, i, l, e, n, b, i, r, c, u, m, l, e, d, e, k, i, b, o, s, l, u, k,
                         // l, a, r, h, a, r, i, c, c, h, a, r, a, c, t, e, r, s, a, y, i, s, i, n, i, b, u, l, u, n, u, z, .]
        System.out.println(arr.length); // 58

        // Diger cozumler
        String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        str = str.replace(" ", "");
        System.out.println("str = " + str);

        System.out.println("str.length() : "+ str.length());


        String str1 = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String kelime[] =str1.split(" ");
        int boslukSayisi = kelime.length-1;
        System.out.println("boslukSayisi = " + boslukSayisi);

        String charcter [] = str1.split("");
        System.out.println("charcter sayisi  = " + (charcter.length-boslukSayisi));

    }

}
