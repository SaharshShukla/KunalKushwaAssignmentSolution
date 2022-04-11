/*5.Take 2 numbers as input and print the largest number.*/
package firstJava;
import java.util.*;
public class qstFifth {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);

        System.out.println("Enter number one: ");
        int numOne =scn.nextInt();
        System.out.println("Enter number two: ");
        int numTwo =scn.nextInt();

        if(numOne > numTwo ){
            System.out.println("number one is greater ");
        }else if(numOne == numTwo){
            System.out.println("Both number are equal ");
        }else{
            System.out.println("Number two is greater than number one");
        }
    }

}

