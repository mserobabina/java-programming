package Day_48_constructors_static;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1);//print with default value
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);
        Customer cs2 = new Customer("Mike", 2);//create objects and assighn value
        Customer cs3 = new Customer("John", 4829);
        System.out.println(cs2);
        System.out.println(cs3);

        Customer[] todayCustomer = {cs1, cs2, cs3, new Customer("Bashir", 34)};
        List<Customer> customerList = new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        customerList.add(new Customer("Bashir", 34));
        customerList.add(new Customer("Maria", 1111));
        //print info of first customer object in array and arrayList
        System.out.println(todayCustomer[0].toString());
        System.out.println(customerList.get(0).toString());
        System.out.println(customerList);
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));

        }
        System.out.println("---------FOR EACH LOOP---------");
        for (Customer eachcustomer : customerList) {
            System.out.println(eachcustomer);
        }

        System.out.println("-------NAMES-------");
        for (Customer customer : customerList) {
            for (Customer eachcustomer : customerList) {
                System.out.println(eachcustomer);
                System.out.println(eachcustomer.getName());
            }

        }
    }}
