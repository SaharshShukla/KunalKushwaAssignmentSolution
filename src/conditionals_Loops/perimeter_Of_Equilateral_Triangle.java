/* 9. Perimeter Of Equilateral Triangle */
package conditionals_Loops;
import java.util.Scanner;
public class perimeter_Of_Equilateral_Triangle {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter side: ");
        int s = scn.nextInt();

        int peri_Of_Equi = 3 * s;
        System.out.println("Perimeter of equilateral triangle is: " + peri_Of_Equi);
    }
}
