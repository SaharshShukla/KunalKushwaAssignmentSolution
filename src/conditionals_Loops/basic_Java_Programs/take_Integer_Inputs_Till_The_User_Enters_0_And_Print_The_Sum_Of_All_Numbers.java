/* 24. Take integer inputs till the user enters 0 and print the sum of all numbers
        (HINT: while loop)*/

package conditionals_Loops;
import java.util.Scanner;

public class take_Integer_Inputs_Till_The_User_Enters_0_And_Print_The_Sum_Of_All_Numbers {
    public static void main(String[] args){
        logic();
    }

    static void logic(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scn.nextInt();
        int sum = 0;
        while(n != 0){
            sum += n;
            System.out.println("Enter number: ");
            n = scn.nextInt();
        }

        System.out.println("Sum of number is: " + sum);
    }
}
