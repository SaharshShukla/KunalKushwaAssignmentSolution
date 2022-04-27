/* 16. Volume Of Cylinder */
package conditionals_Loops;

import java.util.Scanner;

public class volume_Of_Cylinder {
    public static void main(String[] args){
        volOfCyl();
    }

    static void volOfCyl(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter radius of cylinder: ");
        float r = scn.nextFloat();
        System.out.println("Enter height of cylinder: ");
        float h = scn.nextFloat();

        float v = (float) (Math.PI * r * r * h);
        System.out.println("Volume of cylinder is: " + v);
    }
}

