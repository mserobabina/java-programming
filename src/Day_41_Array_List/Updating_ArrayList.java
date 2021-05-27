package Day_41_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Updating_ArrayList {
    public static void main(String[] args) {
        //car list
        List <String> myCars = new ArrayList<>();
        myCars.add("mazda");
        myCars.add("honda");
        myCars.add("toyota");
        myCars.add("Lexus");
        myCars.add("bmw");
        myCars.add(0,"tesla");
        myCars.add(1,"audi");
        System.out.println(myCars.toString());
        String allCarsInString = myCars.toString();
        System.out.println(myCars);

        //change index 0 to lamborghini
        myCars.set(0,"Lamborghini");
        System.out.println(myCars.toString());
        myCars.set(4,"volkswagen");
        System.out.println(myCars);

        //find index # of bmw
        System.out.println(myCars.indexOf("bmw")+ " - index of bmw");
        System.out.println("______________________________________");
        System.out.println(myCars.add("toyota"));
        int toyotaIndex = myCars.indexOf("toyota");
        System.out.println("Index for Toyota: "+toyotaIndex);

        myCars.set(toyotaIndex,"Jiguli");
        System.out.println(myCars);

       // myCars.set(myCars.indexOf("ford","bugatti");
        System.out.println(myCars);
        for (int i = 0;i<myCars.size();i++){
            if(myCars.get(i).equals("lamborghini")){
               // myCars.contains("lamborghini");
                myCars.set((i),"prius");

            }else if(myCars.get(i).equals("lada")){
                myCars.set((i),"civic");
            }
        }
        System.out.println(myCars);
    }
}
