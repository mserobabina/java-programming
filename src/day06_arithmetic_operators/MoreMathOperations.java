package day06_arithmetic_operators;

public class MoreMathOperations {
    public static void main(String[] args){
        int toyotas = 431;
        int hondas  = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;

        int CarsOnParkingLot = toyotas+hondas+vw+tesla+nissan+bmw;
        System.out.println("There are "+ CarsOnParkingLot + " cars on the parking lot.");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices/people;
        System.out.println("There are " + slices/people + " slices per person.");
        // there are 2 slices per person

        System.out.println("We ordered a " + pizza + " pizza with " + slices + " slices, " + people +" people ate " + slicesPerPerson + " slices each.");

    }

}
