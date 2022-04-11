/*2.Take name as input and print a greeting message for that particular name.*/
package firstJava;
import java.util.*;

public class qstTwo {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scn.nextLine();
        System.out.println("Hello "+name);
    }
}

