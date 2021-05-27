package Day33_Arrays_Practice;
import java.util.*;
public class Array_Print {
    public static void main(String[] args) {
        String word = "java1sql2html3css4tableau";
        String[] strArr = word.split("\\d");
        System.out.println(Arrays.toString(strArr));
        word = word.replaceAll("\\d","-");
        System.out.println(word);


    }
}
