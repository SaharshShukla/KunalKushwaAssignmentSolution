/*14. Volume Of Cone Java Program*/
package conditionals_Loops;
import java.util.Scanner;

public class volume_Of_Cone {

    static void volOfCone(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter radius of cone: ");
        float r = scn.nextFloat();
        System.out.println("Enter height of cone: ");
        float h = scn.nextFloat();

        float vol = (float) ((Math.PI * r * r * h) / 3);
        System.out.println("Volume of cone is : " + vol);
    }

    public static void main(String[] args) {
        volOfCone();
    }
}
