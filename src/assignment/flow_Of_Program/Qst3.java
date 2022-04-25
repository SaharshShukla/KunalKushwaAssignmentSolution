/*3.Take a number as input and print the multiplication table for it.*/

package assignment.flow_Of_Program;
import java.util.*;
public class Qst3 {
    public static void main(String args[]){
       Scanner scn = new Scanner(System.in);
       System.out.println("Enter any number: ");
       int num = scn.nextInt();
       for(int i = 1; i <= 10; i++){
           System.out.println(num+" * "+i+" = "+num*i);
       }
    }
}
