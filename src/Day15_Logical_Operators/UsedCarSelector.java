package Day15_Logical_Operators;


public class UsedCarSelector {
    public static void main(String[] args) {

        double budget = 5000.0;
        String model = "Toyota";
        double carPrice = 4999.0;

        if (carPrice <= budget && (model.equals("Toyota") || model.equals("Honda"))) {
            System.out.println("Ready to purchase = " + model + ", price = " + carPrice);
        }else{
            System.out.println("Keep searching!");
        }
    }
}