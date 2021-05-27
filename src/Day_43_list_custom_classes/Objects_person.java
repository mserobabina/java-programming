package Day_43_list_custom_classes;
import java.util.Objects;
public class Objects_person {
    String firstName, email;
    int age;

    public void speak(){
        System.out.println("person is speaking");
    }
}
    class People{
        public static void main(String [] args){
         Objects_person person1 =  new Objects_person();
         person1.firstName = "Bob";
         person1.age = 33;
         person1.speak();
            System.out.println("Name "+person1.firstName);
            System.out.println("Age "+person1.age);

            Objects_person person2 =  new Objects_person();
            person2.firstName = "Mike";
            person2.age = 34;
            person2.email = "mike@fmail.com";
            System.out.println("Name "+person2.firstName);
            System.out.println("Age "+person2.age);

    }
}
