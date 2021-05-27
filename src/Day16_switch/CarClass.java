package Day16_switch;

public class CarClass {
    public static void main(String[] args) {
        String make = "Honda";
        String model = "A";
        double price = 0.0;

        /*
        if (make.equals("Mercedes") && model.equals("E")){
        price = 500.0;}
        else if(make.equals("Mercedes") && model.equals("A")){
            price=400.0;



        if(make.equals("Mercedes")){
            if (model.equals("E")) {
                price = 500.0;
            } else if (model.equals("A")){
                price=400.0;

            }
        }
*/
        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                price = 500.0;
            } else if (model.equals("A")) {
                price = 400.0;}

        }else {
            System.out.println("Invalid entry "+ make);
            return;
        }


                System.out.println("make " + make);
                System.out.println("model " + model);
                System.out.println("price " + price);
            }
        }
