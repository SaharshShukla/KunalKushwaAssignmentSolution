/* 17. Volume Of Sphere */
package conditionals_Loops;
 import java.util.Scanner;

public class volume_Of_Sphere {
    public static void main(String[] args){
        volOfSphere();
    }

    static void volOfSphere(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter radius of sphere: ");
        float r = scn.nextFloat();
        float vol = (float) ((4 / 3) * ( Math.PI * r * r *r));
        System.out.println("Volume of sphere is: " + vol);
    }
}

