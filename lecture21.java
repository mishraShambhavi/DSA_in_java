//transpose,rotate,pascal matrix -2D array
import java.util.Scanner;

public class lecture21 {
    static void print2Darray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {         //row
            //           System.out.println(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {  //col
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] transposeMatrix(int[][] arr,int r,int c){
        int ans[][]=new int[c][r];
        for (int i = 0; i < c; i++) {         //row
            for (int j = 0; j < r; j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }

    static void transposeMatrixINPLACE(int[][] arr,int r,int c){
        //input is only square matrix
        for (int i = 0; i < c; i++) {         //row
            for (int j = i; j < r; j++){
                int temp=arr[i][j];   //swap(a[i][j] , a[j][i])
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

    }
    static void reverseArr(int[] arr){
        int i =0, j= arr.length-1;
        while (i<j) {
            int temp = arr[i];   //swap(a[i][j] , a[j][i])
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    static void rotateMatrix(int[][] arr,int r,int c) {
        //transpose
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        //reverse array in transpose matrix
        for (int i=0;i<r;i++) {     // r or c since it is a square matrix r=c
            reverseArr(arr[i]);
        }
    }

    static int[][] pascal(int n){
        int ans[][]=new int[n][];  //rows=n, col is not fixed

        for (int i=0;i<n;i++){
        ans[i]=new int[i+1];  //3rd property
            //above shows i'th row will have how many cols
        ans[i][0]=1;          //2nd property
        ans[i][i]=1;

        for (int j=1;j<i;j++){
            ans[i][j]=ans[i-1][j]+ans[i-1][j-1];   //1st property
        }
        }
        return ans;

    }



    public static void main(String[] args) {
        //*transpose
//        Scanner sc = new Scanner(System.in);
//        System.out.println("taking inputs of matrix 1");
//        System.out.println("enter rows");
//        int r1 = sc.nextInt();
//        System.out.println("enter col");
//        int c1 = sc.nextInt();
//        int[][] a = new int[r1][c1];
//
//        System.out.println("enter " + r1* c1 + " elements");
//        for (int i = 0; i < r1; i++) {                 //row
//            for (int j = 0; j < c1; j++) {             //col
//                a[i][j] = sc.nextInt();
//            }
//            // System.out.println();
//        }
//        System.out.println("input matrix-");
//        print2Darray(a);
//        System.out.println("transpose matrix");
//        int[][] ans= transposeMatrix(a,r1,c1);
//        print2Darray(ans);
//        //inplace
//        transposeMatrixINPLACE(a,r1,c1);
//        print2Darray(a);

        //*Rotation matrix
//        rotateMatrix(a,r1,c1);
//        System.out.println("rotation matrix-");
//        print2Darray(a);

        //* pascal 2d array
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n-");
        int n=sc.nextInt();
        int[][] ans=pascal(n);
        print2Darray(ans);

    }
}
