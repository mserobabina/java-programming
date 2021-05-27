package Day24_Loops;

public class LoopAlphabet {
    public static void main(String[] args) {
        char letter = 'Z';
      //  System.out.println("Letter = "+letter);
      //  letter++;
       // System.out.println("Letter = " +letter);
        while (letter>='A'){
            System.out.print(letter+" ");
            --letter;
        }
        System.out.println("\nGood alphabet practice");
    }
}
