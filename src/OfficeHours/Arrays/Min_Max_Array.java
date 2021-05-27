package OfficeHours.Arrays;

public class Min_Max_Array {
    public static void main(String[] args) {
        int[]arr = {2,3,45,6,78,25,38};
        int min=arr[0];
        int max=arr[0];
        for(int each : arr) {
            //each->every element
            if (each < min) {
                min = each;

            }
            if (each > max) {
                max = each;
            }
        }
            System.out.println("Min: "+min);
            System.out.println("Max"+max);
        }


    }

