package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("Cars on parking lot " + cars);
        cars = cars + 2;
        System.out.println("Cars on parking lot " + cars);

        cars+=5;
        System.out.println("Cars on parking lot " + cars);
        cars-=5;
        System.out.println("Cars on parking lot " + cars);
        cars*=5;
        System.out.println("Cars on parking lot " + cars);
        cars/=6;
        System.out.println("Cars on parking lot " + cars);
        cars %=6;
        System.out.println("Cars on parking lot " + cars);

        int electriccars = 13;
        cars = cars+electriccars;
        System.out.println(cars);
        cars += electriccars;
        System.out.println(cars);

        String word = "Java";
        System.out.println("word = " + word);

        word = word + " programming";
        System.out.println("word = " + word);
        word+= word;
        System.out.println("is programming " + word);

        char letter = 'A';
        System.out.println("letter " + letter);
        letter+=3;
        System.out.println("letter " + letter);
        //add 'J' to letter
        letter+= 1;
        System.out.println("letter " + letter);

        double parkingFee = 7.50;
        parkingFee =0 ;
        System.out.println("Parking is free on the weekend " + parkingFee);

        int count = 3;
        count+=1;
        System.out.println(count);



    }
}
