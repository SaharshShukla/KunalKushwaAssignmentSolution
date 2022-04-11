/*7.To calculate Fibonacci Series up to n numbers.*/
package firstJava;
import java.util.*;
public class qstSeventh {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);

        System.out.println("Enter value of n: ");
        int n= scn.nextInt();
        int a = 0;
        int b = 1;
        for(int i=1 ; i<=n ; i++){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;



        }
    }

}
