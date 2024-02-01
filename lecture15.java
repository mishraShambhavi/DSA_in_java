//input,reference,cloning and copy with questions
import javax.swing.text.Style;

import java.util.Scanner;
import java.util.Arrays;

class Arrays2{
    //taking input array
    void inputarray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for (int i =0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("your array is-");
        for (int i=0;i<n;i++){   //n or arr.length
            System.out.print(arr[i]+" ");
        }

    }

//    void print(){
//
//        int n=
//        for (int i=0;i<n;i++){   //n or arr.length
//            System.out.print(arr[i]+" ");
//        }
// }

    void Clone() {
        int[] arr = {1, 2, 3, 4};
//        int [] arr_2=arr;
//        arr_2[0]=0;
//        arr_2[1]=1;
////        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        } //in above the changes made in copied array were reflected in the original array
        int[] arr_c = arr.clone();
        arr_c[0] = 0;
        arr_c[1] = 0;
        arr_c[2] = 0;
        arr_c[3] = 0;
        for (int i = 0; i < arr_c.length; i++) {
            System.out.println(arr_c[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        } //in above the changes made in copied array were not reflected in the original array

    }
        void count(){
        Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of array");
        int n = sc.nextInt();
        int [] arr= new int[n];
            System.out.println("enter the elements of the array");
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for (int i=0;i<n;i++){
                System.out.println(" "+arr[i]);
            }
            int count=0;
            int x=2;
            for (int i=0;i<n;i++){
                if (arr[i]==x){
                    count+=1;
                }
            }
            System.out.println("the number of occurence"+count);

    }

    void lastocc(){
        int [] arr={2,4,5,2,6};  //3rd index
        int x=9;
        int lastindex=-1;  //if x doesnt exist then we cant put lastindex=0
         for (int i =0;i< arr.length;i++){
             System.out.print(" "+arr[i]);
            if (arr[i]==x){
                //System.out.println(i);
                lastindex=i;
            }
         }
        System.out.print(" -the last index occurence of element x is "+lastindex);
    }
    void greater(){
        int [] arr={2,4,5,2,6};  //3rd index
        int x=6;
        int greatercount=0;
        for (int i =0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
            if (arr[i]>x){
                //System.out.println(i);
                greatercount++;
            }
        }
        System.out.print("the no. of elements greater than x in array"+greatercount);
    }
    void issorted(){
        int [] arr={1,4,5,6};
        boolean check =true; //empty is sorted only
        for (int i=1;i< arr.length;i++){
            if (arr[i]<arr[i-1]){
                //not sorted
                check = false;
                break;
            }
        }
        System.out.println("is the array sorted? "+check);
    }

    void smalllarge(){
        int[] arr ={11,67,43,23,88,100};

        Arrays.sort(arr);
        for (int i=0;i< arr.length;i++){
            System.out.println(" "+arr[i]);

        }
        System.out.println(arr[0]+" : "+arr[arr.length-1]);


    }



}
public class lecture15 {
    public static void main(String[] args) {
        Arrays2 obj = new Arrays2();
       // obj.inputarray();
        //obj.Clone();
        //obj.count();
        //obj.lastocc();
        //obj.greater();
        //obj.issorted();
        //obj.smalllarge();

    }
}
