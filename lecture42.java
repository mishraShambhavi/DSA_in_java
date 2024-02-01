public class lecture42 {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int[] arr,int start,int end){
        int pivot=arr[start];
        int count=0;
        for (int i=start+1;i<=end;i++){
            if (arr[i]<=pivot)count++;  //duplicate elements peeche rahenge pivot ke
        }
        int pivotidx=start+count; //start har baar 0 ni hoga issliye we will plus it
        swap(arr,start,pivotidx);
        int i=start, j=end;
        while(i<pivotidx && j>pivotidx) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if (i < pivotidx && j > pivotidx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotidx;
    }
    static void quicksort(int[] arr,int start,int end){
        if (start>=end) return;
        int pi=partition(arr,start,end);
        quicksort(arr,start,pi-1);
        quicksort(arr,pi+1,end);
    }


    public static void main(String[] args) {
        int[] arr={6,9,3,5,4,54,33,7};
        System.out.println("initial array");
        printArray(arr);
        int n=arr.length;
        quicksort(arr,0,n-1);
        System.out.println("after quick sorting ");
        printArray(arr);


    }
}
