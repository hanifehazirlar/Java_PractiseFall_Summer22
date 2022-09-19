package day15;

public class ReverseString {
    public static void main(String[] args) {
        String name = "temel oluyorm"; // O(n) -- > O(n/2)
        System.out.println(reverse(name));

    }

    public static String reverse(String name) {
        String str2 = "";
       /* 1.yol ( daha yavas )
        String[] str = name.split("") ;
        for(int i=str.length-1; i >=0 ; i-- ) {
            str2 = str2 + str[i];
        }
        */

       // 2.yol ( daha hızlı)
       String[] str = name.split("") ;
       //String tmp = "";
       for(int i =0; i< str.length; i++) {
           String start = str[i] ;
           String end = str[str.length-(i+1)];
           // if(start==end) break;   --> bu kısıma gerek yok
           // tmp=start;
           start=end;

           str2= str2 + start ;

       }
       return str2 ;

    }
}
