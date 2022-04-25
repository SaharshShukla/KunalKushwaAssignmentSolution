/* 5. Area Of Parallelogram */
package conditionals_Loops;
import java.util.Scanner;

public class area_Of_Parallelogram {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter base: ");
        int b = scn.nextInt();
        System.out.println("Enter height: ");
        int h = scn.nextInt();

        int areaOfPara =   b * h;
        System.out.println("Area of parallelogram is : " + areaOfPara);
    }
}
