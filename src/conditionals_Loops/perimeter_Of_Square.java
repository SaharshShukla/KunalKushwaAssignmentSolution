/* 12. Perimeter Of Square */
package conditionals_Loops;
import java.util.Scanner;

public class perimeter_Of_Square {
    public static void main(String[] args){
        periOfSquare();
    }

    static void periOfSquare(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter side of square: ");
        int s = scn.nextInt();

        int peri = 4 * s;
        System.out.println("Perimeter of square is: " + peri);
    }
}

