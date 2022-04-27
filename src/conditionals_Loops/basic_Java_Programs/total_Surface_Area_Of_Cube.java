/* 20. Total Surface Area Of Cube */
package conditionals_Loops;
import java.util.Scanner;

public class total_Surface_Area_Of_Cube {
    public static void main(String[] args){
        tsa();
    }

    static void tsa(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter edge of cube: ");
        int a = scn.nextInt();
        int totalSurfaceArea = 6 * a * a;
        System.out.println("total surface area of cube is: " + totalSurfaceArea);
    }
}
