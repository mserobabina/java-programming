package Day26_UsingLoops;

public class ForLoopString {
    public static void main(String[] args) {
        //reverse
        String word = "I will become SDET";
        for (int i = 17; i >= 0; i--) {
            System.out.println(i + " - " + word.charAt(i));}
            //normal
            String word1 = "I will become SDET";
            for (int i = 0; i < word1.length()-1; i++) {
                System.out.println(i+ " - " + word1.charAt(i));
                System.out.println(i+ " - " + word1.charAt(i+1));
                if(word1.charAt(i)==word1.charAt(i+1)){
                    System.out.print(" BEEP - "+word1.charAt(i)+word1.charAt(i+1));
                }

            }
        }
    }
