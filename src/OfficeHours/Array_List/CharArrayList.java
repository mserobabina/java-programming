package OfficeHours.Array_List;

import java.util.ArrayList;
import java.util.Arrays;

public class CharArrayList {
    public static void main(String[] args) {
        String str = "ABCD1234%&%456EFG";


        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if (Character.isLetter(eachChar)) {
                letters.add(eachChar);


            } else if (Character.isDigit(eachChar)) {
                digits.add(eachChar);

            } else {
                special.add(eachChar);

            }
        }
        System.out.println("Letters" + letters);
        System.out.println(separateParts(str));
    }

    public static ArrayList<ArrayList<Character>> separateParts(String str) {
        ArrayList<ArrayList<Character>> all = new ArrayList<>();

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();
        all.add(letters);
        all.add(digits);
        all.add(special);

        // it does the same thing  all.add(new ArrayList<>());
        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);
            if (Character.isLetter(eachChar)) {
                all.get(0).add(eachChar);


            } else if (Character.isDigit(eachChar)) {
                all.get(1).add(eachChar);

            } else {
                all.get(2).add(eachChar);

            }
        }
        return all;
    }
}
