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
/*
        11. Perimeter Of Rectangle
        12. Perimeter Of Square
        13. Perimeter Of Rhombus
        14. Volume Of Cone Java Program
        15. Volume Of Prism
        16. Volume Of Cylinder
        17. Volume Of Sphere
        18. Volume Of Pyramid
        19. Curved Surface Area Of Cylinder
        20. Total Surface Area Of Cube
        21. Fibonacci Series In Java Programs
        22. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
        23. Input a number and print all the factors of that number (use loops).
        24. Take integer inputs till the user enters 0 and print the sum of all numbers
        (HINT: while loop)
        25. Take integer inputs till the user enters 0 and print the largest number from
        all.
        26. Addition Of Two Numbers
        */

