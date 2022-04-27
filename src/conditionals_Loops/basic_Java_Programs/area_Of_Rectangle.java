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
