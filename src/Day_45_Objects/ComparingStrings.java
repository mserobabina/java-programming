package Day_45_Objects;

import com.sun.xml.internal.bind.v2.TODO;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "java";
        String word3 = new String("java"); //created a new object in Heap, outside String pool
        String word4 = new String("java");


        //TODO checking if its in String pool , if not creating
        System.out.println(word1 == word2);//false
        System.err.println(word1 == word3);//true
        System.out.println(word3 == word4);


        //TODO compares values
        System.out.println(word1.equals(word2));
        System.out.println(word1.equals(word3));
    }
}
