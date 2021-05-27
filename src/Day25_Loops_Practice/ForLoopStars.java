package Day25_Loops_Practice;

public class ForLoopStars {
    public static void main(String[] args) {
     /*   for (int stars = 10; stars<=20; --stars) {
            System.out.print("\uD83C\uDF1F ");

      */
        System.out.println();
            String myStars = "";
            //for lop: fill 5 stars to myStars var;
            for (int star =1; star<=5; star++){
                myStars +="* ";



            }
            System.out.println("My stars \uD83C\uDF1F = "+ myStars.trim());
        }
    }

