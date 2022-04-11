/*4.Take 2 numbers as inputs and find their HCF and LCM.*/

package assignment.flow_Of_Program;
import java.util.*;
public class Qst4 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter number one: ");
        int numOne=scn.nextInt();
        System.out.println("Enter number two: ");
        int numTwo=scn.nextInt();
        int orgNumOne=numOne;
        int orgNumTwo=numTwo;
        while(numOne%numTwo!=0){
            int rem=numOne%numTwo;
            numOne=numOne;
            numTwo=rem;
        }
        int hcf=numTwo;
        int lcm=(orgNumOne*orgNumTwo)/hcf;
        System.out.println("Hcf is "+hcf+" \n"+"Lcm is "+lcm);
    }
}
