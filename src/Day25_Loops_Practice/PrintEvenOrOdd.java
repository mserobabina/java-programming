package Day25_Loops_Practice;

public class PrintEvenOrOdd {
    public static void main(String[] args) {
        for (int n= 1; n<=50; n++){
            if(n % 2 ==0) {
                System.out.println(n+" is even number");
            }
            else if (n%2 !=0){
                System.out.print(n+" is odd number ");
            }
        }
    }

}
