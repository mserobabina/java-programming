package Day_43_list_custom_classes;

public class Company {
    String Name, title;
    int age;

    public void responsibility() {
        System.out.println("printing");
    }
}

class Employees {
    public static void main(String[] args) {
        Company person1 = new Company();
        person1.Name = "Bob Doe";
        person1.title = "SDET";
        person1.age = 33;
        person1.responsibility();
        System.out.println("Name " + person1.Name);
        System.out.println("Age " + person1.age);
        System.out.println(person1.Name+" work as "+person1.title+".");
    }
}