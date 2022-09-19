package day14_practice;

import java.util.Arrays;

public class C02 {
    /*

    Bir array , integer bir "k" değeri ve eşik değeri olarakda integer "thereshold" değeri verilecek, "k" boyutunda
    ve elemanlarının ortalaması eşik değerinden büyük veya ona eşit olan kaç adet alt-dizilerin olduğunu ve
    bu alt dizileri ekrana yazdıran bir metod oluşturunuz.
    Not: yeni oluşacak elemanlar, ilk diziden seçilirken arka arkaya sıralı gelmeli.

    Örnek :

    Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold(eşik) = 4
    Output: 3

 */
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        System.out.println("numOSubArrays(arr,k,threshold) = " + numOSubArrays(arr, k, threshold));

    }
    public static int numOSubArrays(int[]arr, int k, int threshold){
        int[] arr2=new int[k];
        int sum=0;
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-(k-1)) break;
            System.arraycopy(arr,i,arr2,0,k);
            for (int j = 0; j <k; j++) {
                sum+=arr2[j];
            }
              if (sum/k>=threshold){
                  count++;
                  System.out.println(Arrays.toString(arr2));

              }
              sum=0;

              }
        return count;



    }
}
