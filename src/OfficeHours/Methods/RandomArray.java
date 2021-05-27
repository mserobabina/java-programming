package OfficeHours.Methods;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {

        int [] a = getRandomIntArray(10,500);
        System.out.println(Arrays.toString(a));
        //dif way to print out
        System.out.println(Arrays.toString(getRandomIntArray(4,78)));

    }
    public static int [] getRandomIntArray(int size, int maxRandomNumber){
        Random random = new Random();
        int [] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i]= random.nextInt(maxRandomNumber+1);

        }
        return arr;
    }
}
