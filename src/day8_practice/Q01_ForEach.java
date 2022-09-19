package day8_practice;

public class Q01_ForEach {

    // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
    // verilen array de once cift olan sayilari, sonra da tek olan sayilari for each loop kullanarak yazdiriniz..
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        String ciftSayilar="";
        String tekSayilar="";
        for (int each:arr) {
            if (each % 2 == 0) {
                ciftSayilar += each+" ";
            } else {
                tekSayilar += each+" ";
            }
        }
        System.out.println("Cift Sayilar : " + ciftSayilar);
        System.out.println("Tek Sayilar : " +tekSayilar);
    }
}
