package OfficeHours.Arryas.Palindrome;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPali(1215121));

    }
    public static boolean isPali(int number){
        int reverse = 0;
        int temp = number; //121
        while (temp!=0){
           /* System.out.println("number %10 = "+number % 10);
            number/=10;
            System.out.println("number/10 = "+ number);
*/
            int lastDigit = temp % 10;
            reverse =(reverse*10)+lastDigit;
            temp/=10;
            System.out.println(reverse);

        }
        return reverse==number;
    }
}
