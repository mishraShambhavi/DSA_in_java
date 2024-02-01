//*spiral questions in 2D array
import java.util.Scanner;
public class lecture22 {
     static void print2Dmatrix(int[][] matrix){
         int n= matrix.length;
         for(int i =0;i<matrix.length;i++){
             for(int j=0;j<matrix[i].length;j++){
                 System.out.print(" "+matrix[i][j]);
             }
             System.out.println();
         }
     }
     static void spiral(int[][] matrix,int r, int c){
         int toprow=0,bottomrow=r-1,leftcol=0,rightcol=c-1;
         int totalelements=0;

         while (totalelements<r*c){
             //top row-> leftcol to rightcol
             for (int j=leftcol;j<=rightcol && totalelements<r*c ;j++){
                 System.out.print(matrix[toprow][j]);
                 totalelements++;
             }
             toprow++;  //sol to repeated element print

             //rightcol-> toprow to bottomrow
             for (int i=toprow;i<=bottomrow && totalelements<r*c;i++){
                 System.out.print(matrix[i][rightcol]);
                 totalelements++;
             }
             rightcol--;   //sol to repeated element print

             //bottomrow-> rightcol to leftcol
             for (int j=rightcol;j>=leftcol && totalelements<r*c;j--){
                 System.out.print(matrix[bottomrow][j]);
                 totalelements++;
             }
             bottomrow--;   //sol to repeated element print

             //leftcol-> bottomrow to toprow
             for (int i=bottomrow;i>=toprow && totalelements<r*c;i--){
                 System.out.print(matrix[i][leftcol]);
                 totalelements++;
             }
             leftcol++;   //sol to repeated element print

         }

     }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("taking inputs of matrix ");
        System.out.println("enter rows");
        int r1 = sc.nextInt();
        System.out.println("enter col");
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];

        System.out.println("enter " + r1* c1 + " elements");
        for (int i = 0; i < r1; i++) {                 //row
            for (int j = 0; j < c1; j++) {             //col
                a[i][j] = sc.nextInt();
            }
            // System.out.println();
        }
        System.out.println("input matrix-");
        print2Dmatrix(a);
         System.out.println("spiral matrix");
         spiral(a,r1,c1);

    }
}
