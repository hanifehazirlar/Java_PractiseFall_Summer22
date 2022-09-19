package day13_interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_Fibonacci {
    /*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
 */
    public static void main(String[] args) {
        List<Integer> fibonacciList = new ArrayList<Integer>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Fibonacci dizisi hangi sayiya kadar devam etsin");
        int sayi =scan.nextInt();
        fibonacciList.add(0);
        fibonacciList.add(1);
        System.out.println("fibonacciList = "+fibonacciList);
        int i=0; // bu i 'yi while sartini olusturmak icin kullandik
        if (sayi<=1){
            System.out.println("daha buyuk sayilar gir");
        }else{
            while (fibonacciList.get(i)+fibonacciList.get(i+1)<sayi){// fibonacci elemanlari sayidan kucuk oldugu surece1
                fibonacciList.add(fibonacciList.get(i)+fibonacciList.get(i+1));
                i++;
            }
        }
        System.out.println("fibonacci list: " + fibonacciList);
    }

}
