package Day_48_constructors_static;

import java.util.Arrays;
import java.util.Scanner;

public class CybertekGroup {
    public static void main(String[] args) {
        Group group1 = new Group("Ladybug"); //dependency injection. group object

        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Elvin");
        group1.addMember("Maria");
        group1.addMember("Aziz");
        group1.addMember("Parvin");
        group1.addMember("Duraid");
        group1.addMember("Ali");

        //print all members not toString()
        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());

        Group group2 = new Group("Others");
        group2.setMembers(Arrays.asList("Mike","David", "John"));
        if(group2.getMembers().contains("John")){
            System.out.println("John is here");
        }else {
            System.out.println("John is missing");


        }

    }
}
