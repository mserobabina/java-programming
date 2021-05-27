package OfficeHours.Practice.Nested;

public class Nested {
    public static void main(String[] args){
        String citizenship="USA";
        boolean resident=true;
        int age =18;
        boolean hasDiploma = true;
        if(citizenship.equalsIgnoreCase("USA") || resident){
            if (age>=18 && age<=35){
                if(hasDiploma){
                    System.out.println("You must have a high school diploma");
                }

            }else {
                System.out.println("Your age must be between 18 and 35");
            }




        }else{
            System.out.println("You must be a US citizen or resident");
        }
        System.out.println("Have a good day!");
    }
}
