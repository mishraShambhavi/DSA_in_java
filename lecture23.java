//2D array on rect sum
// last method working properly in another class-prefixsumrectangle
import java.util.Scanner;

public class lecture23 {
    static void print2Dmatrix(int[][] matrix){
        int n= matrix.length;
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }
    
    static void rectsum2BRUTEFORCE(int[][] arr,int l1,int r1,int l2,int r2){
        int sum=0;
        for (int i=l1;i<=l2;i++){
            for (int j=r1;j<=r2;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("sum is-"+sum);
    }

    static void prefixsummatrix(int[][] arr){
        int r= arr.length;;
        int c= arr[0].length;

        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++) {
                //arr[i][0]=arr[i][0];
                arr[i][j] = arr[i][j] + arr[i][j-1];
            }
        }

    }
    static void rectsumBYrowprefixsum(int[][] arr,int l1,int r1,int l2, int r2){
        int sum=0;
        prefixsummatrix(arr);
        for(int i=l1;i<=l2;i++){
            // r1 to r2 sum for row i
            //observe we don't have to traverse on each col to find sum
            //since we made prefix sum matrix we already know the sum
            if (r1>=1)    // otherwise if r1 =0 then r1-1=out of bounds (-)index
                sum += arr[i][r2] - arr[i][r1 - 1];
            else
                sum+= arr[i][r2];  // sum from index 0 to r2 is simply sum at r2 no need to minus

        }
        System.out.println("sum-"+sum);
    }

    static void prefixsumROWandCOLwise(int[][] arr){
        int r= arr.length;;
        int c= arr[0].length;
        //traverse horizontly to cal row wise prefix sum
        for (int i=0;i< arr.length;i++){
            for (int j=1;j< arr[i].length;j++) {
                //arr[i][0]=arr[i][0];
                arr[i][j] = arr[i][j] + arr[i][j-1];
            }
        }
        //traverse vertically to cal column wise prefix sum
        for (int j=0;j< c;j++){
            for (int i=1;i< r;i++) {
                //arr[i][0]=arr[i][0];
                arr[i][j] = arr[i][j] + arr[i-1][j];
                //arr[i][j] represnts sum of rect bounded by [0][0] and [i][j]
            }
        }


    }

    static void rectsumBYrowANDcolprefixsum(int[][] arr,int l1,int r1,int l2, int r2){
        int ans=0;
        int sum=0,up=0,left=0,leftup=0;
        prefixsumROWandCOLwise(arr);

        sum=arr[l2][r2];
        if(l1>=1)
              up=arr[l1-1][r2];
        if(r1>=1)
             left=arr[l2][r1-1];
        if(l1>=1 && r1>=1)
             leftup=arr[l1-1][r1-1];
        ans = sum-up-left+leftup;
        System.out.println("sum is"+ans);



    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("taking inputs of matrix ");
        System.out.println("enter rows");
        int r = sc.nextInt();
        System.out.println("enter col");
        int c1 = sc.nextInt();
        int[][] a = new int[r][c1];

        System.out.println("enter " + r* c1 + " elements");
        for (int i = 0; i < r; i++) {                 //row
            for (int j = 0; j < c1; j++) {             //col
                a[i][j] = sc.nextInt();
            }
            // System.out.println();
        }
        System.out.println("input matrix-");
        print2Dmatrix(a);
        System.out.println("enter the first coordinates-");
        int l1= sc.nextInt();
        int r1= sc.nextInt();
        System.out.println("enter the second coordinates-");
        int l2= sc.nextInt();
        int r2= sc.nextInt();
        rectsum2BRUTEFORCE(a,l1,r1,l2,r2);
        rectsumBYrowprefixsum(a,l1,r1,l2,r2);
        rectsumBYrowANDcolprefixsum(a,l1,r1,l2,r2);
    }
}
