package Day47_7_Encapsulation;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Student {
    public Student() {
        System.out.println("no-args constructor");
    }
    public Student(String name) {
            System.out.println("name with param is "+ name);

    }
    public Student (String name, int age){
        System.out.println(name + " is "+ age);
    }

}