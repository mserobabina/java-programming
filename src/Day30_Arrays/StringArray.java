package Day30_Arrays;

public class StringArray {
    public static void main(String[] args) {
        String[]student =new String[5];
        student [0]="123";
        student [1]="Maria";
        student[2]="Serobabina";
        student[3]="B22";
        student[4]="703-485-7591";
        String[] student1 = {"1234","Aria","Gonzales","Batch 21","123-456-7788"};
        if (student1.length==6) {
            System.out.println("pass");

        } else {
            System.out.println("do not pass");
        }
        System.out.println("Length: "+ student1.length);
        System.out.println(student1[1].toUpperCase()+ " "+student1[2].toUpperCase());

        String mobilNum=student[4];
        System.out.println(mobilNum.length());
        System.out.println();

    }
}
