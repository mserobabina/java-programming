package day10_shorthand_operators;

public class IncrementDecrementOperations {
    public static void main(String[] args) {
        int num = 40;
        num += num;
        System.out.println(num);
        num += 1;
        System.out.println(num);
        num++;
        System.out.println(num);
        num--;
        System.out.println(num);
        ++num;
        System.out.println(num);
        ++num;
        System.out.println(num);

        int LinesOfCode = 15;
        System.out.println("Lines of Code = "+LinesOfCode);
        LinesOfCode = LinesOfCode + 1;
        System.out.println(LinesOfCode);
        LinesOfCode +=LinesOfCode;
        System.out.println(LinesOfCode);
        LinesOfCode++;
        System.out.println(LinesOfCode);
        ++LinesOfCode;
        System.out.println(LinesOfCode);


    }
}
