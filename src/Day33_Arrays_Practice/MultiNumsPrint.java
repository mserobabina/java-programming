package Day33_Arrays_Practice;

public class MultiNumsPrint {
    public static void main(String[] args) {
        int[][]nums2D = {
                {12, 55, 4, 7},
                {123, 555, 9},
                {56,87,455,34},
                {234,12,54,23,23}
        };
        System.out.println("nums2d[2][2] - "+nums2D[2][2]);
        for(int i=0; i<nums2D.length;i++){
            for(int j=0;j<nums2D[i].length;j++){
                System.out.println(nums2D[i][j]);

            }
        }
    }
}
