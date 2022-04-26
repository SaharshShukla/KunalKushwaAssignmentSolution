/* 16. Volume Of Cylinder */
package conditionals_Loops;

import java.util.Scanner;

public class volume_Of_Cylinder {
    public static void main(String[] args){
        volOfCyl();
    }

    static void volOfCyl(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter radius of cylinder: ");
        float r = scn.nextFloat();
        System.out.println("Enter height of cylinder: ");
        float h = scn.nextFloat();

        float v = (float) (Math.PI * r * r * h);
        System.out.println("Volume of cylinder is: " + v);
    }
}
/*
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

