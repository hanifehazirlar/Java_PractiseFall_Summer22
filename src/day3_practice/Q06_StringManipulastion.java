package day3_practice;

import java.util.Scanner;

public class Q06_StringManipulastion {

    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str=scan.nextLine();
        if(str.contains(" ")){
            System.out.println("Bosluk vardır");
        }else{
            System.out.println("Bosluk yoktur");
        }
        if (str.isEmpty()) {
            System.out.println("String bostur");
        }else{
            System.out.println("String bos degildir");
        }
    }
}
