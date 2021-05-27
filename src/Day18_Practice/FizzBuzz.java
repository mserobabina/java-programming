package Day18_Practice;

public class FizzBuzz {
    public static void main(String[] args) {
        int num=15;
        if (num%3==0 && num%5 ==0){
            System.out.println(num+ " - FIZZBUZZ");
        }
        else if (num%3==0){
            System.out.println(num+ " - FIZZ");
        }
        else if (num%5==0){
            System.out.println(num + " - BUZZ");
        }
    }
}
