package Day21_String_Manipulations;

import java.util.Locale;

public class StringReplacePractice {
    public static void main(String[] args) {
      /*  String platform = "Github";
        System.out.println(platform.toUpperCase().replace("hub","lab"));
        platform=platform.replace("hub","lab");
        System.out.println(platform);



        String sentence = "java is fun";
        System.out.println(sentence.replace(" ",""));

        sentence = sentence.replace("java", "selenium").replace("fun","lots of fun");
        System.out.println(sentence);


        String result= "1-48 of over 4000 results for java book";
        result= result.replace("1-48 of over ", "").replace(" results for java book", "");
        System.out.println("result "+result);


        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));



        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        */

        String company = "Cybertek";
       // System.out.println(company.charAt(1));
        char first = company.charAt((0));
        char second = company.charAt((1));
        char third = company.charAt((2));
        char fourth = company.charAt((3));
        char fifth = company.charAt((4));
        char sixth = company.charAt((5));
        char seventh = company.charAt((6));
        char eighth = company.charAt((7));
        System.out.println(first +" "+ second+" " +third+" "+fourth+" "+fifth+" " +sixth+" " +seventh+" " +eighth);
        String withSpace = first +" "+ second+" " +third+" "+fourth+" "+fifth+" " +sixth+" " +seventh+" " +eighth;
        System.out.println("with space: " +withSpace);

    }
}
