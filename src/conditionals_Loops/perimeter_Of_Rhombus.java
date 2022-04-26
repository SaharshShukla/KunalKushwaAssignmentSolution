/*13. Perimeter Of Rhombus */
package conditionals_Loops;

import java.util.Scanner;

public class perimeter_Of_Rhombus {
    public static void main(String[] args){
        periOfRhombus();
    }
    static void periOfRhombus(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter side of Rhombus: ");
        int s = scn.nextInt();

        int peri = 4 * s;
        System.out.println("Perimeter of Rhombus is: " + peri);
    }
}
