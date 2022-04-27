/* 19. Curved Surface Area Of Cylinder */
package conditionals_Loops;
import java.util.Scanner;

public class curved_Surface_Area_Of_Cylinder {
    public static void main(String[] args){
        csa();
    }

    static void csa(){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter radius of cylinder: ");
        float r = scn.nextFloat();
        System.out.println("Enter height of cylinder: ");
        float h = scn.nextFloat();

         float curvedSurfaceArea = (float) ( 2 * Math.PI * r * h);
         System.out.println("Curved surface of cylinder is: " + curvedSurfaceArea);
    }
}
