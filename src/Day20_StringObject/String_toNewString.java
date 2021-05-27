package Day20_StringObject;

import java.lang.*;
import java.util.*;

public class String_toNewString {
    public static void main(String[] args) {
        /*
        String word1 ="imac";
        String word2 = new String("macbook");
        System.out.println("Hello world");
        */

        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length()==0);
        if (jobTitle.isEmpty()){
            System.out.println("Job title is missing");}
            else{
            System.out.println("job title: "+ jobTitle);

            }
        if (jobTitle.length()==0)    {
            System.out.println("Job title is empty");
        }
        System.out.println(jobTitle.equals(""));
        if("".equals(jobTitle)){
            System.out.println("Job title is empty");
        }
        else {
            System.out.println("JT is not empty");}


        String word =" ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie = "carrots";
        if(!veggie.isEmpty()){
            System.out.println("veggie");
        }
        }
        }



