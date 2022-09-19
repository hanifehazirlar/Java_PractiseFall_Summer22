package day5_practice;

public class Q04_MetCreationForLoop {


		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */
        public static void main(String[] args) {
            String str="Hanife";
            tersineCevir(str);
            System.out.println(tersineCevir(str));

        }

   public static String tersineCevir(String str) {
            String tersStr="";
       for (int i =1; i <=str.length(); i++) {
           tersStr+=str.charAt(str.length()-i);
       }
       return tersStr;
    }

}
