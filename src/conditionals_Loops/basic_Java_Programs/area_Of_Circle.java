/*
1. Area Of Circle Java Program */

package conditionals_Loops;
import java.util.Scanner;

public class area_Of_Circle {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter radius of circle:  ");
        float r = scn.nextFloat();
        float area = (float) (r*Math.PI);
        System.out.print("Area of circle is : " + area);
    }
}
