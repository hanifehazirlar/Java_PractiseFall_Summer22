package day6_practice;

import java.util.Arrays;

public class Q05_Arrays {
    	/*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
        public static void main(String[] args) {
            int [] numbers={2,6,4,5,8,9};
            int [] sum=new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i]*=numbers[i];

            }
            System.out.println(Arrays.toString(numbers)); // [4, 36, 16, 25, 64, 81]

        }

}
