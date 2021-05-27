package Day_40_Practice;
import java.util.*;
public class Anagram2 {
    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
            char[] word1Convert = word1.replace(" ", "").toUpperCase().toCharArray();
            char[] word2Convert = word2.replace(" ", "").toUpperCase().toCharArray();

            Arrays.sort(word1Convert);
            Arrays.sort(word2Convert);


            return Arrays.equals(word1Convert, word2Convert);
        }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));

    }
}
