/*      3. Area Of Rectangle Program*/
package conditionals_Loops;
import java.util.Scanner;
public class area_Of_Rectangle {
    static void base(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter area : ");
        int a = scn.nextInt();
        System.out.println("Enter length : ");
        int l = scn.nextInt();
        float b = (float) (a / l);
        System.out.println("breath of rectangle is " + l);
    }
    public static void main(String[] args){
     length();
     base();
     area();
    }
    static void area(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter length : ");
        int l = scn.nextInt();
        System.out.println("Enter breath : ");
        int b = scn.nextInt();
        int areaOfRec = l * b;
        System.out.println("Area of rectangle is " + areaOfRec);
    }

    static void length(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter area : ");
        int a = scn.nextInt();
        System.out.println("Enter breath : ");
        int b = scn.nextInt();
        float l = (float) (a / b);
        System.out.println("length of rectangle is " + l);
    }
}
/*
        4. Area Of Isosceles Triangle
        5. Area Of Parallelogram
        6. Area Of Rhombus
        7. Area Of Equilateral Triangle
        8. Perimeter Of Circle
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