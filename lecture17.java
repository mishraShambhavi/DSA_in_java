//QUESTIONS array
import java.util.Scanner;


public class lecture17 {
    static void swap(int a, int b) {
        System.out.println("before swap-  " + a + " : " + b);
//        int a=0;
//        int b=0;

        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swap - " + a + " : " + b);
    }

    static void swapwithouttemp(int a, int b) {
        System.out.println("before swap-  " + a + " : " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swap-  " + a + " : " + b);

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] reverse(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[j] = arr[i];
            j++;
        }

        return ans;
    }

    static void swapin(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reversewithoutsecondarray(int[] arr, int i, int j)  { // start end parameters
        // are written for rotate
        // without extra space method for this method use only int[] arr as parameter
//        int len = arr.length;
//        int count = len / 2;
//        for (int i = 0; i < count; i++) {
//            int temp = arr[i];
//            arr[i] = arr[len - 1 - i];
//            arr[len - 1 - i] = temp;
//        }
        //OR

       // int i=0, j= arr.length-1;
        while (i<j){
            //  swapin(arr,i,j);
            // or directly right
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            i++;
            j--;
        }
//        for (int i=0;i< arr.length;i++){
//            for (int j= arr.length-1;j>=0;j--){
//                if (i<j) {
//                    swapin(arr, i, j);
//                }
//            }
//        }
    }

    static int[] rotate(int[] arr, int k) {
        int n = arr.length;

        k = k % n;
        int[] ans = new int[n];
        int x = 0;
        for (int i = n - k; i < n; i++) {
            ans[x++] = arr[i];
        }
        for (int i = 0; i <= n - k - 1; i++) {
            ans[x++] = arr[i];
        }

        return ans;
    }

    static void rotateWithoutExtraSpace(int[] arr, int k) {  //inplace method
        int n = arr.length;
        k = k % n;
        reversewithoutsecondarray(arr, 0, n - k - 1);
        reversewithoutsecondarray(arr, n - k, n - 1);
        reversewithoutsecondarray(arr, 0, n - 1);


    }

    static int[] makeFrequencyArray(int[] arr){
        int [] freq = new int[100005];   //10^5 size in question we took 5 more space for safety
        for(int i =0;i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }






     public static void main(String[] args) {
        // *swap elements
 //       Scanner sc = new Scanner(System.in);
//        System.out.println("enter a");
//        int a= sc.nextInt();
//        System.out.println("enter b");
//        int b = sc.nextInt();
//
//       // swap(a,b);
//       // swapwithouttemp(a,b);

         //*reverse an array
//         int [] arr={1,2,3,4,5};
//         System.out.println("original array");
//         printArray(arr);
//         System.out.println("reversed array");
//        int[] ans=reverse(arr);
//        printArray(ans);
//        //OR
//        for (int i=0;i< ans.length;i++) {
//            System.out.println(ans[i]+" ");
//        }
         //*
//         int [] arr={2,4,5,6,7,8,9};
//         System.out.println("original array-");
//         printArray(arr);
//         System.out.println("same array after reversed without making temporary variable-");
//
//         reversewithoutsecondarray(arr);
//         printArray(arr);

         //*rotate an array
//         int [] arr={2,4,5,6,7};
//         System.out.println("original array-");
//         printArray(arr);
//         System.out.println("array after being rotated-");
//
//         int[] ans=rotate(arr,105);
//         printArray(ans);

         //*rotate an array without extra space(array creation)
//         int [] arr={2,4,5,6,7};
//         System.out.println("original array-");
//         printArray(arr);
//
//         rotateWithoutExtraSpace(arr,3);
//         System.out.println("array after being rotated-");
//         printArray(arr);

         //*CHECK q IS PRESENT OR NOT
         Scanner sc=new Scanner(System.in);
         System.out.println("enter size of array");
         int n = sc.nextInt();
         int [] arr = new int[n];
         System.out.println("enter "+n+" elements");
         for (int i =0;i< n ;i++){
             arr[i]= sc.nextInt();
         }
         int [] freq = makeFrequencyArray(arr);
         System.out.println("enter number of queries");
         int query = sc.nextInt();

         while (query>0){
             System.out.println("enter number to be searched");
             int x= sc.nextInt();
             if (freq[x]>0){
                 System.out.println("yes");
             }else {
                 System.out.println("no");
             }
             query--;
         }





    }

}
