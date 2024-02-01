//addition , multiplication of array
import java.util.Scanner;

public class lecture20 {

    static void print2Darray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {         //row
            //           System.out.println(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {  //col
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void add(int[][] a, int r1,int c1,int[][] b, int r2,int c2){
        if (r1!=r2 || c1!=c2){ // || means any one of the condition is true
            System.out.println("wrong input- give same order array matrices ");
            return; //execution of whole method would terminate
        }
        int[][] sum=new int[r1][c1]; //or r2,c2 size
        for (int i = 0; i < r1; i++) {                 //row
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("sum matrix is-");
        print2Darray(sum);
    }

    static void mul(int[][] a, int r1,int c1,int[][] b, int r2,int c2) {
        if (c1 != r2) {
            System.out.println("wrong dimension input retry!");
            return;
        }
        int[][] mul = new int[r1][c2];
        //traversing mul
        for (int i = 0; i < r1; i++) {                 //row
            for (int j = 0; j < c2; j++) {       //col
                for (int k = 0; k < c1; k++) {   //c1 0r r2
                    mul[i][j] += (a[i][k] * b[k][j]);
                }

            }
        }
        System.out.println("multiplication is-");
        print2Darray(mul);
    }

    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        //manually assigning values
//        arr[0][0]=1;
//        arr[0][1]=1;
//        arr[0][2]=1;....... and so on

        //array literals for assigning values
//        int[][] arr2={{1,2,3},{5,6,7},{9,11,56}};
//        print2Darray(arr2);


        //* taking 2D array input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter rows");
//        int r = sc.nextInt();
//        System.out.println("enter col");
//        int c = sc.nextInt();
//        int[][] arr = new int[r][c];
//
//        System.out.println("enter " + r * c + " elements");
//        for (int i = 0; i < r; i++) {                 //row
//            for (int j = 0; j < c; j++) {             //col
//                arr[i][j] = sc.nextInt();
//            }
//            // System.out.println();
//        }
//        print2Darray(arr);
//
//        //* updating element in a 2D array
//        System.out.println("enter element you want to change");
//        int x = sc.nextInt();
//        System.out.println("enter new element you want ");
//        int z = sc.nextInt();
//        for (int i = 0; i < r; i++) {                 //row
//            for (int j = 0; j < c; j++) {
//                if (arr[i][j] == x) {
//                    arr[i][j] = z;
//                }
//            }
//        }
//        print2Darray(arr);

       //addition and multiplication on two 2D arrays
        Scanner sc = new Scanner(System.in);
        System.out.println("taking inputs of matrix 1");
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

        System.out.println("taking inputs of matrix 2");
        System.out.println("enter rows");
        int r2 = sc.nextInt();
        System.out.println("enter col");
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];

        System.out.println("enter " + r2* c2 + " elements");
        for (int i = 0; i < r2; i++) {                 //row
            for (int j = 0; j < c2; j++) {             //col
                b[i][j] = sc.nextInt();
            }
            // System.out.println();
        }
        System.out.println("matrix 1");
        print2Darray(a);
        System.out.println("matrix 2");
        print2Darray(b);


        //add(a,r1,c1,b,r2,c2);
         mul(a,r1,c1,b,r2,c2);



    }
}

