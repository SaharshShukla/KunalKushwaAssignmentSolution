/*2. Area Of Triangle */
package conditionals_Loops;
import java.util.Scanner;
public class area_Of_Triangle {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter height : ");
        int h = scn.nextInt();
        System.out.println("Enter base : ");
        int b = scn.nextInt();
        float areaOfTriangle = (float) ((0.5) * ( h * b));
        System.out.println("Area of triangle is:  " + areaOfTriangle);
    }
}

