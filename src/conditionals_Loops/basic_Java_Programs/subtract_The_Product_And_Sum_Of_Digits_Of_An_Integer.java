/* 22. [Subtract the Product and Sum of Digits of an Integer]
(https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)*/
package conditionals_Loops;


public class subtract_The_Product_And_Sum_Of_Digits_Of_An_Integer {

    static int product(int n){
        int pro = 1;
        while(n != 0){
            int digit = n % 10;
            pro *= digit;
            n = n / 10;
        }

        return pro;
    }


    public static void main(String[] args){

        int n = 234;
        int resultOne = sum(n);
        int resultTwo = product(n);
        int result = resultTwo - resultOne;
        System.out.println("result is: " + result);

        n = 4421;
        resultOne = sum(n);
        resultTwo = product(n);
        result = resultTwo - resultOne;
        System.out.println("result is: " + result);

    }

    static int sum(int n){
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        return sum;
    }
}


/*
Example 1:

Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
Example 2:

Input: n = 4421
Output: 21
Explanation:
Product of digits = 4 * 4 * 2 * 1 = 32
Sum of digits = 4 + 4 + 2 + 1 = 11
Result = 32 - 11 = 21
 */
