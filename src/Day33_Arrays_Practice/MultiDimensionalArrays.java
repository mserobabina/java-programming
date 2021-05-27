package Day33_Arrays_Practice;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        String[][] users = new String[3][2];
        users[0][0]="Maria";
        users[0][1]="Maria's Pswd";
        users[1][0]="Sam";
        users[1][1]="Sam's Pswd";
        String[][] userData = {{"Maria", "Maria's Pswd"},
                                 {"Sam", "Sam's Pswd"}};
        System.out.println(userData[0][0]+" + "+ userData[1][0]);

    }
}
