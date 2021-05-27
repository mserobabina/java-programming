package OfficeHours.StringManipulation;

public class StringPrefix {
    public static void main(String[] args) {
        String str = "abXYabc";
        int n = 1;
        String prefix = str.substring(0,n);
        String remaining = str.substring(n);
        System.out.println(remaining.contains(prefix));

    }
}
