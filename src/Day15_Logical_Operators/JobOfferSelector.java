package Day15_Logical_Operators;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location= "Tysons corner";
        boolean isRemote = true;
        double salary = 130_000;
        boolean benefits = true;

        if (location.equals("Tysons corner") && isRemote &  salary >= 130_000 && benefits) {
            System.out.println("Sounds like a great job at " + location+ " Take it!");
        }else{
            System.out.println("Keep searching for opportunities!");
        }
    }
}
