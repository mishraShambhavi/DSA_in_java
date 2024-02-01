//RECURSION
import java.util.Scanner;

public class lecture28 {

    static int factorial(int n) { //n=5
        //base case
        if (n == 0) {
            return 1;
        }
        //smaller subproblem
        int smallfact = factorial(n - 1); // will give factorial 4 ans =24
        //self work
        int ans = smallfact * n;
        System.out.println(ans);
        return ans;

    }

    static int fibonacciSeries(int n) {
        //base case
        if (n == 0 || n == 1) {
            return n;     // or add two if statements
        }
        //two smaller subproblems
        int pre = fibonacciSeries(n - 1);
        int preKApre = fibonacciSeries(n - 2);
        //self work - addition
        return pre + preKApre;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n= sc.nextInt();

//       System.out.println(factorial(4));   // gives direct answer
//        System.out.println(fibonacciSeries(5));   //direct answer
//       System.out.println(fibonacciSeries(n));
        // to print till n F-series
        for (int i=0;i<=n;i++){
            System.out.println(fibonacciSeries(i));
        }



    }
}
