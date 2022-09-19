package day13_interviewQuestions;

public class Q02_TersKelime {
      /*
      // Stringi ters cevirmek icin bir Java Programi yazin
      //1.Yol: StringBuilder () kullanarak
      //2.Yol: String Classini kullanarak
      //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
        */
      public static void main(String[] args) {
          String input="All is well";

          System.out.print( "1.Yol: StringBuilder");
          StringBuilder sb = new StringBuilder(input);
          System.out.println("TersInput : "+sb.reverse());

          System.out.print("2.Yol: String");

          System.out.print("tersInput : ");
          for (int i = input.length()-1; i >=0; i--) {
              System.out.print(input.charAt(i));

          }
          System.out.println();
          System.out.print("3.Yol: String");
          tersCevirmeMethodu(input);
      }
    private static void tersCevirmeMethodu(String input) {
        System.out.print("tersCevirmeMethodu ile tersInput : ");
        for (int i = input.length()-1; i >=0; i--) {
            System.out.print(input.substring(i, i+1));

        }

    }

}
