/* 6. Area Of Rhombus */

package conditionals_Loops;
 import  java.util.Scanner;

public class area_Of_Rhombus {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter diagonal: ");
        int d = scn.nextInt();

        float areaOfRho = ((float) (0.5 * (d * d)));
        System.out.print("Area of rhombus is: " + areaOfRho);
    }
}
