package Day_46_Encapsulation;

public class dealership {
    public static void main(String[] args) {

        car_example car1 = new car_example();
       // car1.model = "nissan altima";
        car1.setModel("nissan altima");
        System.out.println("car model is "+car1.getModel());

        car1.setYear(2015);
        System.out.println("year is "+car1.getYear());

        car1.setMillage(45);
        System.out.println("millage is "+car1.getMillage());
    }
}