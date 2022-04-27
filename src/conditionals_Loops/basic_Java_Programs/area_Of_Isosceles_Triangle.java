/* 4. Area Of Isosceles Triangle */
package conditionals_Loops;
import java.util.Scanner;
public class area_Of_Isosceles_Triangle {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter side One : ");
        int a = scn.nextInt();
        System.out.print("Enter side Two : ");
        int b = scn.nextInt();
        System.out.print("Enter side Three : ");
        int c = scn.nextInt();

        float s = (float)((a + b + c) / (0.5));
        float areaOfIsoTri = (float) Math.sqrt(s *(( s - a) *(s - b) * (s - c)) );
        System.out.print("are of isosceles triangle is : " + areaOfIsoTri);

    }
}
