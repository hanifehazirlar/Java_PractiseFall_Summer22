package day8_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03_ArrayList {
    /*
     * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
     * not kisa metodlar kullamayiniz
     * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
     */
    public static void main(String[] args) {
        int [] arr={1,2,3,3,5,6,9,9};
        Arrays.sort(arr);
        int n=4;

        for (int i =arr.length-n; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //2.yontem
        // bir liste olusturalim
        List<Integer> list=new ArrayList<>();
        // listeye elemanlari ekleyelim
        for (int each:arr){
            list.add(each);
        }
        List<Integer> maxList=new ArrayList<>();
        int count=1;
        while(count<=n){
            int max=list.get(0); // list in ilk elemani max olsun
            for (int i = 0; i <list.size(); i++) {
                if (list.get(i)>max && !(maxList.contains(list.get(i)))){ // listenin herhangi bir elemani max büyükse max o elemani atar
                    max=list.get(i);
                }
            }
            maxList.add(max);
            list.remove(list.indexOf(max)); // tekrar ayni sayiya bakmamasi icin kaldirdik
            count++;
        }
        System.out.println("Array'in max "+ n + " elemani "+maxList);



    }
}
