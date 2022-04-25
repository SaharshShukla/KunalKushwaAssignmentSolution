/* 8. Perimeter Of Circle */
package conditionals_Loops;
import java.util.Scanner;

public class perimeter_Of_Circle {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        float r = scn.nextFloat();

        float peri_Of_Circle = (float) ((2 * Math.PI * r));
        System.out.println("Perimeter of circle is: " + peri_Of_Circle);
    }
}

/*

        9. Perimeter Of Equilateral Triangle
        10. Perimeter Of Parallelogram
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

