package assignment.flow_Of_Program;
import java.util.*;

public class Qst1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any year: ");
        int yr = scn.nextInt();
        if(yr % 4 == 0){
            System.out.println("Entered year is leap year");
        }else{
            System.out.println("Entered year is normal year");
        }
    }

}
/*
Create flowchart and pseudocode for the following:
1.Input a year and find whether it is a leap year or not.
*/