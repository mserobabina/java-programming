package Day15_Logical_Operators;

public class citySelection {
    public static void main(String[] args) {
        String c1 = "Moscow";
        String c2 = "LA";
        if (c1.equals("Moscow") || c2.equals("LA")) {
            System.out.println("Willing to relocate");
        } else {
            System.out.println("I 'd rather stay here");
        }

        String t1 = "Nadir";
        String t2 = "Murodil";

        if (t1.equals("Saim") && t2.equals("Murodil")) {
            System.out.println("Our instructors at Cybertek " + t1 + " and " + t2);

        } else {
            System.out.println("Not taking classes");
        }


        String company = "Google";
        double salary = 85.000;
        if (company.equals("Google") && salary < 85.000) {
            System.out.println("Accept the offer");
        }else{
        System.out.println("Not accepting the offer");
    }
}


    }