/* 8. Perimeter Of Circle */
package conditionals_Loops;
import java.util.Scanner;

public class perimeter_Of_Circle {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        float r = scn.nextFloat();

        float peri_Of_Circle = (float) ((2 * Math.PI * r));
        System.out.println("Perimeter of circle is: " + peri_Of_Circle);
    }
}


