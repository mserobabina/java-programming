package Day34_Void_Methods;

public class EtsySearch {
    public static void main(String[] args) {
        System.out.println("***** Starting Etsy Search *****");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();

    }

    public static void openBrowser() {
        System.out.println("1. Launching Chrome Browser");

    }

    public static void verifyResultsAreDisplayed() {
        System.out.println("4. Verify");
    }

    public static void navigateToEtsyUrl() {
        System.out.println("2. Navigate");

    }

    public static void searchForWoodenSpoon() {
        System.out.println("3. Search");
    }

   // public static void verifyResultsAreDisplayed() {
     //   System.out.println("4. Verify");
    }



