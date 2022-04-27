/* 10. Perimeter Of Parallelogram */
package conditionals_Loops;
import java.util.Scanner;

public class perimeter_Of_Parallelogram {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first side: ");
        int a = scn.nextInt();
        System.out.println("Enter second side: ");
        int b = scn.nextInt();

        int peri_Of_Para = 2 * (a + b);
        System.out.println("Perimeter of parallelogram is: " + peri_Of_Para);
    }
}

