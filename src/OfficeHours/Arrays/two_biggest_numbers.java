package OfficeHours.Arrays;
import java.util.*;
public class two_biggest_numbers {
    public static void main(String[] args) {
        int[] nums = {4, 3, 1, 4, 5, 2, 4, 8, 4, 8};
        int max = nums[0];
        int secondMax = nums[0];
        for (int eachNum : nums) {
            if (eachNum > max) {
                secondMax=max;
                max=eachNum;
            }

            if (eachNum > secondMax && eachNum <max){
                secondMax=eachNum;
            }

        }
        System.out.println("Max = "+max);
        System.out.println("Second Max = "+secondMax);
    }
}