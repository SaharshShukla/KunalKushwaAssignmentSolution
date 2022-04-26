/* 15. Volume Of Prism*/
package conditionals_Loops;
import java.util.Scanner;

public class volume_Of_Prism {

    static void volOfPrism(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter base of prism: ");
        int b = scn.nextInt();
        System.out.println("Enter height of prism: ");
        int h = scn.nextInt();
        int v = b * h;
        System.out.println("Volume of prism is: " + v);

    }

    public static void main(String[] args){
        volOfPrism();
    }
}



