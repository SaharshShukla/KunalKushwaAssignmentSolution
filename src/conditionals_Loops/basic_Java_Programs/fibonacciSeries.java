/* 21. Fibonacci Series In Java Programs */
package conditionals_Loops;

public class fibonacciSeries {

    static void fibo(){
        int a = 0;
        int b = 1;
        for( int i = 1; i <= 10; i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

    }
    public static void main(String[] args){
        fibo();
    }
}


