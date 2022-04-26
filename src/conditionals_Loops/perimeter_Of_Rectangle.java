/*11. Perimeter Of Rectangle */
package conditionals_Loops;
import java.util.Scanner;

public class perimeter_Of_Rectangle {
    public static void main(String[] args){
        peri();
    }

    static void peri(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length: ");
        int l = scn.nextInt();
        System.out.println("Enter breath: ");
        int b = scn.nextInt();
        int peri_Of_Rec = 2 * (l * b);
        System.out.println("Perimeter of rectangle is: " + peri_Of_Rec);
    }
}
