/*5.Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.*/
package assignment.flow_Of_Program;
import java.util.*;
public class Qst5 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int sum=0;
        do {
            System.out.println("Enter number: ");
            int num=scn.nextInt();
            sum=sum+num;
           char ch=scn.next().charAt(0);
            if(ch=='x'){
                System.out.println(sum);
               break;
            }
        }while(1<2);

    }
}
