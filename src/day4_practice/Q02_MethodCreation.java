package day4_practice;

public class Q02_MethodCreation {
      /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */
      public static void main(String[] args) {

          double centiMeter=100;
          convertSm(centiMeter); //convert=donusturmek
      }

    public static void convertSm(double centiMeter) {
         double meter=centiMeter/100;
         double kiloMeter=meter/1000;
        System.out.println(centiMeter+" cm = "+meter+" m = "+kiloMeter+" km");
    }
}
