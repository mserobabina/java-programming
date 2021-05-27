package OfficeHours.Practice_03_30;
import java.util.*;
public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int max = first;
        int min = first;
        for (int i = 0; i < 5; i++) {
            System.out.println("enter number");
            int num = input.nextInt();

            if (num > max) {
                max = num;

            }
            if (num < min) {
                min = num;
            }
            System.out.println(max);
            System.out.println(min);

        }

    }
}


