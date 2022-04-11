/*6.Input currency in rupees and output in USD.*/
package firstJava;
import java.util.*;
public class qstSixth {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter currency in indian rupee: ");
        float rupee = scn.nextInt();
         float exchange =  conversion(rupee);
         System.out.println("Currency exchange from indian rupee to usd is $ "+exchange);
    }
    static  float conversion(float rupee){
        float usd = rupee * 0.013f;
        return usd;
    }
}
