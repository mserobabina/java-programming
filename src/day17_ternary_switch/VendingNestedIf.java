package day17_ternary_switch;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack";
        String snackItem = "chips";
        String drinkItem = "tea";

        if (selection.equals("drink")) {
            System.out.println("drink option is selected");
            if (drinkItem.equals("tea")) {

            } else {
                System.out.println("coke item is selected");
            }

        } else if (selection.equals("snack")) {
            System.out.println("snack option is selected");
            if (snackItem.equals("chips")) {

            } else {
                System.out.println("chips item is selected");
            }
        }
    }
}

