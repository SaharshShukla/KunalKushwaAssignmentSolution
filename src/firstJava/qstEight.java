/*8.To find out whether the given String is Palindrome or not.*/
package firstJava;
import java.util.*;
public class qstEight {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = scn.nextLine();

        boolean result = isPalindrome(str);
        System.out.println("Given string is palindrome  "+result);
    }
    static boolean isPalindrome(String str){
         int start = 0;
         int end = str.length()-1;
         boolean flag = false;

         while(start < end ){
             if(str.charAt(start) == str.charAt(end)){
                flag = true;
             }
             start++;
             end--;
         }
         return flag;
    }
}
