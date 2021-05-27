package Day27_Loops;

public class IndexOf {
    public static void main(String[] args) {

        String word = "github";
        char letter = 't';
        int index=-1;
        for(int n=0;n<word.length();n++){
            System.out.println(n+" - "+word.charAt(n));
            if (word.charAt(n)==letter){
                index =n;
                System.out.println(letter+ " is found at index "+index);
               break;
              //  return;
            }
        }
            if(index==-1){
                System.out.println();
                System.out.println(letter +" is not presented");}
            else {
                System.out.println("it was found");

}
    }
}
