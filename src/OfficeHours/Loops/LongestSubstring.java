package OfficeHours.Loops;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "ffffbbbbbnjjjfjfjfjj ";
        String longestSubstring = "";
        String temp = "";
        for (int i = 0; i < str.length()-1; i++) {
            temp += str.charAt(i);
            if(i==str.length()-2){
                temp += str.charAt(i)+1;
            }

            if (str.charAt(i) != str.charAt(i + 1)) {
                if (temp.length() > longestSubstring.length()) {
                    longestSubstring = temp;
                }
                temp = "";

            }
        }
        System.out.println("The longest substring is: "+ longestSubstring);
    }

}
