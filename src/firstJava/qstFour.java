/*4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions).*/
package firstJava;
import java.util.*;

public class qstFour {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number one: ");
        int numOne = scn.nextInt();
        System.out.println("Enter number two: ");
        int numTwo = scn.nextInt();
        System.out.println("Enter operator: ");
        char ch = scn.next().charAt(0);

        if(ch =='+'){
            int sum = numOne + numTwo;
            System.out.println("Sum is: "+sum);
        }else if(ch == '-'){
            int diff = numOne - numTwo;
            System.out.println("Difference is "+diff);
        }else if(ch == '*'){
            int prod = numOne * numTwo;
            System.out.println("Product is "+ prod);
        }else{
            float div = (float) numOne / numTwo;
            System.out.println("Divide is "+div);
        }

    }



}

