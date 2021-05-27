package OfficeHours.Practice_03_31;

public class ForLoopsJava {
    public static void main(String[] args) {
        String str = "java is fun, java";
        int count = 0;
        /*
        while (str.contains("java")) {
            count++;
             str=str.replace("java","");}
            System.out.println("java was found " + count + " times");

        }
   */
        for (int i = 0; i < str.length() - 3; i++) {
            String eachFourLetters = str.substring(i, i + 4);
           // System.out.println(eachFourLetters);
            if(eachFourLetters.equals("java")){
                count++;}
            }
        System.out.println("Java was found "+count+" times");

    }
}

