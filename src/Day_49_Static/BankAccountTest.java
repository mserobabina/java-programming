package Day_49_Static;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount husband =new BankAccount();
        husband.user = "Mike";
        husband.showBalance();
        husband.spend(100.00);
        husband.showBalance();

        BankAccount wife = new BankAccount();
        wife.user = "Anna";
        wife.showBalance();
        wife.spend(400);
        wife.showBalance();
        husband.showBalance();
        System.out.println("WHat happened to BA? $"+BankAccount.balance);
    }

}
