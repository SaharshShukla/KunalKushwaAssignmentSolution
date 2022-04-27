/* 26. Addition Of Two Numbers */
package conditionals_Loops;
import java.util.Scanner;

public class addition_Of_Two_Numbers {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scn.nextInt();
        System.out.println("Enter second number: ");
        int b = scn.nextInt();
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is " + sum);


    }
}
