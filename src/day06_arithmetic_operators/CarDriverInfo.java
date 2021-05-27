package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "Lexus";
        String driverName = "Maria Serobabina";
        String licenceNumber = "6799738832";
        char driverClass = 'C';
        boolean insurance = true;
        short speed = 65;

        System.out.println("Car Model:" + carModel);
        System.out.println("Driver's Name:" + driverName);
        System.out.println("License Number: " + licenceNumber);
        System.out.println("Driver's Class: " + driverClass);
        System.out.println("Insurance: " + insurance);
        System.out.println(driverName + " is driving " + carModel);
        System.out.println("Speed: " + speed);
        System.out.println(driverName + " is driving " + carModel + " with the current speed of " + speed + " miles per hour.yes");
        System.err.println("Does car have an insurance " + insurance);





    }

}