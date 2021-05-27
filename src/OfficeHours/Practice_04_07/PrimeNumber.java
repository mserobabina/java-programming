package OfficeHours.Practice_04_07;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 50;


        for (int j =2;j<=num;j++){
            boolean isPrime = true;
            for(int i=2;i<j;i++){
                if (j%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(j+ " ");
            }
        }

    }
}
