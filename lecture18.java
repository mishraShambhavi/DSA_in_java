//QUESTION ARRAY-TWO POINTERS
import java.util.Scanner;

public class lecture18 {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swapin(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZerosAndOnes(int[] arr){
        int n= arr.length;
        int count=0;
        for (int i=0;i<n;i++){  //traversing to find count of 0s
            if (arr[i]==0){
                count++;
            }
        }
//        for (int i=0;i<n;i++){ //combined with count traversal = 2 for loops
//            if (i<count){
//                arr[i]=0;
//            }else{
//                arr[i]=1;
//            }
//        }

        for (int i=0;i<count;i++){  ///combined with count traversal = 3 for loops
            arr[i]=0;
        }
        for (int i=count;i<n;i++){
            arr[i]=1;
        }

    }

    static void zeroAndoneUsingTwoPointers(int[] arr){
        //more optimised code only 1 loop
        int left = 0;
        int right= arr.length-1;
        while(left<right){
            if (arr[left]==1 && arr[right]==0){
                swapin(arr,left,right);
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }

    static void EvenOddUsingTwoPointers(int[] arr){
        //more optimised code only 1 loop
        int left = 0;
        int right= arr.length-1;

        while(left<right){
            if (arr[left]%2==1 && arr[right]%2==0){
                swapin(arr,left,right);
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
    static void reversewithoutsecondarray(int[] arr)  {
        int i=0 , j= arr.length-1;
        while (i<j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    static int[] SortSquareOfElements(int[] arr){
        int n= arr.length;
        int [] ans = new int[n];
        int left=0, right= arr.length-1;
        int k =n-1;
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k]=arr[left]*arr[left]; //or[k++]
                k--;
                left++;
            }else {
                ans[k--]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for (int i =0;i< n ;i++){
            arr[i]= sc.nextInt();
        }
        //*sort array having 0s and 1s
//        System.out.println("original array-");
//        printArray(arr);
//
//        System.out.println("sorted array-");
//        sortZerosAndOnes(arr);
//        printArray(arr);

        //* sort 0s and 1s using pointers

//        System.out.println("original array-");
//        printArray(arr);
//
//        System.out.println("sorted array-");
//        zeroAndoneUsingTwoPointers(arr);
//        printArray(arr);

        //* sort even odd using 2 pointers
//        System.out.println("original array-");
//        printArray(arr);
//
//        System.out.println("sorted array-");
//        EvenOddUsingTwoPointers(arr);
//        printArray(arr);

        //* non-decreasing square array
        System.out.println("original array-");
        printArray(arr);

        System.out.println("sorted array-");
        int[] ans = SortSquareOfElements(arr);
        //reversewithoutsecondarray(ans);  //since k=n-1
        //if k=0 then we would have used reverse method
        printArray(ans);





    }
}
