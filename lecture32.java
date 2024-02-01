public class lecture32 {
    static void printarray(int[] arr,int idx){  //bigger prob ..return kuch ni karega only print

        //base case
        if (idx== arr.length){
            return;
        }

        //self work
        System.out.println(arr[idx]);

        //smaller subproblem or using recursion
        printarray(arr,idx+1);

    }

    static int maxInArray(int[] arr,int idx){
        //base case
        if (idx==arr.length-1){
            return arr[idx];
        }

        //smaller problem --> idx+1 se end tak ka max value lakeh doo
        int smallAns= maxInArray(arr,idx+1);

        //self work
        return Math.max(arr[idx],smallAns);
    }

    static int SumofArray(int[] arr, int idx){
        //base case (also for single element array)
        if (idx==arr.length-1){    //if empty array idx==arr.length
            return arr[idx];
        }
        //smaller problem
        int smallans= SumofArray(arr,idx+1);
        //self work
        return arr[idx]+smallans;

    }

    public static void main(String[] args) {
        int [] arr={5,4,12,4,5,55,3,2};
        //printarray(arr,0);
       // System.out.println(maxInArray(arr,0));
        System.out.println(SumofArray(arr,0));
    }
}
