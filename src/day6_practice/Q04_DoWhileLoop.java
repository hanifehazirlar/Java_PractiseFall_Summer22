package day6_practice;

import java.util.Scanner;

public class Q04_DoWhileLoop {
     /*
		Ask user to enter a word. If the word has odd number of characters
		 and has 3 or more characters,
		 print the character in the middle of the word.
		 the word has even number of character print "You entered wrong word."
		     INPUT      :   celik
		     OUTPUT 	:   l
		     INPUT      :   elif
		     OUTPUT 	:   You entered wrong word.*/
     public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);

         String word="";
         do {
             System.out.println("Lutfen bir kelime giriniz");
             word=scan.next();
             if(word.length()<3){
                 System.out.println("girilen word 3 karakterden az");
             }else if (word.length()%2==1) {
                 System.out.println("ortadaki karakter : "+word.charAt(word.length()/2));

             }else{
                 System.out.println("yanlis kelime girdiniz");
             }

         }while(!(word.length()%2==1));

     }
}

