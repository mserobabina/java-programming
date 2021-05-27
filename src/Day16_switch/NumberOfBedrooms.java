package Day16_switch;

public class NumberOfBedrooms {
    public static void main(String[] args) {
        int NumOfBedrooms = 6;
        double price = 0.0;
        System.out.println("***** WELCOME TO BELL APARTMENTS *****");
        switch (NumOfBedrooms) {
            case 1:
                System.out.println(NumOfBedrooms + " bedrooms apartment is selected");
                price = 1200;
                break;
            case 2:
                System.out.println(NumOfBedrooms + " bedrooms apartment is selected");
                price = 1540;
                break;
            case 3:
                System.out.println(NumOfBedrooms + " bedrooms apartment is selected");
                price = 1900;
                break;
            default:
                System.out.println("I am so sorry! We do not have apartments that fit your criteria.");
                return;
        }
        System.out.println("Thank you for visiting us today. You selected "+NumOfBedrooms+" apartment that costs $"+ price);
    }
}
