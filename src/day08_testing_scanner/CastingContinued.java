package day08_testing_scanner;

import sun.awt.geom.AreaOp;

import javax.lang.model.SourceVersion;
import java.sql.SQLOutput;

public class CastingContinued {
    public static void main(String[] args) {

        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        long num4 = num2;
        float num5 = 124.4f;
        double num7 = num5;
        System.out.println(num2);


        int num10 = 20;
        byte num11 = (byte)num10;
        short num12 = (short)num10;
        System.out.println(num11);
        System.out.println(num12);
        System.out.println();

        char letter = 'm';
        byte numLetter = (byte)letter;
        System.out.println(numLetter);


    }
}
