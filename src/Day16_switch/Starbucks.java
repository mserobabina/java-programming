package Day16_switch;

public class Starbucks {
    public static void main(String[] args) {
        String size = "big";
        double price = 0.0;
        int calories = 0;
        switch(size){
            case "Tall":
            System.out.println("Tall cappuccino , please!");
            price = 2.5;
            calories=90;
            break;
            case "Venti":
                System.out.println("Venti cappuccino , please!");
                price = 3.5;
                calories=95;
                break;
            case "Grande":
                System.out.println("Grande cappuccino , please!");
                price = 3.85;
                calories=100;
                break;
            default:
                System.out.println("I am so sorry! We do not serve this size.");


        }
        System.out.println("Total price is $"+ price +" of "+size +" cappuccino which has nutritional value of "+calories+" calories.");
    }
}
