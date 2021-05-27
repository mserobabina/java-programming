package Day_38_Methods;
import static Day_38_Methods.StringUtils.*;
public class StringUtilsTest {
    public static void main(String[] args) {
        String userName = " ";
        if (StringUtils.isNullOrEmpty(userName)) {
            System.out.println("fail");
        }
        System.out.println("isPalinrome(civic) = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(Cybertek) = " + isPalindrome("Cybertek"));

        String word = "java";
      //  String reWord = StringUtils.reverse(word);
        System.out.println("word: "+word);
       // System.out.println("reword"+reWord);
        }
}
