package OfficeHours.Practice_04_07;

public class CamelCase {
    public static void main(String[] args) {
        String str = "thisHasManyWordsToFind";
        int words=1;
        for (int i=0; i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                words++;

            }
        }
        System.out.println("Word: "+words);
    }
}
