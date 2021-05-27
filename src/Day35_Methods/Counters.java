package Day35_Methods;

public class Counters {
    public static void main(String[] args) {

       count(5);
        count(9);
        count(13);
        count(17);
        int num = 100;
        count(num);
        String word = "java";
        count(word.length());
        printAge(1985);
    }
    public static void count(int num){
        for(int i = 0; i<=num; i++)

      System.out.println(i+" ");
    }

    public static void printAge(int year){
        int age = 2021-year;
        System.out.println("************************************");
        System.out.println("Year of birth: "+year+". Age: "+age);
    }
}
