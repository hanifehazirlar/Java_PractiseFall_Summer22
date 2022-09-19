package day3_practice;

import java.util.Scanner;

public class Q04_StringManipulastion {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String str= scanner.next();

        if(str.length()<3){
            System.out.println("Uc veya ucten uzun bir kelime giriniz");
        } else if (str.length()%2!=0 && str.length()>=3){
            System.out.println(str.substring(str.length()/2,str.length()/2+1));
        }
    }
}
