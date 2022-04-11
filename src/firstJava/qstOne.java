/*1.Write a program to print whether a number is even or odd, also take input from the user.*/
package firstJava;
import java.util.*;

public class qstOne {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num=scn.nextInt();

        if(num%2==0){
            System.out.println("Number is even ");
        }else{
            System.out.println("Number is odd");
        }
    }
}

