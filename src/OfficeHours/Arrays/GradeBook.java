package OfficeHours.Arrays;
import java.util.*;
public class GradeBook {
    public static void main(String[] args) {
        String [] names = {"Aria", "Maria", "Laura"};
        int [] scores = {90,76,80};
        char[] grades = new char[names.length];
     //   System.out.println(Arrays.toString(names));
        for (int i=0;i<scores.length;i++){
            int eachScores = scores[i];
            int eachScore = scores[i];
            if (eachScore>=85){
                grades[i]='A';

            }else if (eachScore>=75){
                grades[i]='B';
            }else if (eachScore>=65) {
                grades[i] = 'C';
            }else{
                grades[i]='D';

            }

        }
        System.out.println("GRADEBOOK");
        for(int i= 0; i<names.length;i++){

            System.out.println(names[i]+" | "+scores[i]+" | "+grades[i]);
        }
    }
}
