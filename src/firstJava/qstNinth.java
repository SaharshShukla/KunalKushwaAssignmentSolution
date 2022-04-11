/*9.To find Armstrong Number .*/
package firstJava;
import java.util.*;
public class qstNinth {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter  starting number : ");
        int numOne = scn.nextInt();
        int tmpOne = numOne;
        int tmpTwo = numOne;
        int armNum = 0, noOfDigit = 0;
        int rem = 0;

            while(tmpOne > 0){
                tmpOne = tmpOne / 10;
                noOfDigit++;
            }
            while(tmpTwo > 0 ){
                rem = tmpTwo % 10;
                int prod = 1;
                for( int j = 1; j <= noOfDigit; j++){
                    prod = prod * rem;
                }
                armNum = armNum + prod;
                tmpTwo = tmpTwo / 10;
            }
            if(numOne == armNum){
                System.out.println(numOne + " Number is armstrong Number");
            }else{
                System.out.println(numOne + " Number is not armstrong Number");
            }
    }
}
