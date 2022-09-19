package day14_practice;

import java.util.Arrays;

public class C05 {
    /* 5.SORU :
       Verilen bir integer dizisinde, içindeki sıfırların hepsini dizinin en sonuna taşıyan ve
       diğer değerlerinde sıralamasını bozmdan oluşan diziyi ekrana bastıran bir metod oluşturunuz
       Örnek :
       Input: nums = [0,1,0,3,12]
       Output: [1,3,12,0,0]
    */
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        int count1=1;
        int count2=1;
        int [] output=new int[nums.length];
        for (int i = 0; i <nums.length; i++) {
           if(nums[i] == 0) {
              output[nums.length-count1]=nums[i];
               count1++;
           }else{
              output[count2-1]=nums[i];
               count2++;
           }
        }
        System.out.println(Arrays.toString(output));

    }





}
