package Day32_array_split;
import java.util.*;
public class SplitArray {
    public static void main(String[] args) {
        String words = "java cat python cat selenium cat html";
        String[]wordsArray = words.split("cat");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("Length of Array is : " + wordsArray.length);

        for (String each: wordsArray){
            System.out.println(each);
        }
        String sentence = "today I am coding java arrays";
        String [] wordsinSent =sentence.split(" ");
        System.out.println("first word "+wordsinSent[0]);
        System.out.println("first word "+sentence.split(" ")[0]);
        System.out.println("number of words in sentence = "+ wordsinSent.length);




    }
}
