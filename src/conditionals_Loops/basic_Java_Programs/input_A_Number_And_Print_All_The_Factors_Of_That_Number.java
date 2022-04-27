/*  23. Input a number and print all the factors of that number (use loops).*/
package conditionals_Loops;
import java.util.Scanner;

public class input_A_Number_And_Print_All_The_Factors_Of_That_Number {
    public static void main(String[] args){
        primeFactor();
    }

    static void primeFactor(){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number to find prime factor: ");
        int num = scn.nextInt();

        for( int div = 2; div * div <= num; div++){
            while( num % div == 0){
                num = num / div;
                System.out.println(div + " ");
            }
        }

            if(num != 1){
                System.out.println(num);
            }

    }
}

