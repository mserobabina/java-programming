package OfficeHours.Arrays;
import java.util.*;
public class Short_Long_WordInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many words ypu wish to Enter: ");
        String [] words = new String[input.nextInt()];
// input.nextLine();
        for (int i = 0; i< words.length;i++){
            System.out.println("enter word: "+(i+1));
            words[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(words));

        String[] shortAndLarge = {words[0],words[0]};

        for(String eachWord: words){
            if(eachWord.length() < shortAndLarge[0].length()){
                shortAndLarge[0]=eachWord;
            }
            if (eachWord.length()> shortAndLarge[1].length()){
                shortAndLarge[1]=eachWord;

            }
        }
        System.out.println("Shortest element: "+ shortAndLarge[0]);
        System.out.println("Largest element: "+ shortAndLarge[1]);
        System.out.println(Arrays.toString(shortAndLarge));


    }
}
