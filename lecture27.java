//RECURSION
import java.util.Scanner;

public class lecture27 {

    static void printIncreasing(int n){ // 1,2,3,4....n
        if(n==1){
            System.out.print("1");
            return;
        }
        printIncreasing(n-1);   //1 ,2 ,3 ,4 .....n-1
        System.out.print(" "+n);

    }
    static void printdecreasing(int n){ // 5,4,3,2,1
        //base case
        if(n==1){
            System.out.print(" 1");
            return;
        }
        //self
        System.out.println(" "+n); //5
        //recursive work
        printdecreasing(n-1);   //4,3,2,1




    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("to print n natural numbers using recursion, what is n?");
        int n = sc.nextInt();
        //printIncreasing(n);
        printdecreasing(n);


    }
    
}
