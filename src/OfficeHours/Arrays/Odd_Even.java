package OfficeHours.Arrays;
import java.util.*;
public class Odd_Even {
    public static void main(String[] args) {
        int[] arr = {2, 4, 15, 57, 23, 44};
        int even = 0;
        int odd = 0;
        for (int each : arr) {

            if (each % 2 == 0) { // each%2 !=0
                even++;


            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("*******************************");


        int[] evenNum = new int[even];
        int[] oddNum = new int[odd];
        //i keeps track of the indexes in arr array,
        // e keeps track of the indexes in evenNum
        //o keeps track of the indexes in oddNum

        for (int i = 0, e = 0, o = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNum[e++] = arr[i];
                // e++;

            } else {
                oddNum[o++] = arr[i];
                //     o++;
            }

        }
            System.out.println("Even: " + Arrays.toString(evenNum));
            System.out.println("Odd: " + Arrays.toString(oddNum));
        }
    }

