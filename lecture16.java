import java.util.Scanner;
import java.util.Arrays;

public class lecture16 {
    static int pairsum(int[] arr,int target){  //initialising parameters
        int n =arr.length;
        int ans=0;

        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==target){
                    ans++;


                }
            }
        }
        System.out.println("the number of pairs having sum= target are");
        return ans;

    }
    static int triplesum(int[] arr, int target){
        //making this method static
        // we don't have to create objects in psvm
        int ans=0;
        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j =i+1;j<n;j++){
 //               for (int k=j+1;k<n;k++){
               for (int k=i+1;k<j;k++){
                    if (arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }
        }
        System.out.println("the number of three elements having sum = target are-");
        return ans;

    }

    static int findUnique(int[] arr){


        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;

                }


            }

        }
        int ans=-1;
        for (int i=0;i<n;i++){
            if (arr[i]!=-1){
              ans=arr[i];
            }
        }
        System.out.println("ans is-");

      return ans;
    }

    static int secondLargest(int[] arr){
        Arrays.sort(arr);

        int n = arr.length;
        //System.out.println(arr[n-2]);
        return arr[n-2];
    }

    //same above by array manipulation
    static int findMax(int[] arr){    //to find max of an array
        int mx= Integer.MIN_VALUE;    //mx=-infinity
        for (int i =0;i<arr.length;i++){  // all values compared to mx
            if (arr[i]>mx){
                mx=arr[i]; //mx now stores largest value
            }
        }
        return mx;

    }
    static  int secondmx(int[] arr){
        int mx=findMax(arr);  //largest value
        int n= arr.length;
        for (int i=0;i<n;i++){
            if (arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;  //wherever largest value is present it is replaced by -infinity
            }
        }
        int secondmx=findMax(arr);  //second max is now this statement
        //again finds the largest value
        // since previous largest value is now -infinity it will give second largest value
        return secondmx;
    }
    static int firstRepeat(int[] arr) {
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];

                }


            }


        }
        return -1;

    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for (int i =0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }

//        System.out.println("what is target sum?");
//        int target = sc.nextInt();
       // System.out.println(pairsum(arr,target));
       // System.out.println(triplesum(arr,target));
       // System.out.println(findUnique(arr));
       // System.out.println(secondLargest(arr));
      //  System.out.println(secondmx(arr));
        System.out.println(firstRepeat(arr));

    }
}
