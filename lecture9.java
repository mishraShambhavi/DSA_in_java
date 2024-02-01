//questions on loops+ patterns
import java.util.Scanner;

public class lecture9 {
    public static void main(String[] args) {
//        for (int i=1;i<=3;i++){
//            for(int j=1;j<=3;j++){
//                System.out.println("i is "+i+" j is "+j);
//            }
//            System.out.println(); // new line after every ith iteration
        Scanner sc = new Scanner(System.in);


        //RECTANGULAR PATTER
//        int r=sc.nextInt();
//        int c = sc.nextInt();
//        for (int i=1;i<=r;i++){
//            for (int j=1;j<=c;j++){
//                System.out.print("*");
//
//            }
//            System.out.println();


        //HOLLOW RECTANGLE
//        int r=sc.nextInt();
//        int c = sc.nextInt();
//        for (int i=1;i<=r;i++){
//            for (int j=1;j<=c;j++){
//                if (i==1 || i==r  || j==1||j==c) {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
 //        }



        //TRIANGULAR PATTER
//        int r=sc.nextInt();
//
//        for (int i=1;i<=r;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//

        //UPSIDE TRIANGULAR PATTER
//        int r=sc.nextInt();
//        for (int i=r;i>=1;i--) {   //take 1st row as R4 so i=4 and j shows how many stars would be printed=4
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //OR
//        int r=sc.nextInt();
//        for (int i=1;i<=r;i++) {
//            for (int j = 1; j <= r+1-i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//  //      }
//
//                int r=sc.nextInt();
//                for (int i=1;i<=r;i++) { //traversing over rows
//                    //to print r-i spaces
//                  for (int j = 1; j <= r-i; j++) {
//                      System.out.print(" ");
//                  }
//                for (int k =1;k<=(2*i-1) ;k++){
//                    System.out.print("*");
//                }
//
//            System.out.println();
//              }

//        int num= sc.nextInt();
//        for (int i=1;i<=num;i++){
//            for (int j=i;j<=num;j++) {
//                System.out.print(j);
//            }
//                for (int k=1;k<=i-1;k++){
//                    System.out.print(k);
//                }
//                System.out.println();
//
//
//        }
//        int r= sc.nextInt();
//        int c= sc.nextInt();
//        for (int i=1;i<=r;i++){
//            for (int j=1;j<=c;j++){
//                if ((i+j)%2==0) {
//                    System.out.print("1");
//                }
//                else{
//                    System.out.print("2");
//
//                    }
//
//            }
//            System.out.println();
//        }
        int r= sc.nextInt();
//        int c= sc.nextInt();
        for (int i=1;i<=r;++i){
            for (int j=1;j<=r-(r-i);j++){
                System.out.print(j);
            }
            System.out.println();
        }





    }
}
