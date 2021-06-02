package Day_49_Static;

public class BankAccount {
    static double balance = 500.0;
    String user = "Asher";

    public void spend(double amount){
        System.out.println(user+" is spending $"+amount);
        balance-=amount;
    }
    public void showBalance(){
        System.out.println("Current balance = $"+balance);



    }

}
