package OfficeHours.Practice_03_03_2021;

public class Stage1Calculator {
    public static void main(String[] args) {
        double numOne = 5.0;
        double numTwo = 10.0;
        double addition = numOne + numTwo;
        double substruction = numOne - numTwo;
        double multiplication = numOne * numTwo;
        double division = numOne / numTwo;
        double remainder = numOne % numTwo;

        System.out.println("Calculation for " + numOne + " & " + numTwo);
        System.out.println(numOne + " + " + numTwo + " = " + addition);
        System.out.println(numOne + " - " + numTwo + " = " + substruction);
        System.out.println(numOne + " * " + numTwo + " = " + multiplication);


    }
}
