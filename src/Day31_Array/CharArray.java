package Day31_Array;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a'};
        for (char each : letters) {
            System.out.print(each + " ");
        }
        String sentence = new String(letters);
        System.out.println("\nSENTENCE = " + sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length = " + item.length());


        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        String fruitStr = "";
        for (String fruit : fruits) {
            System.out.print(fruit + " - ");
            fruitStr +=fruit+ " - ";
           System.out.print("\nfruitStr"+fruitStr);
            //System.out.print("\n" + fruits[fruits.length-1] + " - ");

            String [] lang = {"java", "javascript", "R","SQL"};
            System.out.println("\n"+String.join(" ",lang));

        }
    }
}
