/* 7. Area Of Equilateral Triangle */
package conditionals_Loops;
import java.util.Scanner;

public class area_Of_Equilateral_Triangle {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter side: ");
        int s = scn.nextInt();

        float area_Of_Equi = (float) (((Math.sqrt(3)) / 4) * (s * s));
        System.out.println("Area of equilateral triangle is:  " + area_Of_Equi);
    }
}

