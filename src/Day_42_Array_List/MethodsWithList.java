package Day_42_Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java");words.add("html");words.add("css");words.add("selenium");
        printStrList(words);
        printStrList(Arrays.asList("select","options","br","hr"));
        System.out.println(sumIntegerList(Arrays.asList(2,4,5,7)));
    }
    public static void printStrList(List<String> stringList){
        for(String str:stringList){
            System.out.print(str+" ");


        }
        System.out.println();
    }
    public static int sumIntegerList(List<Integer> integerList){
        int sum =0;
        for(int i : integerList){
            sum+=i;

        }
        return sum;
    }

}
