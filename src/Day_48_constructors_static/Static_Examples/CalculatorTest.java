package Day_48_constructors_static.Static_Examples;

public class CalculatorTest {
    public static void main(String[] args) {
        //add is static method, can be called using Classname.staticMethodName
        Calculator.add(5,3);

        //Calculator.multiply(2,4);  ERROR: multiply is not
        Calculator calcObject = new Calculator();
        calcObject.multiply(2,4);
        calcObject.add(10,67);

    }

}
