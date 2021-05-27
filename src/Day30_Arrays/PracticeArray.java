package Day30_Arrays;

public class PracticeArray {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        int count = 0;
        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        System.out.println("-----------prices more than 100----------------");
        for (double eachPrice : prices) {
            if (eachPrice > 100.0) {
                System.out.println(eachPrice + " ");
            }

        }
        System.out.println("\n---------------prices between 10 and 70 inclusive---------------");
        for (double price : prices) {
            if (price >= 10 && price <= 70) {
                System.out.println(price);
            }
        }
        System.out.println("\n---------------prices more than 50---------------");
        for (double nprice : prices) {
            if (nprice >= 50) {
                count++;
                System.out.println(count);

            }
        }
        System.out.println("\n---------------countries with name length more than 7 inc ---------------");
        for (String country : countries) {
            if (country.length() >= 7) {

                System.out.println(country+": Length = "+ country.length());
            }
        }
    }
}