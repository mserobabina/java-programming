package OfficeHours.StringManipulation;

public class SandwitchInTheMiddle {
    public static void main(String[] args) {
        String str= "breadjambread";
        if(str.contains("bread")){
            int firstBread = str.indexOf("bread");
            if (str.substring(firstBread+5).contains("bread"));
            System.out.println("2 bread");
        }else{
            System.out.println("nothing");
        }
    }
}
