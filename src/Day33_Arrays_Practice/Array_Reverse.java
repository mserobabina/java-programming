package Day33_Arrays_Practice;

import java.util.Arrays;

public class Array_Reverse {
    public static void main(String[] args)   {
        int [] nums = {5,10,4,100};
        int[] numsRev = new int [nums.length];

        //reverse it

        for (int i=nums.length-1,j=0; i>=0;i--,j++){
        numsRev[j]=nums[i];

        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numsRev));

    }
}
