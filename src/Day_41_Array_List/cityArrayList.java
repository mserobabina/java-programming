package Day_41_Array_List;
import java.util.*;
public class cityArrayList {
    public static void main(String[] args) {
        //declare
        ArrayList <String> cities = new ArrayList<>();
        cities.add("Washington DC");
        cities.add("New York");
        cities.add("LA");
        cities.add("Volgograd");
        cities.add(0,"Arlington");
        System.out.println(cities);
        //first city
        System.out.println("First city: "+cities.get(0));
        //last city
        System.out.println("Last city: "+cities.get(cities.size()-1));
        int size = cities.size();
        System.out.println("there are "+size+" cities in the list");
        //for loop and print all values in same lines
        for(int i=0;i<cities.size();i++){
            System.out.println(cities.get(i)+" ");
        }
        System.out.println();
        //for each loop;
        for(String city:cities){
            System.out.println(cities+" ");
        }
        //remove using index
        cities.remove(4);
        System.out.println(cities);
        //remove all value from list
        System.out.println("+++++------------+++++-------------+++++");
        cities.clear();
        System.out.println(cities);
        if(cities.isEmpty());
        System.out.println("list is empty");
        //check size
        if (cities.size()==0){
            System.out.println("true");
        }


    }
}
