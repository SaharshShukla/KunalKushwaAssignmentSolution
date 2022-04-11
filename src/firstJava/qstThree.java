/*3.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.*/
package firstJava;
import java.util.*;

public class qstThree {
    public static void main(String[] args){

        Scanner scn =new Scanner(System.in);
        System.out.println("Enter principal: ");
        int principal =scn.nextInt();
        System.out.println("Enter rate: ");
        int rate = scn.nextInt();
        System.out.println("Enter time: ");
        int time = scn.nextInt();

        float simpleInterest = (float) (principal*rate*time)/100;
        System.out.println("Simple Interest is "+simpleInterest);
    }
}

