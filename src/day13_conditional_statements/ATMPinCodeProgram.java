package day13_conditional_statements;

public class ATMPinCodeProgram {
    public static void main(String[] args){
        System.out.println("******WELCOME TO TD BANK******");
        int secretPin = 1234;
        int inputPin = 1234;
        if(secretPin==inputPin) {
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, check your balance, deposit.");
        }else{
            System.out.println("Incorrect pincode! " + inputPin);
            System.out.println("Please try again!");
        }
    }
}
