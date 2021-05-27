package Day_43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MethodsWithListReturn {
    public static void main(String[] args) {
       long start= System.nanoTime();
        List<Integer> mlnNums=getIntegerList();
       // System.out.println(mlnNums);
      //  int [] arr = getIntegerArray();
        long end = System.nanoTime();
        System.out.println(("ArrayList time = "+(end-start)));
        System.out.println(getRandomList(10));


        long st= System.nanoTime();
        int [] arr = getIntegerArray();
        long en = System.nanoTime();
        System.out.println(("Array time = "+(en-st)));
    }
        public static List<Integer> getIntegerList(){
        List <Integer> nums = new ArrayList<>();
        for(int i=0;i<=1000000;i++){
            nums.add(i);
        }
            return nums;

        }
        public static int[] getIntegerArray(){
        int[] nums = new int [1_000_001];
        for(int i=0; i<=1_000_000;i++){
            nums[i]=i;
        }
        return nums;
        }
        public static List<Integer> getRandomList(int size){
            Random random = new Random();
            List<Integer> nums = new ArrayList<>();
            for (int i = 0; i<=size;i++){
                nums.add(random.nextInt(101));

            }
           // System.out.println(getRandomList(101));
            return nums;
        }
}
