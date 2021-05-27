package Day22_StringManipulation;

public class IndexOf {
    public static void main(String[] args) {
        String technologies = "java , html, css, selenium, testing, maven, cucumber";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index "+indexOfJava);

        int indOfCss=technologies.indexOf("css");
        System.out.println("css index "+ indOfCss);

        int indOfsql=technologies.indexOf("sql");
        System.out.println("sql"+indOfsql);

        if (technologies.indexOf("maven")>1) {
            System.out.println("maven is present");
        }
        else {
                System.out.println("its not there");
            }
    }
}
