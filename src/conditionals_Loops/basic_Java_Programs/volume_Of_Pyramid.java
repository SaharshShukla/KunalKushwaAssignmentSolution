/* 18. Volume Of Pyramid */
package conditionals_Loops;
 import java.util.Scanner;
public class volume_Of_Pyramid {
    public static void main(String[] args){
        volOfPy();
    }

    static void volOfPy(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter length of pyramid: ");
        int l = scn.nextInt();
        System.out.println("Enter height of pyramid: ");
        int h = scn.nextInt();
        System.out.println("Enter width of pyramid: ");
        int w = scn.nextInt();

        float v = (float) ((l * w * h) / 3);
        System.out.println("Volume of pyramid is: " + v);
    }
}
