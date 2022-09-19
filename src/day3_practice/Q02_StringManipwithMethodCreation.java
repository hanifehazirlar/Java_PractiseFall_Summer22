package day3_practice;

import java.util.Scanner;

public class Q02_StringManipwithMethodCreation {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bır string giriniz");
        String str = scan.nextLine().toLowerCase();

        boolean trueOrFalse=xyzvarMi(str);

        System.out.println(xyzvarMi(str));
    }

    private static boolean xyzvarMi(String str) {
        if (str.contains("xyz")) {
            return true;
        } else {
            return false;
        }


    }


}

