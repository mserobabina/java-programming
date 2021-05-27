package Day_44_Objects;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type);
        animal.eat("grass");
        animal.speak("their own language.");


        Animal cheetahObj = new Animal();
        cheetahObj.type = "some animal";
        System.out.println(cheetahObj.type);
        cheetahObj.eat("meat");
    }
}