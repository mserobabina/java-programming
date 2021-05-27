package Day33_Arrays_Practice;
import java.util.*;
        public class Array_temp {
    public static void main(String[] args) {
        int num1=10;
        int num2=30;
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
        //swap using additional VAR:
        int temp = num1;
        num1=num2;
        num2=temp;
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);

        System.out.println("************************");
        int[]nums = {5,10,4,100};
        System.out.println("Before: "+ Arrays.toString(nums));
        for (int i =0;i<nums.length/2;i++){
            int temps = nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temps;

        }
        System.out.println("After: "+ Arrays.toString(nums));
        System.out.println("*************************************");
//swap string
        String [] words = {"java","css","python","html"};
        System.out.println("Before: "+ Arrays.toString(words));
        for(int i =0,j=words.length-1;i<words.length/2;i++,j--) {
            String tempWord = words[i];
            words[i] = words[j];
            words[j] = tempWord;
        }
            System.out.println(Arrays.toString(words));

    }
}
