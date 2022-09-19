package day14_practice;

import java.util.Arrays;

public class C01 {
    public static void main(String[] args) {
        /*

       Integer olarak artan değerler şeklinde verilen dizinin elemanlarının karesini alıp yine artan
       değerlerde ekrana yazdıran metod oluşturunuz

       Örnek :

       Input: nums = [-4,-1,0,3,10]
       Output: [0,1,9,16,100]
 */
        int[] nums = {-4, -1, 0, 3, 10};
        //1.yol
        //System.out.println("SortedArray ile : "+Arrays.toString(sortedArray(nums)));

        //2.yol
        sortedArrayFunctional(nums); // Lambda Expression ile : [0, 1, 9, 16, 100]

    }

    public static void sortedArrayFunctional(int[] nums) {

      int[] num2=Arrays.stream(nums).map(t->t*t).sorted().toArray();
        System.out.print("Lambda Expression ile : "+Arrays.toString(num2));
    }

    public static int[] sortedArray(int [] nums) {

        for (int i = 0; i <nums.length; i++) {
          nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
       return nums;
    }
}
