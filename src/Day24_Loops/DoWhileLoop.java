package Day24_Loops;

public class DoWhileLoop {
    public static void main(String[] args) {
      //reverse
        int counter=10;
        do {
            System.out.println("Counter " + counter);
            counter--;
        } while (counter>=1);

        //regular
        int count=1;
        do {
            System.out.println("count " + count);
            count++;
        }while(count<=5);
        // every 5 th condition
        counter+=5;

    }
}
