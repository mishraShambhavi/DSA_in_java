//prefix sum problems
import java.util.Scanner;



public class lecture19 {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] PrefixSum(int[] arr){
        int n = arr.length;
        int[] pref=new int[n];
        pref[0]=arr[0];
        for (int i=1;i< arr.length;i++){

                pref[i] = pref[i - 1] + arr[i];

        }
        return pref;
    }

    static void PrefixSumWithoutNewArray(int[] arr){
        int n = arr.length;

        for (int i=1;i< arr.length;i++){

            arr[i] = arr[i - 1] + arr[i];

        }
//        return arr; //if you want to return put int[] data type in static method
        //and remove printarray method in psvm
    }

    static void rangesumBruteForceMethod(int[] arr,int l,int r){
        int n = arr.length;
        int sum=0;
        for (int i=l;i<=r;i++){
             sum+=arr[i];
        }
        System.out.println(sum);
    }

    static int findsumofarray(int[] arr){
        int totalsum=0;
        for (int i=0;i<arr.length;i++) {
            totalsum += arr[i];
        }

        return totalsum;
    }
        static boolean subarray(int[] arr){
        int totalsum= findsumofarray(arr);
        int prefsum=0;
        for (int i=0;i<arr.length;i++){
            prefsum+=arr[i];
            int suffixsum= totalsum-prefsum;
            if (suffixsum==prefsum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter size of array");
//        int n = sc.nextInt();
//        int [] arr = new int[n];
//        System.out.println("enter "+n+" elements");
//        for (int i =0;i< n ;i++){
//            arr[i]= sc.nextInt();
//        }
//        System.out.println("input array-");
//        printArray(arr);

//        //*prefix sum
//        int [] pref= PrefixSum(arr);
//        printArray(pref);
//
//        //* prefix sum without another pref array
//        System.out.println("output prefix array");
//        PrefixSumWithoutNewArray(arr);
//        printArray(arr);

        //* l to r range sum

//        System.out.println("enter "+n+" elements");
//        for (int i =0;i< n ;i++){
//            arr[i]= sc.nextInt();
//        }
//        System.out.println("input array-");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        System.out.println("output sum for range l and r");
//        rangesumBruteForceMethod(arr,1,4);

        //* optimsed range sum way using prefix sum
//        System.out.println("enter size of array");
//        int n = sc.nextInt();
//        int [] arr = new int[n+1];
//        System.out.println("enter "+n+" elements");
//        for (int i =1;i<= n ;i++){
//            arr[i]= sc.nextInt();
//        }
//        System.out.println("input array-");
//        for (int i = 1; i <= n; i++) {
//            System.out.println(arr[i] + " ");
//        }
//        int[] prefsum=PrefixSum(arr);
//
//        System.out.println("enter number of queries");
//        int q= sc.nextInt();
//
//        while(q>0){
//            System.out.println("enter range l to r");
//            System.out.println("what will be your l?");
//            int l = sc.nextInt();
//            System.out.println("what will be you r?");
//            int r= sc.nextInt();
//            int ans = prefsum[r]-prefsum[l-1];
//
//            System.out.println("sum - "+ans);
//        }

        //*subarray question
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("enter " + n + " elements");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("is the partition possible- "+subarray(arr));
    }
}
