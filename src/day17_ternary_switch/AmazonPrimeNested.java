package day17_ternary_switch;

import com.sun.jmx.snmp.SnmpOidTable;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class AmazonPrimeNested {
    public static void main(String[] args) {
        double price =10;
        boolean isPrimeMember = true;
        if(isPrimeMember) {
            System.out.println("Eligible for  free 2 days shipping");
        }
        else {
            if (price>=25.0){
                System.out.println("Eligible for free regular shipping");

            }else{
                System.out.println("not eligible for free shipping. Fee = $10");
            }
        }
    }
}
